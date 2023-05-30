package basic;
import java.util.Scanner;
public class TemperatureConverter {
	
   public static void main(String[] args) {
			
			Scanner s=new Scanner(System.in);
			System.out.println("Fahrenheit to Celsius(1) or Celsius to Fahrenheit(2)");
			int result=s.nextInt();
			
			if(result==1) {
				//calculate fahrenheit to celsius
				
				System.out.println("You have to chosen FAHRENHEIT to CELSIUS!");
				System.out.println("Enter Fahrenheit value: ");
				double value= s.nextDouble();
				double finalvalue= (value-32) * 5/9;
				System.out.print("Celsius is: ");
				System.out.println(Math.round(finalvalue*10.0)/10.0);
				
			 	} else if(result==2) {
				//calculate celsius to fahrenheit
					System.out.println("You have to chosen  CELSIUS to FAHRENHEIT!");
					System.out.println("Enter  CELSIUS value: ");
					double value1= s.nextDouble();
					double finalvalue1 = value1 * 1.8 + 32;
					System.out.print("FAHRENHEIT is: ");
					System.out.println(Math.round(finalvalue1*10.0)/10.0);
					
				}else {  
				//Any number that is not 1 or 2
				System.out.println("Not a valid choice!");
			}

		}

		
	}




