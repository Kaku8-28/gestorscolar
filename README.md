# gestorscolar
# Taller Sistema de Gestión Escolar (Java MVC + MySQL)

## Kevin David Cuero Anchico
## 411
## Programacion II

## Descripción del proyecto
El **Sistema de Gestión Escolar** es una aplicación desarrollada en **Java** utilizando el patrón de diseño **MVC (Modelo-Vista-Controlador)** y una base de datos **MySQL**.  
El proyecto permite gestionar de forma sencilla la información de **estudiantes, profesores y cursos**, mostrando los datos desde una interfaz gráfica construida con **Java Swing**.


---

## Tecnologías utilizadas

- **Lenguaje:** Java 21  
- **Patrón de diseño:** MVC  
- **Interfaz gráfica:** Java Swing  
- **Base de datos:** MySQL (Workbench)  
- **Gestor de dependencias:** Maven  

---


---


---

## Configuración de la base de datos

1. Abre **MySQL Workbench**.  
2. Crea la base de datos ejecutando el archivo `schemaMySQL.sql`.  
3. Verifica que se hayan creado las tablas:
   - `profesores`
   - `cursos`
   - `estudiantes`
4. En el archivo `config.properties`, configura los siguientes datos según tu entorno local:


db.driver=com.mysql.cj.jdbc.Driver
db.url=jdbc:mysql://localhost:3306/gestionescolar?useSSL=false&serverTimezone=UTC
db.user=root
db.password=052804







