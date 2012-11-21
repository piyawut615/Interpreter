package interpreter;

public class Main {
public static void main(String[] args) {
	Context a = new Context(200);
	DigitNumber digit = new DigitNumber();
	System.out.println(digit.interpreter(a));
	
}
}
