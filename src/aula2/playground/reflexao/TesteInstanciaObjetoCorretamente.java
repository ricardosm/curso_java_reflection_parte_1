package aula2.playground.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import aula2.playground.controle.SubControle;

public class TesteInstanciaObjetoCorretamente {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<SubControle> subControleClasse1 =  SubControle.class;
		
		Class<?> subControleClasse2 = Class.forName("aula2.playground.controle.SubControle");
	
		Class<?> controleClasse1 = Class.forName("aula2.playground.controle.Controle");
		
		Constructor<SubControle> construtorSubControle = subControleClasse1.getDeclaredConstructor();
		
		System.out.println(construtorSubControle);
		
		construtorSubControle.setAccessible(true);
		
		Object objetoSubControle = construtorSubControle.newInstance();
		
		System.out.println(objetoSubControle);

	}

}
