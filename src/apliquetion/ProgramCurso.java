package apliquetion;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class ProgramCurso {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle y,x;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measure of triangule X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measure of triangule Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areax = x.area();
		
		double areay = y.area();
		
		System.out.printf("triangule X area : %.4f%n", areax);
		System.out.printf("triangule Y area : %.4f%n", areay);
		
		if (areax > areay ) {
			System.out.println("Large area X:");
		}
		else {
			System.out.println("Large area Y :");
			
		}
		
		
		sc.close();
	}

}
