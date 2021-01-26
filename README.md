# ProyectoFinal_POO
Proyecto final de Programación Orientada a Objetos 2021

Biblioteca
El proyecto está hecho para ayudar a la administración de una biblioteca. Está diseñado para llevar un registro de libros, usuarios, empleados, los datos de cada uno, así como el registro de los movimientos o procesos realizados en la biblioteca.

  Se creó el proyecto de forma que cumpla con los requisitos necesarios, los cuales son:
  
    -Clases --> Todas las clases cuentan con estos requisitos
      métodos
      getters/setters
      atributos
      constructor(es)
    -herencia simple --> Se crearon diversas clases usando la herencia simple, un ejemplo de esto son la clase Prestamo y la clase Multa, que heredan de Documentos.
    
	  -herencia múltiple --> La herencia multimple se utilizó dentro del apartado gráfico de java.
    
	  -clases abstractas --> Se utilizan clases abstractas junto con la herencia simple, un ejemplo de esta es la clase Persona, que es abstracta.
    
	  -polimorfismo --> Se utilizó en varias clases, un ejemplo es en Biblioteca, las multas y los préstamos se comportan como Documentos, por ello se pueden almacenar juntos.
    
	  -agregación o composición --> Se utlizó principalmente en la clase Biblioteca, esta contiene relaciones de Agregación y de Composición (Empleados, Usuarios y Libros).
    
	  -sobrecarga --> La sobrecarga de métodos se utilizó principalmente con los constructores. Diversas clases contienen más de un constructor que reciben distintos parámetros.
    
	  -sobreescritura --> Se usó principalmente en conjunto con la Herencia simple, se crearon métodos en clases abstractas que se van sobreescribiendo por las clases hijas.
    
	  -atributos y métodos estáticos --> El proyecto cuenta tanto con métodos estáticos como con atributos estáticos. Se utilizaron igual para crear un singleton de Biblioteca.
    
	  -manejo de excepciones --> Muchas de las clases cuentan con manejo de excepciones.
    
	  -manejo archivos o DB --> Se utilizaron archivos .txt para la permanencia de datos. Estos se encuentran dentro de la carpeta del proyecto (Ej: ArchiUsuarios). 
    
	  -uso componentes gráficos --> El proyecto cuenta con diversas ventanas y componentes gráficos para usar el programa.
    
	  -lógica del proyecto y diagrama de clases --> El proyecto cuenta con un diagrama de clases.
    
	  -separación de parte visual y parte lógica --> La parte pesada del código del proyecto fue separada de la parte gráfica. Las ventanas usan una única instancia de Biblioteca.
    
	  -funcionamiento general --> El programa funciona.

  El proyecto está formado por ocho clases principales: Biblioteca, Libro, Persona, Empleado, Usuario, Documentos, Prestamo y Multa.
  
  Biblioteca es la clase principal de este proyecto, las demás clases han sido creadas para la organización de la información de una biblioteca. Cada clase incluye, entre otros métodos, getters y setters, así como constructores especializados.
  
  La clase biblioteca cuenta con un nombre, dirección, teléfono de contacto y correo electrónico. Además de los atributos anteriores, se encuentran declaradas tres listas (ArrayList):
   - Una lista de libros que servirá para buscar un libro en concreto, añadir nuevos libros, eliminarlos y permitirá llevar un conteo del numero de copias de cada libro.
  - Lista de los empleados que trabajan en la biblioteca, con esta lista es posible agregar nuevos empleados, buscar y borrar, así como llevar un registro de sus datos.
  - Lista de usuarios, esta lista permite, además de llevar un registro de los datos más importantes de los usuarios, agregar nuevos usuarios y eliminarlos de la lista.
  
  En la clase libro han sido declarados atributos útiles para el registro de cada libro, un número identificador, el título del libro, autor, editorial, año de edición, número de unidades del libro y número de libros prestados.
  
  La clase Persona es la clase base para Empleado y Usuario. En la clase persona se encuentran datos generales propios de  una persona (nombre, fecha de nacimiento, edad, teléfono, dirección, correo electrónico y una clave identificadora, así como una contraseña) y en las clases que la heredan existen atributos y métodos específicos que servirán para llevar un registro más detallado. 
  La clase Empleado cuenta con los atributos de puesto de trabajo y sueldo. 
  Por otra parte, en la clase Usuario existen el atributo de la fecha de registro del usuario.
  
  La clase Documento es la clase base de las clases Prestamo y Multa. Esta clase cuenta con tres atributos, el ID del usuario al que pertenece, un String con los libros que se tomaron prestados y la fecha en la que se creó el documento. Existen dos tipos de documentos, el préstamo y la multa.
  En la clase Préstamo eixsten atributos que permitirán registrar la fecha en que se prestaron los libros, el plazo esperado de devolución y la fecha real de devolución. 
  La clase Multa se encarga de almacenar los dias fuera del plazo de entrega de los libros, así como el costo de la multa que el usuario deberá pagar por entregar libros fuera del plazo establecido.
