# Formulario de Bolsa de Trabajo con Validación

Este proyecto es un formulario web para una bolsa de trabajo que incluye validación de datos en el lado del servidor y del cliente. Está diseñado para demostrar el desarrollo de una aplicación empresarial completa utilizando tecnologías de Java y el ecosistema Jakarta EE.

## 🚀 Tecnologías Utilizadas

* **Java**: El proyecto utiliza **Java** como el lenguaje de programación principal.
* **Jakarta EE**: La aplicación se basa en la plataforma **Jakarta EE**, específicamente en la versión 11.0.0-M1.
* **Jakarta Server Faces (JSF)**: Utilizado para la construcción de la interfaz de usuario web y la gestión del ciclo de vida de la página.
* **Facelets**: Empleado como la tecnología de vistas para JSF.
* **Maven**: Un robusto gestor de dependencias y herramienta de automatización de construcción.
* **SLF4J**: Una fachada de logging para gestionar los registros de la aplicación.
* **Servidor de Aplicaciones**: Glassfish Server versión 8.0.0.

## 🛠️ Requisitos del Sistema

Para ejecutar este proyecto, necesitas tener instalado:

* **JDK 21** o superior
* **Maven** 3.9.5 o superior
* **Glassfish Server 8.0.0**
* Si no tienes el servidor instalado, puedes seguir las instrucciones detalladas en el archivo [readmeInstallGlassfishServer8.0.0.md](./src/main/java/beans/Documentation/readmeInstallGlassfishServer8.0.0.md).

## 📦 Ejecución del Proyecto

Este proyecto está configurado para ser ejecutado directamente desde un IDE compatible con Java  en este caso Apache NetBeans IDE 26. Al ejecutar el proyecto, el IDE se encargará automáticamente de la compilación y el despliegue en el servidor de aplicaciones configurado.

Para ejecutar:

1.  Abre el proyecto en tu IDE.
2.  Configura el servidor GlassFish en el IDE.
3.  Haz clic derecho en el proyecto y selecciona la opción "Run" (Ejecutar).

El IDE compilará el código, empaquetará la aplicación como un archivo `.war` y la desplegará en tu servidor GlassFish.

## 📂 Estructura del Proyecto

La estructura del proyecto sigue las convenciones de Maven para proyectos web (`war`):

```
FaceletsJSF/
├── src/
│   ├── main/
│   │   ├── java/              # Código fuente de las clases Java
│   │   ├── resources/         # Archivos de configuración
│   │   └── webapp/            # Archivos web (XHTML, CSS, JS)
│   │       ├── WEB-INF/       # Descriptor de despliegue web.xml
│   │       └── recursos/      # Hojas de estilo y scripts
│   │       └── index.xhtml    # Página de inicio del formulario
│   │
├── pom.xml                # Archivo de configuración de Maven
└── README.md
```

## Licencia y Autor

1. Todos los derechos y permisos estas reservados unicamenta al autor de este repositorio y creador inicial usuario github @jherraizsoler con nombre Jorge Herraiz Soler 
2. Prohibido reutilizar, modificar, copiar, presentar, realizar un fork o clone de este proyecto o copiar, reutilizar este codigo sin el permiso del autor @jherraizsoler.
