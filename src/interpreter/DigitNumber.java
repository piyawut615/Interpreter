package interpreter;

public class DigitNumber implements INumber {
private HundredDigitNumber hundredDigitNumber ;
private DeciDigitNumber deciDigitNumber;
	DigitNumber(){
		hundredDigitNumber = new HundredDigitNumber();
		deciDigitNumber = new DeciDigitNumber();
	}

	@Override
	public String interpreter(Context context) {
		int checkNumber = context.checkNumber;
		int hundredNumber = Math.round((checkNumber+1)/100)*100;
		int deciNumber =checkNumber-hundredNumber;
		Context hundredContext = new  Context(hundredNumber);
		Context deciContext = new Context(deciNumber);
		String hundred = hundredDigitNumber.interpreter(hundredContext);
		String deci = deciDigitNumber.interpreter(deciContext);
		String con="";
		if((!deci.trim().equals(""))&& (!(hundred.trim()).equals("")))
			con="and";
		return hundred+con+deci;
	}

}
