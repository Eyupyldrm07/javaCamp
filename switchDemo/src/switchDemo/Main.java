package switchDemo;

public class Main {
	public static void main(String[] args) {

		char grade = 'A';

		switch (grade) {

		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B': // case üst üste olursa altaki geçerli sayılıyor. Örnegin iki koşuluda sağlama
					// durumu.
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Mallesef Kaldınız");
			break;

		default:  // Case lerde belirtilen ifade dışında ifade girilirse çalışıcak.
			System.out.println("Geçersiz not girdiniz");
		}
	}

}
