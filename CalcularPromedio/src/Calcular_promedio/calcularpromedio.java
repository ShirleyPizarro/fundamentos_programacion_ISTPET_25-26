package Calcular_promedio;
import java.util.ArrayList;

public class calcularpromedio {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer> (); 
		numeros.add(5);
		numeros.add(10);
		numeros.add(5);
		numeros.add(8);
		numeros.add(3);
		numeros.add(9);
		numeros.add(10);
		
		Integer suma = 0;
		
		for(Integer numero : numeros) {
            suma += numero;
	}

		Integer promedio = suma / numeros.size();
		
		System.out.print("El promedio del estudiante es:"+ promedio);
}
}
		