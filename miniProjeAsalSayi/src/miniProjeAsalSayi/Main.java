package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		// bug
		int number = -1;
		int remainder = number % 1;
		// remainder kalanı verme fonksiyonu

		boolean isPrime = true; // isPrime asaldır anlamına gelmektedir.

		if (number == 1) {
			System.out.println("Sayı asal değildir.");
			return; // baglı bulundugu blogu bitiriyor return
		}

		if (number < 1) {
			System.out.println("Geçersiz Sayı");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("Sayı asaldır");
		} else {
			System.out.println("Sayı asal değildir.");
		}
	}

}
