Tenemos la carpeta llamada Bank despues de descomprimir, luego le damos en VSC abrir carpeta para cargar todos los archivos del codigo.
<img width="1357" height="768" alt="image" src="https://github.com/user-attachments/assets/91d51601-f340-44fb-9a93-baeba5634d9d" />

Estructura del proyecto BANK

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

Estructura del proyecto appbank

Dentro del proyecto appbank se muestran las carpetas principales del código.
La carpeta src/main/java contiene las clases y el código fuente principal del programa.
src/main/resources guarda archivos de configuración o recursos que usa el sistema.
src/test/java se usa para pruebas del código.
JRE System Library contiene las librerías básicas de Java necesarias para ejecutar el programa.
Maven Dependencies muestra las dependencias externas que usa el proyecto.
Las demás carpetas y archivos como .mvn, data, target, pom.xml y README.md son parte de la estructura general del proyecto.

<img width="329" height="417" alt="image" src="https://github.com/user-attachments/assets/4b1aaf4d-fff0-40e0-ba25-0c254e915814" />

Estructura del código en src/main/java

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

Clases principales del proyecto

En esta parte se muestran las clases dentro del paquete com.logsoluprobl.appbank.
El paquete controller tiene la clase BankController, que maneja las acciones y peticiones del sistema.
En exception está DomainException, que controla los errores.
El paquete model contiene las clases que representan los datos del banco, como Account, CheckingAccount, SavingsAccount, Customer, Money y Transaction.
En repository están FileManager y JsonRepository, encargadas de guardar y leer la información.
El paquete service contiene la lógica del negocio con las clases BankService y BankServiceImpl, y dentro de strategies se encuentran SimpleRateStrategy y TieredRateStrategy, que definen diferentes formas de calcular tasas o intereses.

<img width="299" height="526" alt="image" src="https://github.com/user-attachments/assets/29d01f3c-b5e1-4bb1-a3ce-c1d5a828eca0" />

















