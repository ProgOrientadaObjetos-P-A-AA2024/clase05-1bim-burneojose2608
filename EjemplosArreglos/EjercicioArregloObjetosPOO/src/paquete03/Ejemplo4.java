/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete01.Calificacion;
import paquete01.Profesor;

/**
 *
 * @author USUARIO
 */
public class Ejemplo4 {

    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Franco", "nombramiento");
        Profesor profesor2 = new Profesor("Richar ", "contrato");

        // crear un arreglo de objetos de tipo Calificacion
        Calificacion[] calificaciones = new Calificacion[2];

        Calificacion c = new Calificacion(10, "Computación", profesor1);
        Calificacion c2 = new Calificacion(9, "Electrónica", profesor2);

        calificaciones[0] = c;
        calificaciones[1] = c2;

        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f - Profesor(%s - %s)\n",
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota(),
                    // Me sirve para porder presentar valores de otras clases 
                    // y presentarlas en otras clases
                    objetoCalificacion.obtenerProfesor().obtenerNombre(),
                    objetoCalificacion.obtenerProfesor().obtenerTipo());

        }
    }    
}




