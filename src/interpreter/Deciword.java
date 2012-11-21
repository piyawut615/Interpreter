package interpreter;

public class Deciword implements INumber {

	@Override
	public String interpreter(Context context) {
		int theDeciNumber = context.checkNumber;
		String display="";
		DeciMapTable deciMap = new DeciMapTable();
		IntMapTabel intMap = new IntMapTabel();
		if(theDeciNumber!=0){
			if(theDeciNumber>=20){
				int deciDigit = Math.round((theDeciNumber+1)/10)*10;
				int last = theDeciNumber-deciDigit;
				display=display+(String)intMap.map.get(String.valueOf(last));
			}
		}
		else if(theDeciNumber<10)display=(String)intMap.map.get(String.valueOf(theDeciNumber));
		else display = (String)deciMap.map.get(String.valueOf(theDeciNumber));
		return display;
	}

}
