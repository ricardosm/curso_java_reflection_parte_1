package aula3.estoque;

import java.util.Scanner;

import aula3.alurator.Alurator;

public class Main {
	
public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Digite a uri:");
			
			String url = s.nextLine();
			
			Alurator alurator = new Alurator("aula3.estoque.controle.");
			
			while(!url.equals("exit")) {
				Object response = alurator.executa(url);
				
				System.out.println("Response: " + response);
				
				url = s.nextLine();
			}
		}
	}

}
