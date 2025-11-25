package RegistroDeDatos;

import java.util.Scanner;

public class DatosPersonales {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Escriba su nombre: ");
		String Nombres = scanner.next () ;
		System.out.print("Escriba su apellido: ");
		String Apellidos = scanner.next();
		System.out.print("Escriba su correo: ");
		String Correo = scanner.next();
		System.out.print("Escriba su edad: ");
		Integer Edad = scanner.nextInt();
		
        String EstadoCivil = "Soltera";
        
        System.out.println("Mis nombres son:"+" "+Nombres +" "+Apellidos);
        System.out.println("Mis correo es:"+" "+Correo);
        System.out.println("Mis estado civil es:"+" "+EstadoCivil);
        System.out.println("Mis edad es:"+" "+Edad);
	}

}
