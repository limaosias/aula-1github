package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();		

		// Product product = new Product(name, price, quantity);
		Product p = new Product();	
		
		Product product = new Product(name, price);
		product.setName("Computer");
		System.out.println("update name:  " + product.getName());
		product.setPrice(1200.00);
		System.out.println("update price: " + product.getPrice());
		System.out.println();
		
		System.out.println("Enter Product.data: " + product);
		System.out.println();
		
		System.out.println("Enter the number of products to be added in Stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		
		System.out.println("uptodate Product.data: " + product);
		System.out.println();
		
		System.out.println("Enter the number of products to be removed from Stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("uptodate Product.data: " + product);

		sc.close();
	}

}
