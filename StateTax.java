import java.util.Scanner;
public class StateTax {
	public static void main(String[] args)
	{
		//identifier declarations
		final double TAX_RATE = 0.055;  
        
		double price;  
		double tax;    
		double total;  
		String item;   

		
		Scanner keyboard = new Scanner(System.in)

		
		System.out.print("Item description:  "); 
		item = key.nextLine(); 
		System.out.print("Item price:  $"); 
		price = keyboard.nextDouble(); 
		
		
		tax = price * TAX_RATE;     
		total = price + tax;     
		
		
		System.out.println("Item purchased: " + item);
            System.out.println("Price                 $" + price);
		System.out.println("Tax                   $" + tax);
		System.out.println("Total                 $" + total);
	}
}

}
