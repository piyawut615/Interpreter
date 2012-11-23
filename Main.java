import java.util.HashMap;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculat cricle");
		System.out.println("Press radius value");
		HashMap<String, Double> context = new HashMap<String, Double>();
		context.put("radius", sc.nextDouble());
		Expression two = new Constant(2);
		Expression pi = new  Constant(Math.PI);
		Expression radius = new Variable("radius");
		Expression powerRad = new Power(radius,two);
		Expression powerRadPi = new Multiple(powerRad, pi);
		Expression length = new Multiple(pi,radius);
		Expression lengthRead = new Multiple(length, two);
		double result = powerRadPi.evaluate(context);
		double resultL = lengthRead.evaluate(context);
		System.out.println("Radius is "+context.get("radius")+" area is "+result);
		System.out.println("Radius is "+context.get("radius")+" lebgth of triangle is "+resultL);
		System.out.println("Calculat trapezoid");
		System.out.println("Press height value");
		context.put("height", sc.nextDouble());
		System.out.println("Press side1 value");
		context.put("side1", sc.nextDouble());
		System.out.println("Press side2 value");
		context.put("side2", sc.nextDouble());
		Expression side1 = new  Variable("side1");
		Expression side2 = new  Variable("side2");
		Expression heigth = new Variable("height");
		Expression plus = new Plus(side1, side2);
		Expression plusDi = new Divios(plus, two);
		Expression plusDiMul = new Multiple(plusDi,heigth );
		double ans = plusDiMul.evaluate(context);
		System.out.println("Area of trapezoid is "+ans);
		
	}
}





