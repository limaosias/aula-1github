package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa_Listas {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Osias");
		list.add("Madalena");
		list.add("Orlando");
		list.add("Fernando");
		list.add(2, "Marco");	
		
		System.out.println(list.size());
		
		
		
		
		
		for(String x: list) {
			System.out.println(x);
			
		}
		
		System.out.println("........................................................");
		
		//list.remove(1);
		
		list.removeIf(x-> x.charAt(0)=='O');
		
		for(String x: list) {
			System.out.println(x);
			
		}
		System.out.println("........................................................");
		
		System.out.println("index of Marco " + list.indexOf("Marco"));
		System.out.println("index of Osias " + list.indexOf("Osias"));
		
		System.out.println("........................................................");
		
		List <String> result = list.stream().filter(x-> x.charAt(0)=='M').collect(Collectors.toList());

		for(String x: result) {
			System.out.println(x);
		}	
			System.out.println("........................................................");	
		
		String name = list.stream().filter(x -> x.charAt(0) == 'F').findFirst().orElse(null);	
		System.out.println(name);	
		}
	}
	
