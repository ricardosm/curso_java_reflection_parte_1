package aula2.playground.controle;

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

}
