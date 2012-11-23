import java.util.HashMap;
 
public class Variable implements Expression {
    private final String name;
 
    public Variable(String name) {
        this.name = name;
    }
 
    public double evaluate(HashMap<String, Double> context) throws Exception {
        Double value = context.get(name);
        if (value == null)
            throw new Exception("Error ");
 
        return value;
    }
}