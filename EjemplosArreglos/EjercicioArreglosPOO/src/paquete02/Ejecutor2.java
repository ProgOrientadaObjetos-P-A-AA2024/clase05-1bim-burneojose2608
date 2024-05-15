/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;
import paquete01.LibretaCalificacion;

/**
 *
 * @author USUARIO
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        double [] notas = {10,9,8,10};
        String nombreEstudiantes = "rene";
         LibretaCalificacion libreta2 = new LibretaCalificacion(nombreEstudiantes,
                notas);
         libreta2.establecerPromedio();
         /*
         si es que esta linea no la pongo nose va a presentar ningun valor y se
         va tomar un valor por defecto que seria null 
         */
         libreta2.establecerPromedioCualitativo();
         /*
         si es que esta linea en este program no se la pone al rato de correr el
         programa no se va apresentar ningun promedio culitattivo y se va dar uno
         por defecto que seria el null
         */
         System.out.printf("%s",libreta2);
    }
}
