//import java.util.Scanner;
////
////public class Programa1 {
////
////    public static void main(String[] args) {
//
////        double r = 4.5;
////        int x = (int) r; //casting
////
////        System.out.println("r = " + r);
////        System.out.println("x = " + x);
////
//
////        byte b = 64;
////        //char n = b;
////        char n= (char) b;
////        
////        System.out.println("b = " + b);
////        System.out.println("n = " + n);
//
//
////        float r = 3.4f;
////        //long l = r;  //error
////        long l = (long) r;
////        System.out.println("r = " + r);
////        System.out.println("l = " + l);
////
////    }
////}
//
//
//public class ServicioEco {
//
//public static void main(String[] args) {
//
////Lee la entrada del usuario y lo almacena en la variable scanner
//Scanner scanner = new Scanner(System.in);
//
//// Solicita el mensaje
//System.out.println("Introduce un mensaje: ");
//
////Lee la cadena escrita por el usuario y lo asigna a la variable mensaje
//String mensaje = scanner.nextLine(); //nextLine lee una linea completa
//
//// Imprime el mensaje introducido por el usuario
//System.out.println("Tu mensaje es: "+mensaje);
//}
//}


package holamundo;

import java.util.Scanner;

public class ServicioEcoNombre {
public static void main(String[] args) {
Scanner consola = new Scanner(System.in);

System.out.println("Escribe tu nombre:");
String nombre = consola.nextLine();

System.out.println("Escribe tus apellidos:");
String apellidos = consola.nextLine();

System.out.println("Tu nombre es: " + nombre );
System.out.println("Tus apellidos son: " + apellidos);

System.out.println("Tu nombre completo es: " + "nombre" +" "+ apellidos);
}
}