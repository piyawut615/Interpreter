package interpreter;

public class HundredDigitNumber implements INumber{
	private HundredWord  hundredWord;
	
	public HundredDigitNumber (){
		hundredWord = new HundredWord();
	}
	@Override
	public String interpreter(Context context) {
		int hundredDigit = Math.round((context.checkNumber/100));
		Context hundreed = new Context(hundredDigit);
		return hundredWord.interpreter(hundreed);
	}
	

}
