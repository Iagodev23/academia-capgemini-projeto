package capgemini_java;

import java.util.Scanner;

public class Anagrama {
	
	public static void main(String[] args) {
		
		System.out.println("Digite a palavra e veremos se há pares de substrings anagramas: ");
		Scanner sc = new Scanner(System.in);
		String palavra = sc.nextLine();
		String letra = null;
		
		for(int i=0; i < 10; i++) {
			
			letra = palavra.substring(0,1);
			
		
		}
		
		System.out.print(letra);
		
	}
}