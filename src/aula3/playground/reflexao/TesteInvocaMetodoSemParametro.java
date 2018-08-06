package aula3.playground.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TesteInvocaMetodoSemParametro {
	
	public static void main(String[] args) {
		try {
			Class<?> subControleClasse = Class.forName("aula3.playground.controle.SubControle");
			
			// Obtendo uma instância da classe SubControle 
			Constructor<?> construtorPadraoPrivado = subControleClasse.getDeclaredConstructor();
			construtorPadraoPrivado.setAccessible(true);
			Object instanciaDaClasseSubControle = construtorPadraoPrivado.newInstance();
			
			System.out.println("Imprimindo metodos por meio do getMethods(): \n");
			
			for(Method m : subControleClasse.getMethods()) {
				System.out.println(m);
			}
			
			System.out.println("\nImprimindo metodos por meio do getDeclaredMethods(): \n");
			
			for(Method m : subControleClasse.getDeclaredMethods()) {
				System.out.println(m);
			}
			
			System.out.println("\nExecutadno o método metodoSubControle1() da classe SubControle: \n");
			Method metodoSubControle1 = subControleClasse.getDeclaredMethod("metodoSubControle1");
			Object retornoMetodoSubControle1 = metodoSubControle1.invoke(instanciaDaClasseSubControle);
			System.out.println("Imprimindo retorno do metodo: " + retornoMetodoSubControle1);
			
			System.out.println("\nExecutadno o método metodoSubControle2() da classe SubControle: \n");
			
			Method metodoSubControle2 = subControleClasse.getDeclaredMethod("metodoSubControle2");
			metodoSubControle2.setAccessible(true);
			Object retornoMetodoSubControle2 = metodoSubControle2.invoke(instanciaDaClasseSubControle);
			System.out.println("Imprimindo retorno do metodo: " + retornoMetodoSubControle2);
		
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
			new RuntimeException(e);
		}
	}

}
