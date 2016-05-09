package Package1;

public class Card {
	private String suite;
	private String number;

	public Card(String s, String num)
	{
		suite = s;
		number = num;
	}
	
	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
}
