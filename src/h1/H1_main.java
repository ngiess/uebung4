package h1;

public class H1_main {
	public static void main(String[] args) {
		// Fahrkartenautomat
		int zone = 0;
		double price = 5.3;
		
		price=0;
		switch (zone) {
		case 5:
			price += 0.70;
		case 4,3:
			price += 0.50;
		case 2:
			price += 0.35;
		case 1:
			price += 2.00;
			break;
		default:
			price = 4.00;
		}
			
		System.out.println("Die Parkgebühr beträgt "+price+ " €");

		
	}
}
