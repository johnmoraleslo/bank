Tenemos la carpeta llamada Bank despues de descomprimir, luego le damos en VSC abrir carpeta para cargar todos los archivos del codigo.
<img width="1115" height="609" alt="image" src="https://github.com/user-attachments/assets/63cd4340-da4e-4005-b108-b005e48e462e" />


**Estructura del proyecto BANK**

La carpeta BANK es el proyecto principal.
La carpeta .mvn contiene configuraciones de Maven.
Data guarda archivos o bases de datos del sistema.
Docs se usa para la documentación.
Src contiene el código fuente en Java.
Target guarda los archivos generados al compilar.
Los archivos .gitignore y .gitattributes son para control de versiones con Git.
Mvnw y mvnw.cmd permiten ejecutar Maven sin instalarlo.
Pom.xml es el archivo principal de configuración del proyecto.
Readme.md describe el proyecto y explica cómo usarlo.
Appbank en Java Projects muestra el proyecto listo para compilar y ejecutar.

<img width="388" height="473" alt="image" src="https://github.com/user-attachments/assets/30037000-ee09-448f-bc18-feea31e35771" />

**Estructura del proyecto appbank**

Dentro del proyecto appbank se muestran las carpetas principales del código.
La carpeta src/main/java contiene las clases y el código fuente principal del programa.
src/main/resources guarda archivos de configuración o recursos que usa el sistema.
src/test/java se usa para pruebas del código.
JRE System Library contiene las librerías básicas de Java necesarias para ejecutar el programa.
Maven Dependencies muestra las dependencias externas que usa el proyecto.
Las demás carpetas y archivos como .mvn, data, target, pom.xml y README.md son parte de la estructura general del proyecto.

<img width="329" height="417" alt="image" src="https://github.com/user-attachments/assets/4b1aaf4d-fff0-40e0-ba25-0c254e915814" />

**Estructura del código en src/main/java**

Dentro de la carpeta src/main/java se encuentra el paquete principal del proyecto com.logsoluprobl.appbank.
Dentro de este paquete se organizan las clases según su función:
controller maneja las peticiones y respuestas del sistema
exception gestiona los errores o excepciones
model contiene las clases que representan los datos
repository maneja la conexión con la base de datos
service contiene la lógica principal del programa
y util guarda funciones o herramientas de apoyo
El archivo AppbankApplication es el punto de inicio del proyecto, desde donde se ejecuta la aplicación.

<img width="411" height="204" alt="image" src="https://github.com/user-attachments/assets/34897eea-03be-406b-96bd-fb756e0555dc" />

**Clases principales del proyecto**

En esta parte se muestran las clases dentro del paquete com.logsoluprobl.appbank.
El paquete controller tiene la clase BankController, que maneja las acciones y peticiones del sistema.
En exception está DomainException, que controla los errores.
El paquete model contiene las clases que representan los datos del banco, como Account, CheckingAccount, SavingsAccount, Customer, Money y Transaction.
En repository están FileManager y JsonRepository, encargadas de guardar y leer la información.
El paquete service contiene la lógica del negocio con las clases BankService y BankServiceImpl, y dentro de strategies se encuentran SimpleRateStrategy y TieredRateStrategy, que definen diferentes formas de calcular tasas o intereses.

<img width="299" height="526" alt="image" src="https://github.com/user-attachments/assets/29d01f3c-b5e1-4bb1-a3ce-c1d5a828eca0" />

**Ejecución del proyecto y uso de Thunder Client**

En esta parte se muestra el proyecto ejecutándose en Spring Boot, como se ve en la terminal con el logo de Spring.
En la parte superior se usa la extensión Thunder Client, una herramienta dentro de VS Code que permite hacer pruebas a las rutas o servicios del proyecto, similar a Postman.
Aquí se pueden enviar peticiones GET, POST, PUT o DELETE para comprobar que las funciones del sistema respondan correctamente.

<img width="1346" height="712" alt="image" src="https://github.com/user-attachments/assets/4c4939e2-4f3e-48c9-800a-49c1deb5a134" />

