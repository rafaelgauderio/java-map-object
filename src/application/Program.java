package application;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import entities.Merchandise;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Map<Merchandise, Integer> stock = new HashMap<Merchandise, Integer>();

		Merchandise p1 = new Merchandise("Paper towel", 500.0);
		Merchandise p2 = new Merchandise("Toilet paper roll", 900.40);
		Merchandise p3 = new Merchandise("Toilet paper interlayered", 600.40);
		Merchandise p4 = new Merchandise("Lavander liquid soap", 80.25);

		stock.put(p1, 300);
		stock.put(p2, 400);
		stock.put(p3, 700);
		stock.put(p4, 200);

		for (Merchandise key : stock.keySet()) {
			System.out.println(key);
		}

		// retorna uma Set com o valor de todas as Key, as Key podem ser objetos
		// complexos
		System.out.println("\nPrint all set in one line\n" + stock.keySet() + "\n");

		Merchandise p5 = new Merchandise("Paper towel", 500.0);

		// senão tiver implementado o equals e hashCode vai dar false, pois vai comparar
		// referências de ponteiros e não o conteudo do objeto Merchandise
		System.out.println("\nContens the key p5? " + stock.containsKey(p5)); // true
		System.out.println("Contém a  quantidade '500'? " + stock.containsValue(500)); // false
		System.out.println("Contains value '400'? " + stock.containsValue(400)); // true
		System.out.println("is Empty? '? " + stock.isEmpty()); // false
		System.out.println("Size: " + stock.size());
		System.out.println("Values: " + stock.values()); // retorna uma colection com todos os values
		System.out.println("get value of p1: " + stock.get(p1));
		System.out.println("get value pf p2: " + stock.get(p2));
		
		// printing the total of the stock
		int sum =0;
		for(Integer value : stock.values()) {
			sum += value;
		}
		
		System.out.println("\nPrinting using for forEach");
		stock.forEach((key, value) -> System.out.println(String.format("Key: %s | value: %s" ,key,value)));
		
		System.out.println("The total of stock is " + sum);
	
		
		stock.clear();
		System.out.println("\nIs empty after clean ? " + stock.isEmpty()); // true
		
	}

}
