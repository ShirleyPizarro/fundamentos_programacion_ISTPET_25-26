package Scanner;

import java.util.Scanner;

public class NombreApellido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		String Nombres = sc.nextLine();
		System.out.println("Ingrese su Apellido: ");
		String Apellidos = sc.nextLine();
		System.out.println("ingrese su edad: ");
		Integer Edad = sc.nextInt();
		System.out.println("ingrese su Altura: ");
		String Altura = sc.next();
		System.out.println("ingrese su Estado Civil: ");
		String EstadoCivil = sc.next();
		
		sc.close();
		
		System.out.println("yo me llamo: "+ Nombres +" " +Apellidos); 
		System.out.println("Mi edad es: "+ Edad);
		System.out.println("Mi altura es: "+ Altura);
		System.out.println("Mi Estado Civil es: "+ EstadoCivil);
	}

}