el sistema se inicia en un servidor local (localhost:8080)
<img width="1003" height="312" alt="image" src="https://github.com/user-attachments/assets/43c75d74-d522-427e-9039-09ccc39450a6" />

Cuando realizamos la busqueda en en el navegador nos arroja el siguiente error. Esto significa que Spring Boot está corriendo correctamente, pero no encontró ningún endpoint mapeado en la ruta

<img width="1129" height="607" alt="image" src="https://github.com/user-attachments/assets/cffb591f-d9f1-4a5e-b13b-fc37b5c157a2" />


Cuando realizamos el cambio de busqueda, solicitando una busqueda especifica como:
http://localhost:8080/api/bank/customers se obtiene ya la informacion incial solo que aun no tenemos datos ingresados

<img width="444" height="201" alt="image" src="https://github.com/user-attachments/assets/cd9fd9ea-9f38-45aa-aadc-91f6ff0219f2" />


**Para el ingreso de datos descargamos la extención Thunder Client utilizando GET, POST, PUT o DELETE** 

Paso a paso para agregar un cliente en mi aplicación bancaria
Abrí Thunder Client desde Visual Studio Code para probar mi API.
En la barra de dirección seleccioné el método POST y escribí la ruta:http://localhost:8080/api/bank/customers
Luego, entré a la pestaña Body.
Marqué la opción raw y seleccioné el formato JSON.
En el cuadro de texto escribí los datos del cliente en formato JSON.
Presioné el botón Send para enviar la solicitud al servidor.
En la parte derecha (sección de Response) me apareció el código 201 Created, indicando que el cliente fue registrado correctamente.
Finalmente, confirmé que los datos se guardaron al hacer una petición GET a: http://localhost:8080/api/bank/customers

<img width="1009" height="699" alt="image" src="https://github.com/user-attachments/assets/6ca32497-c11b-4aa1-aff6-edc88ff551dc" />


luego despues de recargar la url nos sale la informacion ingresada 

<img width="1361" height="768" alt="image" src="https://github.com/user-attachments/assets/cb9d286b-49f7-4a75-b82b-1a5f961493b3" />


EN CONCLUSION GENERAL

**Como funciona una solicitud (request)**
Cuando envío una petición desde Thunder Client, por ejemplo, para crear un cliente, la solicitud entra por el controlador BankController.
El método correspondiente recibe los datos, valida la información y luego llama al servicio BankService, que se encarga de crear el cliente y guardarlo usando el repositorio

**Gestión de cuentas y transacciones**
Cada cliente puede tener diferentes tipos de cuentas, como SavingsAccount o CheckingAccount.
Dependiendo del tipo, se aplican reglas distintas para intereses o sobregiros.
También puedo hacer operaciones como depósitos, retiros o transferencias entre cuentas usando los endpoints correspondientes del controlador.

**guardado de datos**
Los datos no se pierden mientras la aplicación está corriendo, ya que uso un JsonRepository que guarda y lee la información desde archivos JSON en el proyecto.
Esto permite simular una base de datos sin necesidad de usar un servidor SQL.

**Manejo de excepciones**
Para evitar errores no controlados, creé una clase DomainException.
Cada vez que ocurre un problema (como saldo insuficiente o tipo de cuenta inválido), lanzo esta excepción y la manejo en el controlador con un @ExceptionHandler para devolver un mensaje claro al usuario.
**Pruebas con Thunder Client**
Usé Thunder Client para probar cada endpoint: crear clientes, crear cuentas, hacer depósitos, retiros y transferencias.
Esto me ayudó a verificar que todas las operaciones respondieran correctamente con códigos HTTP adecuados 201, 200 o 400 en caso de error

*Con este proyecto logré entender cómo funciona una aplicación Spring Boot completa, desde el controlador hasta la persistencia de datos.
La estructura modular me permitió mantener el código limpio y aplicar principios de programación orientada a objetos*

** Segunda entrega del proyecto Bank con ejecuciones**

