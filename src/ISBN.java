
public class ISBN {
	private long isbn;

	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public static int getControlNumber(long ISBN) {
		int sum = 0;
		String cadena = String.valueOf(ISBN);
		for(int i = 0; i < cadena.length(); i++) {
			char character = cadena.charAt(i);
			if(isPar(i)) 
				sum += Character.getNumericValue(character) * 1;
			else
				sum +=  Character.getNumericValue(character) * 3;
		}
		return getDivisor10(sum) - sum;
	}
	private static int getDivisor10(int number) {
		while(number % 10 != 0)
			number++;
		return number;
	}
	private static boolean isPar(int number) {
		return number % 2 == 0;
	}
}
