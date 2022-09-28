package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'o';
		switch (harf) {
		case 'A':
		case 'I':
		case 'o':
		case 'U':
			System.out.println("Kalın Sesli Harf");
			break;
		default:
			System.out.println("İnce Sesli Harf");
		}
	}

}
