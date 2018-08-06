package aula3.alurator.protocolo;

public class Request {
	
	private String nomeControle;
	private String nomeMetodo;

	public Request(String url) {
		String[] partesUrl = url.replaceFirst("/", "").split("/");
		
		this.nomeControle = Character.toUpperCase(partesUrl[0].charAt(0)) + partesUrl[0].substring(1) + "Controller";
		this.nomeMetodo = partesUrl[1];
	}

	public String getNomeControle() {
		return nomeControle;
	}
	
	public String getNomeMetodo() {
		return nomeMetodo;
	}

}
