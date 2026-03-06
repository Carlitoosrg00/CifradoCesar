package paquete;

import java.util.Scanner;

public class CifradoCesar {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el texto a cifrar: ");
		String texto = sc.nextLine();
		System.out.print("Ingrese el desplazamiento (número de posiciones): ");
		int desplazamiento = sc.nextInt();
		String textoCifrado = cifrarCesar(texto, desplazamiento);
		System.out.println("Texto cifrado: " + textoCifrado);
		sc.close();
	}

	public static String cifrarCesar(String texto, int desplazamiento) {
		StringBuilder resultado = new StringBuilder();
		for (char c : texto.toCharArray()) {
			if (Character.isUpperCase(c)) {
				char letraCifrada = (char) (((c - 'A' + desplazamiento) % 26) + 'A');
				resultado.append(letraCifrada);
			} else if (Character.isLowerCase(c)) {
				char letraCifrada = (char) (((c - 'a' + desplazamiento) % 26) + 'a');
				resultado.append(letraCifrada);
			} else {
				resultado.append(c); // No modificar caracteres no alfabéticos
			}
		}
		return resultado.toString();
	}
}
