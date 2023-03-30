package hola.mundo;

import java.util.Scanner;

public class Matricula {
public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);

System.out.println("Proporciona tu nombre y apellidos:");
String nombreConApellidos = consola.nextLine();

System.out.println("Proporciona tu DNI:");
String DNI = consola.nextLine();

System.out.println("Proporciona el precio de matricula:");
double precioMatricula = Double.parseDouble(consola.nextLine());
System.out.println("El precio de la matricula es: " + precioMatricula);

System.out.println("Clase virtual?");
boolean claseVirtual = Boolean.parseBoolean(consola.nextLine());
    System.out.println("Nombre y apellidos: " + nombreConApellidos + ""
            + "DNI: " + DNI + ""
                    + "Precio de matricula: " + precioMatricula + "Clase Virtual: " + claseVirtual);


}
}

////Se solicita capturar la siguiente información de un estudiante:
//nombre (String)
//dni (String)
//precioMatricula (double)
//claseVirtual (boolean)
//Tu tarea es imprimir un mensaje en el siguiente formato:
//Proporciona el nombre y apellidos del estudiante:
//Proporciona el dni:
//Proporciona el precio de Matrícula:
//Proporciona si es clase virtual:
//<nombre> dni:< dni >
//Precio: <simbolo>< precioMatricula >
//ClaseVirtual: <claseVirtual>
//Por ejemplo:
//Proporciona el nombre:
//Luis Gómez Pérez
//Proporciona el dni:
//06816524E
//Proporciona el precio de matrícula:
//300
//Proporciona si la clase es virtual:
//true
//Luis Gómez Pérez dni:06816524E
//Precio de matrícula: 300,00 €
//Clase Virtual: true//
