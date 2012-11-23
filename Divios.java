import java.util.HashMap;


public class Divios implements Expression{
	 private final Expression operand1;
	    private final Expression operand2;
	 
	    public Divios(Expression operand1, Expression operand2) {
	        this.operand1 = operand1;
	        this.operand2 = operand2;
	    }
	 
	    public double evaluate(HashMap<String, Double> context) throws Exception {
	        return operand1.evaluate(context) / operand2.evaluate(context);
	    }
}
