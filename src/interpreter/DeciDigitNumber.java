package interpreter;

public class DeciDigitNumber implements INumber{
private Deciword deciWord;
public DeciDigitNumber(){
	deciWord = new Deciword();
}
	@Override
	public String interpreter(Context context) {
		return deciWord.interpreter(context);
	}

}