Controlador de nuestra app esta formada por:
<img width="1317" height="665" alt="image" src="https://github.com/user-attachments/assets/310080ad-ae60-48c8-ab4d-79787097da1a" />
🧭 Qué es Swagger / OpenAPI
Swagger (ahora llamado OpenAPI UI) es una interfaz visual que permite:
Ver todos los endpoints de una API.
Conocer qué método HTTP (GET, POST, etc.) usa cada uno.
Probar directamente las solicitudes (enviar parámetros, ver respuestas, errores, etc.).

📚 Descripción de los métodos del controlador bancario
Método	Endpoint	Descripción	Tipo de operación
GET	/api/banco/clientes	Obtiene la lista de todos los clientes del banco.	Consulta
POST	/api/banco/clientes	Crea un nuevo cliente en el sistema.	Creación
GET	/api/banco/clientes/{customerId}/cuentas	Muestra todas las cuentas asociadas a un cliente específico.	Consulta
POST	/api/banco/clientes/{customerId}/cuentas	Crea una nueva cuenta para el cliente indicado.	Creación
POST	/api/banco/cuentas/{fromAccountId}/transferencia	Realiza una transferencia desde una cuenta a otra.	Operación
POST	/api/banco/cuentas/{accountId}/retirar	Retira dinero de una cuenta.	Operación
POST	/api/banco/cuentas/{accountId}/depósito	Deposita dinero en una cuenta.	Operación
POST	/api/banco/cuentas/{accountId}/aplicar-interés	Aplica interés a una cuenta (por ejemplo, de ahorro).	Operación
GET	/api/banco/clientes/{customerId}	Obtiene la información de un cliente específico.	Consulta
GET	/api/banco/cuentas/{accountId}	Obtiene la información de una cuenta específica.	Consulta
GET	/api/banco/cuentas/{accountId}/transacciones	Lista todas las transacciones de una cuenta.	Consulta

**En resumen, este panel me sirve para entender cómo funciona la API del banco y probar todas sus funcionalidades sin tener que usar otra herramienta externa. Aquí puedo crear clientes, abrir cuentas, hacer depósitos, retiros, transferencias o consultar transacciones, todo desde un solo lugar.**

como se mensiono anteriormente en esta parte podemos ingresar un cliente por medio de POST y tambien podemos traer informacion o buscar con GET
<img width="1327" height="596" alt="image" src="https://github.com/user-attachments/assets/14658b42-c774-477b-9203-0a6a08bce3b0" />
<img width="1336" height="763" alt="image" src="https://github.com/user-attachments/assets/fc1ef6c3-a01a-4d7b-b803-7b80b68d8efa" />


🟦 1. GET /api/banco/clientes

En esta parte puedo consultar la lista de todos los clientes registrados en el banco.
Cuando ejecuto esta solicitud, el sistema me devuelve un listado con los datos de cada cliente, como su nombre, número de identificación y las cuentas que posee.
Este endpoint me sirve principalmente para ver la información general del banco y asegurarme de que los registros de clientes se estén guardando correctamente.

🟩 2. POST /api/banco/clientes

Aquí tengo la opción de crear un nuevo cliente dentro del sistema.
Swagger me permite ingresar los datos del cliente en formato JSON, como su nombre, dirección o número de identificación, y luego presiono “Execute” para enviar la información.
Si todo está correcto, la API responde con un mensaje confirmando que el cliente fue creado exitosamente.
Este endpoint es útil cuando necesito registrar un nuevo usuario en el banco.

🟦 3. GET /api/banco/clientes/{customerId}/cuentas

Este endpoint me permite ver todas las cuentas asociadas a un cliente específico.
Solo tengo que escribir el customerId (por ejemplo, “C001”) y al ejecutar la consulta, el sistema me muestra todas las cuentas que pertenecen a ese cliente, junto con su tipo (ahorros, corriente, etc.) y su saldo actual.
Lo uso para consultar la información financiera de un cliente en particular.

