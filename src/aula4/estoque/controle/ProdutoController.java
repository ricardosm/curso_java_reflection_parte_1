package aula4.estoque.controle;

import java.util.ArrayList;
import java.util.List;

public class ProdutoController {
	
private List<String> lista = new ArrayList<String>();
	
	public ProdutoController() {
		lista.add("item 1");
		lista.add("item 2");
		lista.add("item 3");
	}
	
	public ProdutoController(String s) {
		lista.add("item 1");
		lista.add("item 2");
		lista.add("item 3");
	}
	
	private ProdutoController(String s, String t) {
		lista.add("item 1");
		lista.add("item 2");
		lista.add("item 3");
	}
	
	public List<String> lista() {
		return lista;
	}

}
