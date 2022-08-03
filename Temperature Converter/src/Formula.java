import java.util.Scanner;

public class Formula {
	
	public class Celsius {	
		double celsiusToFahrenheit(double x) {
			return (x * (9/5)) + 32;
		}
		
		double celsiusToKelvin(double x) {
			return x + 273.15;
		}	
	}
	
	public class Fahrenheit {
		double fahrenheitToCelsius(double x) {
			return (x - 32) * (5/9);
		}
		
		double fahrenheitToKelvin(double x) {
			x = (x - 32) * (5/9);
			return x + 273.15;
		}
	}

	public class Kelvin {
		double kelvinToCelsius(double x) {
			return x - 273.15;
		}
		
		double kelvinToFahrenheit(double x) {
			x = x - 273.15;
			return (x * (9/5)) + 32;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Class variables
		Scanner inputnum = new Scanner(System.in);
		Scanner inputword = new Scanner(System.in);
		Formula formula = new Formula();
		
		//input and output variables
		double inputNum1;
		int inputNum2;
		double outputNum;
		
		System.out.println("Please enter the number you wish to convert.");

		if(inputnum.hasNextDouble()) {
			inputNum1 = inputnum.nextDouble();
		} else if(inputnum.hasNextInt()) {
			inputNum2 = inputnum.nextInt();
			inputNum1 = inputNum2;
		}
		
		
		System.out.println("Is the unit entered Celsius, Fahrenheit or Kelvin?");
		String unit1 = inputword.nextLine();
		
		System.out.println("Is the unit you wish to convert to Celsius, Fahrenheit or Kelvin?");
		String unit2 = inputword.nextLine();
		
		if(unit1.equals("Celsius") || unit1.equals("celsius")) {
			Formula.Celsius cFormulas = formula.new Celsius();
			if(unit2.equals("Fahrenheit") || unit2.equals("fahrenheit")) {
				try {
					outputNum = cFormulas.celsiusToFahrenheit(inputNum1);
					System.out.println("The converted value is " + outputNum);
				}
				catch (Exception e) {
					System.out.println("Error occured");
				}	
			}
			if(unit2 == "Kelvin" || unit2 == "kelvin") {
					outputNum = cFormulas.celsiusToKelvin(inputNum1);
					System.out.println("The converted value is " + outputNum);
					System.out.println("Error occured");	
			}
		} else if(unit1.equals("Fahrenheit") || unit1.equals("fahrenheit")) {
			Formula.Fahrenheit fFormulas = formula.new Fahrenheit();
			if(unit2.equals("Celsius") || unit2.equals("celsius")) {
				try {
					outputNum = fFormulas.fahrenheitToCelsius(inputNum1);
					System.out.println("The converted value is " + outputNum);
				}
				catch (Exception e) {
					System.out.println("Error occured");
				}	
			}
			if(unit2 == "Kelvin" || unit2 == "kelvin") {
				try {
					outputNum = fFormulas.fahrenheitToKelvin(inputNum1);
					System.out.println("The converted value is " + outputNum);
				}
				catch (Exception e) {
					System.out.println("Error occured");
				}	
			}
		} else if(unit1 == "Kelvin" || unit1 == "kelvin") {
			Formula.Kelvin kFormulas = formula.new Kelvin();
			if(unit2 == "Celsius" || unit2 == "celsius") {
				try {
					outputNum = kFormulas.kelvinToFahrenheit(inputNum1);
					System.out.println("The converted value is " + outputNum);
				}
				catch (Exception e) {
					System.out.println("Error occured");
				}	
			}
			if(unit2 == "Fahrenheit" || unit2 == "fahrenheit") {
				try {
					outputNum = kFormulas.kelvinToCelsius(inputNum1);
					System.out.println("The converted value is " + outputNum);
				}
				catch (Exception e) {
					System.out.println("Error occured");
				}	
			}
		}
		
	}

}
