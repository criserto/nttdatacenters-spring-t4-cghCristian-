package nttdatacenters.spring.Controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import nttdatacenters.spring.Entities.Client;
import nttdatacenters.spring.Repository.ClientRepository;

@Controller
public class ClientController {
	
	@Autowired
	private ClientRepository clientRepository;

    private static final Logger log = LoggerFactory.getLogger(ClientController.class);

    @GetMapping("/menu")
    public String menu() {

        log.info("[Cotroller Vista - /clientes] Muestro opciones");
        return "index";
    }
    
    @GetMapping("/clientes")
    public String clientes() {

        log.info("[Cotroller Vista - /clientes] Muestro clientes");
        return "muestroClientes";
    }
    
    @GetMapping("/clientes/create")
    public String clientesCreate() {

        log.info("[Cotroller Vista - /clientes/create] Crear clientes");
        return "agregoClientes";
    }
    
    @PostMapping("/clientes/create")
    public String clientesCreate(@ModelAttribute("client") Client client, BindingResult result, Model model) {
    	
    	
        log.info("[Cotroller Vista - /clientes/create] Cliente " + client);

        if(clientRepository.existsByDni(client.getDni())) {
        	return "clienteGuardadoFallido";

        }
        
    	clientRepository.save(client);
    	
    	return "clienteGuardado";
        
    }

    @GetMapping("/clientes/info")
    public String clientesInfo() {

        log.info("[Cotroller Vista - /clientes/info] Consultar cliente");
    	return "consultarCliente";
    }
}