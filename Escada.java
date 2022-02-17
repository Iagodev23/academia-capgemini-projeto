package capgemini_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Escada {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> degraus = new ArrayList<>();

		 

		System.out.print("Digite quantos degraus terá a escada: ");
		int numDegraus = sc.nextInt();

		 

		for (int i = 0; i < numDegraus; i++) {
		degraus.add(" ".repeat(numDegraus - i - 1) + "*".repeat(i + 1));
		}

		 

		for (String d : degraus ) {
		System.out.println(d);
		}
	}
}
