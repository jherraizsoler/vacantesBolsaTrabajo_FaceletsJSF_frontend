

**Readme realizado por Jorge Herraiz Soler  este tiene todos los derechos**
      
       - Prohibido distribuir este readme de ninguna forma sin el 
         consentimiento  del autor
         

# Procedimiento para Instalación Server glassfish 8.0.0  (Netbeans)



## REQUERIMIENTOS TECNICOS  Y  PRACTICOS

1. Tener Apache Netbeans IDE 26  
 
2. Tener instalado el jdk-21   
   | java -version 21.0.7 | 


## PROCEDIMENTO  INSTALL   GLASSFISH  SERVER 

1. Nos vamos a la pestaña Services 
   (En caso de no encontrarlo  Arriba en el toolbar |  Window  > Services)

2. Dentro de la ventana Add Server Instance (En el paso Choose Server) 
    > Relizamos click derecho  en Servers y nos saldrá  "Add Server" le damos 
       click
    > Ahora seleccionamos GlashFish Server le podemos cambiar el nombre y le 
       damos en  Next

3. Dentro de la ventana Add Server Instance (En el paso Server Location) 
    > Ahora seleccionamos GlashFish Server le podemos cambiar la localización
       de la instalación.
    > En nuestro caso mantenemos seleccionado "Local Domain"
    > En Choose server to download seleccionamos la version de 
       GlassFish Server 8.0.0
    > Después vamos a seleccionar el checkbox "I have read and accept 
       the licence agreetment.. (click)"
    > Ahora le damos al botón "Download Now ..." 
    > Una vez descargado le damos en "Next"
    
4. Dentro de la ventana Add Server Instance (En el paso Domain Name/Location) 
    > Domain: domain1 o si quieres customizar el dominio ten lo encuenta
               para los proyectos y debbug.
    > Host: localhost
    > Loopback: Seleccionado
    > Default: Seleccionado
    > DAS Port: 4848    
    > HTTP Port: 8080
    > Target  |   User Name  |  Password vacios

5. Pulsamos en "Finish"
    
