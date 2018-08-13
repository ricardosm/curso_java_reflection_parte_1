package aula4.playground.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TesteInvocaMetodoComParametro {
	
	public static void main(String[] args) {
		try {
			Class<?> controleClasse = Class.forName("aula4.playground.controle.Controle");
			
			// Obtendo uma instância da classe SubControle 
			Constructor<?> construtorPadrao = controleClasse.getDeclaredConstructor();
			Object instanciaDaClasseControle = construtorPadrao.newInstance();
			
			System.out.println("Imprimindo metodos por meio do getMethods(): \n");
			
			for(Method m : controleClasse.getMethods()) {
				System.out.println(m);
			}
			
			System.out.println("\nImprimindo metodos por meio do getDeclaredMethods(): \n");
			
			for(Method m : controleClasse.getDeclaredMethods()) {
				System.out.println(m);
			}
			
			System.out.println();
			Method metodoControle1 = controleClasse.getDeclaredMethod("metodoControle1", String.class);
			Object retornoMetodoControle1 = metodoControle1.invoke(instanciaDaClasseControle, "Argumento 1");
			System.out.println("Imprimindo retorno do metodoControle1(String p1): " + retornoMetodoControle1);
			
			System.out.println();
			metodoControle1 = controleClasse.getDeclaredMethod("metodoControle1", String.class, String.class);
			retornoMetodoControle1 = metodoControle1.invoke(instanciaDaClasseControle, "Argumento 1", "Argumento 2");
			System.out.println("Imprimindo retorno do metodo: " + retornoMetodoControle1);
			
			System.out.println();
			metodoControle1 = controleClasse.getDeclaredMethod("metodoControle1", String.class, Integer.class);
			retornoMetodoControle1 = metodoControle1.invoke(instanciaDaClasseControle, "Argumento 1", 10);
			System.out.println("Imprimindo retorno do metodo: " + retornoMetodoControle1);
		
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
