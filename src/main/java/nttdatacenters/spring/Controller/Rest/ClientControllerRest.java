package nttdatacenters.spring.Controller.Rest;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import nttdatacenters.spring.Entities.Client;
import nttdatacenters.spring.Repository.ClientRepository;
import springfox.documentation.annotations.ApiIgnore;

@RestController
public class ClientControllerRest {

	@Autowired
	private ClientRepository clientRepository;

	private final Logger log = LoggerFactory.getLogger(ClientControllerRest.class);

	// OBTENER TODOS LOS LAPTOS
	@CrossOrigin
	@ApiOperation("Obtener todos los clientes")
	@GetMapping("/api/clients")
	public ResponseEntity<List<Client>> findAll() {

		if (clientRepository.findAll().size() > 0) {
			List<Client> listaClientes = clientRepository.findAll();
			return ResponseEntity.ok(listaClientes);
		}
		return ResponseEntity.noContent().build();
	}

	// OBTENER CLIENTE POR ID
	@ApiOperation(value = "Obtener cliente según la clave pasada", notes = "Obtenemos un cliente siempre y cuando la clave pasada (un Long) se encuentre en nuestra BD")
	@GetMapping("/api/clients/{id}")
	public ResponseEntity<Client> findOneById(@ApiParam(value = "Clave tipo Long") @PathVariable Long id) {

		log.info("[ClientControllerRest - findOneById] Obteniendo cliente por Id");

		Optional<Client> clientOptional = clientRepository.findById(id);

		// if (clientOptional.isPresent())
		// return ResponseEntity.ok(clientOptional.get());
		// else
		// return ResponseEntity.notFound().build();

		return clientOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	// CREAR CLIENT
	@ApiOperation("Crear una Client, hay que pasar un JSON para ello, el ID debe ser null o no existir")
	@PostMapping("/api/clients")
	public ResponseEntity<Client> create(@RequestBody Client client, @RequestHeader HttpHeaders headers) {

		log.info("[ClientControllerRest - create] Crear cliente" + client.toString());

		if (client.getId() != null || client.getDni() == null || client.getDni().length() != 9 || clientRepository.existsByDni(client.getDni())) {
			return ResponseEntity.badRequest().build();
		}

		return ResponseEntity.ok(clientRepository.save(client));
	}

	// ACTUALIZAR CLIENT
	@ApiOperation("Actualizar una Client, se debe añadir el ID al cuerpo de la petición")
	@PutMapping("/api/clients")
	public ResponseEntity<Client> update(@ApiParam("Tipo de parámetro en JSON") @RequestBody Client client) {

		log.info("[ClientControllerRest - update] Actualizar cliente por ID" + client.toString());

		if (client.getId() == null) {
			ResponseEntity.badRequest().build();
		}

		if (!clientRepository.existsById(client.getId())) {

			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(clientRepository.save(client));
	}

	// ELIMINAR UN CLIENT

	@ApiIgnore
	@ApiOperation("Elimina una Client por el ID pasado, hay que tener precaución")
	@DeleteMapping("api/clients/{id}")
	public ResponseEntity<Client> delete(@PathVariable Long id) {

		log.info("[ClientControllerRest - delete] Eliminar cliente por ID " + id);

		if (!clientRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}

		clientRepository.deleteById(id);

		return ResponseEntity.noContent().build();
	}
	// ELIMINAR TODOS

	@ApiIgnore
	@ApiOperation("Lo elimina TODO hay que extremar la precaución")
	@DeleteMapping("/api/clients")
	public ResponseEntity<Client> deleteAll() {
		log.info("[ClientControllerRest - deleteAll] Eliminar todos ");

		clientRepository.deleteAll();
		return ResponseEntity.noContent().build();
	}
}
