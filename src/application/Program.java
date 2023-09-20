package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter rectangle width and height");
		System.out.print("Width: ");
		double width = sc.nextDouble();
		System.out.print("Height: ");
		double height = sc.nextDouble();
		Rectangle rectangle = new Rectangle(width, height);
		
		System.out.println("");
		System.out.println("Area: " + rectangle.area());
		System.out.println("Perimeter: " + rectangle.perimeter());
		System.out.println("Diagonal: " + rectangle.diagonal());
		
		
		
		
		
		sc.close();

	}

}
