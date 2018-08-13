package aula4.playground.controle;

import java.util.ArrayList;
import java.util.List;

public class Controle {
	
	private List<String> lista = new ArrayList<String>();
	
	public Controle() {
		lista.add("item 1");
		lista.add("item 2");
		lista.add("item 3");
	}
	
	public Controle(String s) {
		lista.add("item 1");
		lista.add("item 2");
		lista.add("item 3");
	}
	
	private Controle(String s, String t) {
		lista.add("item 1");
		lista.add("item 2");
		lista.add("item 3");
	}
	
	public List<String> getLista() {
		return lista;
	}
	
	private void metodoControle0() {
		System.out.println("Executando o metodoControle0()");
	}
	
	public String metodoControle1(String p1) {
		System.out.println("Executando o metodoControle1(String p1)");
		return "retorno do metodoControle1(String p1)";
	}
	
	public String metodoControle1(String p1, String p2) {
		System.out.println("Executando o metodoControle1(String p1, String p2)");
		return "retorno do metodoControle1(String p1, String p2)";
	}

	public String metodoControle1(String p1, Integer p2) {
		System.out.println("Executando o metodoControle1(String p1, Integer p2)");
		return "retorno do metodoControle1(String p1, Integer p2)";
	}
}
