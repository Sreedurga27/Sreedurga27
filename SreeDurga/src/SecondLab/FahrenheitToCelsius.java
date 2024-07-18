package SecondLab;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		double Fahrenheit = 98.6;
		// C = (F-32)*5/9
		double celsius = (Fahrenheit - 32)*5/9;
		System.out.println("Temperature in celsius :" + celsius + "C");

	}

}
