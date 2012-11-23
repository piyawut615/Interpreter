import java.util.HashMap;


public class LenghtCricle implements Expression{

	private final Expression operand1;
	private final Expression operand2;
	private final Expression operand3;

	public LenghtCricle(Expression operand1, Expression operand2,Expression operand3) {
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.operand3 = operand3;
	}
	@Override
	public double evaluate(HashMap<String, Double> context) throws Exception {
		return operand1.evaluate(context) *operand3.evaluate(context)* operand2.evaluate(context);
	}

	
	
}

