package aula4.alurator.reflexao;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ManipuladorMetodo {

	private Method metodo;
	private Object instancia;

	public ManipuladorMetodo(Method metodo, Object instancia) {
		this.metodo = metodo;
		this.instancia = instancia;
	}

	public Object invoca() {
		try {
			return metodo.invoke(instancia);
		} catch (IllegalAccessException | IllegalArgumentException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			throw new RuntimeException("Erro no método!" + e.getTargetException());
		}
	}

}
