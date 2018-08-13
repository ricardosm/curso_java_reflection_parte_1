package aula4.alurator.protocolo;

import java.util.HashMap;

public class Request {
	
	private String nomeControle;
	private String nomeMetodo;
	private Object queryParams ;

	public Request(String url) {
		String[] partesUrl = url.replaceFirst("/", "").split("[?]");
		
		String[] nomeControleNomeMetodo= partesUrl[0].split("/");
		
		this.nomeControle = Character.toUpperCase(nomeControleNomeMetodo[0].charAt(0)) + nomeControleNomeMetodo[0].substring(1) + "Controller";
		this.nomeMetodo = (nomeControleNomeMetodo.length > 1) ? nomeControleNomeMetodo[1] : null;
		
		this.queryParams = (partesUrl.length > 1) ? new QueryParamsBuilder().comParametros(partesUrl[1]).build() : new HashMap<String, Object>();
	}

	public String getNomeControle() {
		return nomeControle;
	}
	
	public String getNomeMetodo() {
		return nomeMetodo;
	}
	
	public Object getQueryParams() {
		return queryParams;
	}
}
