package switchDemo;

public class switchDemo {

	public static void main(String[] args) {
		char creditRating = 'A';
		switch (creditRating) {
		case 'A':
			System.out.println("yatırım yapmaya çok müsait");
			break;
		case 'B':
			System.out.println("yatırım yapmaya müsait");
			break;
		case 'C':
			System.out.println("yatırım yapmaya az müsait");
			break;
		case 'D':
			System.out.println("yatırım yapmaya müsait değil");
			break;
		default:
			System.out.println("geçersiz karakter");
		}

	}

}
