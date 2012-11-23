import java.util.HashMap;

public class Power implements Expression {
    private final Expression operand1;
   
 
    public Power(Expression operand1) {
        this.operand1 = operand1;
    }
 
    public double evaluate(HashMap<String, Double> context) throws Exception {
        return operand1.evaluate(context) *operand1.evaluate(context);
    }
}