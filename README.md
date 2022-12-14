# nttdatacenters-spring-t4-t5-cghCristian-
Ejercicio T4/T5 Spring

   <p align="left">
   <img src="https://img.shields.io/badge/STATUS-EN%20DESAROLLO-green">
   </p>
<h1 align="center">*VERSI脫N ADAPTADA DE LA T3*</h1>

<p>He querido personalizar un poco la idea del ejercicio con el fin de poder mostraros que puedo ser polivalente, tanto con el front (consumo de api, construir elementos de forma din谩mica) como con el back (creaci贸n de apis, entidades...).</p>

<h2>馃殌 Tecnolog铆as usadas:</h2>

* Java +8
* Spring Boot + Web + JPA
* H2
* Swagger
* JavaScript
* BindingResult
* Thymeleaf
* Consumo de API con postman

<h2>馃啋 Extras:</h2>

* Thymeleaf para la creaci贸n de un nuevo cliente, se valida con BindingResult, si se localiza un error se muestra en el log y se carga nuevamente el formulario de registro.
* JavaScript consumiendo nuestra propia API para la generaci贸n de los clientes almacenados y eliminaci贸n de cada uno por acci贸n de bot贸n.
* Se agrega la colecci贸n de postman para importar y realizar consultas a la API
* Generaci贸n de documentaci贸n de la API con Swagger accendiendo a la URL -> http://localhost:8080/swagger-ui/

<h3><i>Resumen de ejercicio t4 propuesto:</i></h3>

* Crear una entidad cliente con columnas (ID, Nombre, Apellidos, Fecha de nacimiento, DNI que ser谩 煤nico).
* Crear una vista con men煤 de opciones para realizar CRUD b谩sico (en este punto como curiosidad use tanto Thymeleaf para una acci贸n (crear cliente) como JavaScript (para mostrar todos, eliminar cliente por ID y consultar cliente por ID):

- `Opci贸n 1 - Vista mostrar clientes`: Mostrar todos los clientes y f谩cilitar un boton para eliminar uno a uno.
- `Opci贸n 2 - Crear cliente`: Crear cliente nuevo.
- `Opci贸n 3 - Vista consultar cliente por ID`: Obtener un cliente por ID.

<h3><i>Resumen de ejercicio t5 propuesto:</i></h3>

* Crear API Rest con los siguientes m茅todos CRUD :

- `Opci贸n 1 - Obtener todos los clientes`: Mostrar todos los clientes y f谩cilitar un boton para eliminar uno a uno.
- `Opci贸n 2 - Obtener cliente por ID`: Obtener cliente por ID.
- `Opci贸n 3 - Crear cliente`: Crear un nuevo cliente.
- `Opci贸n 4 - Actualizar cliente`: Actualizar cliente.
- `Opci贸n 5 - Eliminar cliente por ID`: Obtener un cliente por ID.
- `Opci贸n 6 - Eliminar todos`: Obtener todos los clientes.

<h2 align="center">鈿狅笍 Las distintas llamadas a los endpoints registrar谩n logs 鈿狅笍</h2>
<h2 align="center">鈿狅笍 No he sabido como ubicar una clase Service en todo esto, con DTO tendr铆a m谩s sentido 鈿狅笍</h2>

