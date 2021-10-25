package applicattion;

import java.util.ArrayList;
import java.util.List;

public class Program {

	private static Object collectors;

	public static void main(String[] args) {
		/* List não aceita tipos primitivos
		 * coloca a Wraper class 
		 */
		List<String>list = new ArrayList<>(); //instancia
		//adiciona elementos na lista
		list.add("Isabel");
		list.add("Pedro");
		list.add("Mariana");
		list.add("Rodolfo");
		list.add(2, "Marco");
		
		System.out.println(list.size()); //ver tamanho da lista
		
		for (String x: list) {
			System.out.println(x);
		}
		System.out.println("------------------");
		list.removeIf(x -> x.charAt(0) == 'M');//remove por predicado
		for (String x: list) {
		  System.out.println(x);
	    }
		
		}
	}

