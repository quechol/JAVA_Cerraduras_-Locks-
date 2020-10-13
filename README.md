# JAVA_Cerraduras_-Locks-
En esta práctica se deberá desarrollar el programa de cerradura respetando la naturaleza del algoritmo.
Con la “variable de cerradura” se crea un método Cerradura con la variable booleana compartida llamada cerradura con la cual se puede saber y cambiar el estado de los procesos (Hilos).
Teniendo en cuenta las variables y el problema la codificación es la siguiente.
La clase “Cerradura” cuenta con la variable booleana principal que es cerradura la que nos indicara el estado de los procesos representado en esta, también las funciones para saber el estado (IsCerrada), para abrir la cerradura o para cerrarla, también cuenta con los respectivos getters y setters. 
La clase “Proceso” funcionara como la simulación de un recurso compartido donde se solicitará el estado de la cerradura y la cambiara simulando el uso de un proceso al recurso compartido, metido en un ciclo “while(true)”, que considera la constante atención al recurso por parte de los Hilos.
Por ultimo la clase de “RecursoCompartido” donde se encuentra nuestro “main”.
La ejecución del programa nos muestra cómo se desarrollaría el uso de un recurso compartido a partir de saber el estado de una cerradura y de igual forma la manera de proceder en al finalizar un proceso de forma tal que se cierra la cerradura.
