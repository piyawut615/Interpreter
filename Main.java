import java.util.HashMap;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Double> context = new HashMap<String, Double>();
		context.put("radius", sc.nextDouble());
		
		Expression two = new Constant(2);
		Expression pi = new  Constant(Math.PI);
		Expression base = new Variable("radius");
		

		Expression area = new AreaCricle(base,pi);
		Expression length = new LenghtCricle(pi,base, two);

		double result = area.evaluate(context);
		double resultL = length.evaluate(context);
		System.out.println("Radius is "+context.get("radius")+" area is "+result);
		System.out.println("Radius is "+context.get("radius")+" lebgth of triangle is "+resultL);
	}
}
