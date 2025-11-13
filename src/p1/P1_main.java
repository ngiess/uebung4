package p1;

//erster Teil
public class P1_main {
	public static void main(String[] args) {
		int stockwerk = -2;
		System.out.println("erster Aufzug");
		switch (stockwerk) {
		case 0:
			System.out.println("Angebote");
			break;
		case 1:
			System.out.println("Damenbekleidung");
			break;
		case 2:
			System.out.println("Herrenbekleidung");
			break;
		case 3:
			System.out.println("Kinderbekleidung");
			break;
		case -1:
			System.out.println("Parkhaus");
			break;
		default:
			System.out.println("unbekannt");
			break;
		}
	


//zweiter Teil
int stockwerk1 =3;
System.out.println("zweiter Aufzug");
switch (stockwerk1) {
case 3:
	System.out.println("Kinderbekleidung");
case 2:
	System.out.println("Herrenbekleidung");
case 1:
	System.out.println("Damenbekleidung");
case 0:
	System.out.println("Angebote");
	break;
case -1:
	System.out.println("Parkhaus");
	break;
default:
	System.out.println("unbekannt");
}}
}
