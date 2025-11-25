package Scanner;

import java.util.Scanner;

public class ConvertorUnidades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la distancia en metros");
		Double metros = sc.nextDouble();
		
		Double kilometros = metros/10000;
		Double centimetros = metros *100;
		Double pies = metros * 3.28084;
		System.out.println("En KILOMETROS ES:"+ kilometros);
		System.out.println("En CENTIMETROS ES:"+ centimetros);
		System.out.println("En PIES ES:"+ pies);
	}

}
