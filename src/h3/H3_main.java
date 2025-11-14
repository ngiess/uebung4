package h3;

public class H3_main {
	public static void main(String[] args) {
		float celsiusFloat=14.5f, fahrenheitFloat=7.43f;
		double celsiusDouble=14.5, fahrenheitDouble=3.4;
		
		//double
		fahrenheitDouble=celsiusDouble*9/5+32;
		//float
		fahrenheitFloat=celsiusFloat*9/5+32;
		System.out.println(+celsiusDouble+" Grad Celsius sind "+fahrenheitDouble+ " Grad Fahrenheit.");
		System.out.println(+celsiusFloat+" Grad Celsius sind "+fahrenheitFloat+ " Grad Fahrenheit.");
		
		
	}
}