🟩 4. POST /api/banco/clientes/{customerId}/cuentas

Con este método puedo crear una nueva cuenta para un cliente ya existente.
Debo ingresar el customerId y en el cuerpo del JSON puedo especificar detalles como el tipo de cuenta y el saldo inicial.
Al ejecutar, la API registra la nueva cuenta en el sistema y la asocia automáticamente al cliente correspondiente.

🟩 5. POST /api/banco/cuentas/{fromAccountId}/transferencia

Este es el endpoint que permite realizar una transferencia entre cuentas.
Ingreso el número de la cuenta de origen (fromAccountId) y en el cuerpo de la solicitud indico la cuenta de destino (toAccountId) junto con el monto que deseo transferir.
Al ejecutar, el sistema verifica los datos y realiza el movimiento de dinero, mostrando una respuesta con el resultado de la operación.
<img width="1303" height="730" alt="image" src="https://github.com/user-attachments/assets/4c03aa63-b092-4360-a4dd-6763bf4513b6" />

🟩 6. POST /api/banco/cuentas/{accountId}/retirar

En este endpoint puedo realizar un retiro de dinero desde una cuenta específica.
Indico el accountId y el monto que deseo retirar en el cuerpo del JSON.
Cuando ejecuto la solicitud, el sistema descuenta el dinero de la cuenta y me devuelve un mensaje con el nuevo saldo.
Lo uso para probar que el sistema de retiros funcione correctamente y actualice los saldos.
<img width="1351" height="767" alt="image" src="https://github.com/user-attachments/assets/988d1d23-3d15-4c26-b8a3-4ab47c653c29" />


🟩 7. POST /api/banco/cuentas/{accountId}/depósito

Esta opción sirve para hacer un depósito en una cuenta determinada.
Solo ingreso el accountId y el monto que quiero depositar.
Después de ejecutar la operación, el sistema aumenta el saldo de esa cuenta y me muestra la confirmación con el valor actualizado.
Este endpoint me permite comprobar que los depósitos se registren correctamente en la base de datos.
<img width="1341" height="766" alt="image" src="https://github.com/user-attachments/assets/6f5fb098-e52e-4d25-8d50-6af8aa8b62f3" />


🟩 8. POST /api/banco/cuentas/{accountId}/aplicar-interés

Aquí puedo aplicar intereses a una cuenta, generalmente de tipo ahorro.
Ingreso el accountId y, si la cuenta es válida, el sistema calcula el interés según la tasa configurada y actualiza el saldo automáticamente.
Este endpoint es muy útil para simular el crecimiento del dinero con intereses dentro del sistema bancario.
<img width="1096" height="541" alt="image" src="https://github.com/user-attachments/assets/f5f811ef-356b-4f42-b5f4-ecb37d3ded25" />

🟦 9. GET /api/banco/clientes/{customerId}

Este endpoint me permite consultar los datos de un cliente en específico.
Escribo el identificador del cliente (customerId) y ejecuto la solicitud.
El sistema me devuelve toda la información relacionada con ese cliente: nombre, dirección, cuentas y otros detalles relevantes.
Lo utilizo cuando necesito verificar información individual de un cliente.

🟦 10. GET /api/banco/cuentas/{accountId}

Aquí puedo ver la información completa de una cuenta.
Al ingresar el accountId, el sistema me muestra el número de cuenta, tipo, saldo actual y estado.
Este endpoint es muy útil para comprobar si las operaciones de depósito o retiro se reflejan correctamente en el saldo.

🟦 11. GET /api/banco/cuentas/{accountId}/transacciones

Este endpoint me permite consultar todas las transacciones realizadas en una cuenta.
Al indicar el accountId, puedo ver un historial detallado con cada movimiento: depósitos, retiros, transferencias, y fechas.
Esta función es esencial para auditar o verificar los movimientos financieros de una cuenta.


Profe tuve muchos problemas con la ejecucion del codigo pero investigando y leyendo cada proceso aprendi  bastante sobre el funcionamiento del controlador 





