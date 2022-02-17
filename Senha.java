package capgemini_java;

import java.util.Scanner;

public class Senha {
	
	public static void main(String[] args) {
		System.out.println("Requisitos para uma senha forte:");
		System.out.println("- Possui no mínimo 6 caracteres.\r\n"
				+ "- Contém no mínimo 1 digito.\r\n"
				+ "- Contém no mínimo 1 letra em minúsculo.\r\n"
				+ "- Contém no mínimo 1 letra em maiúsculo.\r\n"
				+ "- Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+");
		
		System.out.println("Digite uma senha: ");
		Scanner sc = new Scanner(System.in);
		String senha = sc.nextLine();
		
		int restante = 6 - senha.length();
		
		if(senha.length() < 6) {
			
			System.out.println("\nA senha digitada foi '" + senha + "'.\n");
			System.out.print("Número mínimo de caracters que faltam para a senha ser segura: " + restante);
			
		}
		else {
			System.out.println("Senha com número de caracters válido!");
		}
		
	}
}
