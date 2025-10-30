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


Transferencia a cuentas
<img width="1303" height="730" alt="image" src="https://github.com/user-attachments/assets/4c03aa63-b092-4360-a4dd-6763bf4513b6" />










