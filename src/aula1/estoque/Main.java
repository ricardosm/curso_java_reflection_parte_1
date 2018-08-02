package aula1.estoque;

import java.util.Scanner;

import aula1.alurator.Alurator;

public class Main {
	
	public static void main(String[] args) {
		
		
		try (Scanner s = new Scanner(System.in)) {
			String url = s.nextLine();
			
			Alurator alurator = new Alurator("aula1.estoque.controle.");
			
			while(!url.equals("exit")) {
				Object response = alurator.executa(url);
				
				System.out.println("Response: " + response);
				
				url = s.nextLine();
			}
		}
	}
}
