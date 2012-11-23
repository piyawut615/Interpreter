import java.util.HashMap;


public class Constant implements Expression {
	private final double value;

	public Constant(double value) {
		this.value = value;
	}

	public double evaluate(HashMap<String, Double> context) {
		return value;
	}
}

