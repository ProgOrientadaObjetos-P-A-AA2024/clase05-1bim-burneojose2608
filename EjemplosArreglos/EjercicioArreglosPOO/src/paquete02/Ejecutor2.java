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
         libreta2.establecerPromedioCualitativo();
         System.out.printf("%s",libreta2);
    }
}
