Llanquihue Tour App - Sistema de Gestion de Servicios Turisticos
Este proyecto es una aplicacion de escritorio desarrollada en Java para la agencia "Llanquihue Tour". En esta etapa del desarrollo (Semana 6), el sistema incorpora un modelo jerarquico para organizar, tipificar y administrar los distintos servicios turisticos que ofrece la empresa, optimizando la reutilizacion de codigo mediante la herencia.

Caracteristicas Principales
El sistema ha sido estructurado bajo los principios fundamentales de la Programacion Orientada a Objetos (POO), cumpliendo con los siguientes requerimientos basicos:

Herencia Simple: Se diseño la superclase ServicioTuristico para agrupar los atributos comunes (nombre y duracion en horas), de la cual extienden de forma limpia las subclases de especializacion.

Especializacion de Clases Hijas: Implementacion de tres categorias especificas de servicios con atributos propios de su logica de negocio:

RutaGastronomica: Incorpora la cantidad de paradas de degustacion.

PaseoLacustre: Añade el tipo de embarcacion utilizada.

ExcursionCultural: Registra el lugar historico o patrimonial asociado.

Uso de Constructores de la Superclase: Utilizacion de la instruccion super(...) dentro de los constructores de las clases hijas para inicializar correctamente los atributos heredados.

Sobrescritura de Metodos (Override): Reimplementacion del metodo toString() en cada una de las subclases, invocando super.toString() para consolidar la informacion general y especifica en una sola cadena de texto.

Estructura del Proyecto
La solucion mantiene una organizacion modular distribuida en los siguientes paquetes y componentes:

Plaintext
src/
├── model/          # Jerarquia de clases base (ServicioTuristico, RutaGastronomica, PaseoLacustre, ExcursionCultural)
├── data/           # Logica de negocio e instanciacion (GestionServicio)
└── ui/             # Interfaz de usuario y punto de entrada (Main)
Requisitos del Sistema
Kit de Desarrollo de Java (JDK) version 17 o superior.

Entorno de Desarrollo Integrado (IDE) como IntelliJ IDEA.

Instrucciones de Ejecucion
Descargue el proyecto o clone el repositorio en su maquina local.

Abra la carpeta raiz LlanquihueTourApp desde su IDE.

Asegurese de que el directorio src este configurado como la raiz de codigo fuente ("Sources Root").

Dirigete al paquete ui y abra el archivo Main.java.

Ejecute el metodo principal haciendo clic derecho y seleccionando "Run 'Main.main()'".

El programa desplegara de forma automatica en la consola el catalogo simulado de servicios con sus respectivos datos validados y estructurados.

Proyecto desarrollado en el marco de la asignatura Desarrollo Orientado a Objetos I.

Estudiante: Juan Andrés Alcaino Sereño

Institución: Duoc UC

Año: 2026
