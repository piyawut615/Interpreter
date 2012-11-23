import java.util.HashMap;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Double> context = new HashMap<String, Double>();
		context.put("radius", sc.nextDouble());
		Expression two = new Constant(2);
		Expression pi = new  Constant(Math.PI);
		
		
		Expression radius = new Variable("radius");
		Expression powerRad = new Power(radius);
		Expression powerRadPi = new Multiple(powerRad, pi);
		
		
		
		
		Expression length = new Multiple(pi,radius);
		Expression lengthRead = new Multiple(length, two);
		double result = powerRadPi.evaluate(context);
		double resultL = lengthRead.evaluate(context);
		System.out.println("Radius is "+context.get("radius")+" area is "+result);
		System.out.println("Radius is "+context.get("radius")+" lebgth of triangle is "+resultL);
	}
}
