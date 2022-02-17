package capgemini_java;

import java.util.Scanner;

public class Senha {
	
	public static void main(String[] args) {
		System.out.println("Requisitos para uma senha forte:");
		System.out.println("- Possui no m�nimo 6 caracteres.\r\n"
				+ "- Cont�m no m�nimo 1 digito.\r\n"
				+ "- Cont�m no m�nimo 1 letra em min�sculo.\r\n"
				+ "- Cont�m no m�nimo 1 letra em mai�sculo.\r\n"
				+ "- Cont�m no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+");
		
		System.out.println("Digite uma senha: ");
		Scanner sc = new Scanner(System.in);
		String senha = sc.nextLine();
		
		int restante = 6 - senha.length();
		
		if(senha.length() < 6) {
			
			System.out.println("\nA senha digitada foi '" + senha + "'.\n");
			System.out.print("N�mero m�nimo de caracters que faltam para a senha ser segura: " + restante);
			
		}
		else {
			System.out.println("Senha com n�mero de caracters v�lido!");
		}
		
	}
}
