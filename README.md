# nttdatacenters-spring-t4-t5-cghCristian-
Ejercicio T4/T5 Spring

   <p align="left">
   <img src="https://img.shields.io/badge/STATUS-EN%20DESAROLLO-green">
   </p>
<h1 align="center">*VERSIÓN ADAPTADA DE LA T3*</h1>

<h2>🚀 Tecnologías usadas:</h2>

* Java +8
* Spring Boot + Web + JPA
* H2
* Swagger
* JavaScript
* Thymeleaf
* Consumo de API con postman

<h2>🆒 Extras:</h2>

* He utilizado tanto Thymeleaf para la creación de un nuevo cliente como JavaScript consumiendo nuestra propia API.
* Se agrega la colección de postman para importar y realizar consultas a la API
* Generación de documentación de la API con Swagger accendiendo a la URL -> http://localhost:8080/swagger-ui/

<h2>:hammer: Errores encontrados:</h2>

* Thymeleaf parece que no se comporta bien con LocalDate, la única forma de crear un usuario mediante el controlador pasa por dejar ese campo a null.

<h3><i>Resumen de ejercicio t4 propuesto:</i></h3>

* Crear una entidad cliente con columnas (ID, Nombre, Apellidos, Fecha de nacimiento, DNI que será único).
* Crear una vista con menú de opciones para realizar CRUD básico (en este punto como curiosidad use tanto Thymeleaf para una acción (crear cliente) como JavaScript (para mostrar todos, eliminar cliente por ID y consultar cliente por ID):

- `Opción 1 - Vista mostrar clientes`: Mostrar todos los clientes y fácilitar un boton para eliminar uno a uno.
- `Opción 2 - Crear cliente`: Crear cliente nuevo.
- `Opción 3 - Vista consultar cliente por ID`: Obtener un cliente por ID.

<h3><i>Resumen de ejercicio t5 propuesto:</i></h3>

* Crear API Rest con los siguientes métodos CRUD :

- `Opción 1 - Obtener todos los clientes`: Mostrar todos los clientes y fácilitar un boton para eliminar uno a uno.
- `Opción 2 - Obtener cliente por ID`: Obtener cliente por ID.
- `Opción 3 - Crear cliente`: Crear un nuevo cliente.
- `Opción 4 - Actualizar cliente`: Actualizar cliente.
- `Opción 5 - Eliminar cliente por ID`: Obtener un cliente por ID.
- `Opción 6 - Eliminar todos`: Obtener todos los clientes.

<h2 align="center">⚠️ Las distintas llamadas a los endpoints registrarán logs ⚠️</h2>
<h2 align="center">⚠️ No he sabido como ubicar una clase Service en todo esto ⚠️</h2>

