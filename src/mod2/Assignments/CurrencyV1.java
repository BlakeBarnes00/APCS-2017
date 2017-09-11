package mod2.Assignments;

/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Ellis Barnes
 * @version 09/10/17
 */
public class CurrencyV1
{
    public static void main(String[] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;		// starting US Dollars
        double totalSpent = 0.0;
        double moneyRemaining = 0.0;

        // Mexico
        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 19.57852;     // 1 US dollar = 19.57852 Pesos

        // Japan
        double yenSpent = 6.23;
        double yenExchangeRate = 0.00977;

        // Australia
        double AUSDollarSpent = 680.59;
        double AUSDollarExchangeRate = 0.8502;

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        System.out.println("Starting US dollars: " + startingUsDollars);

        // Conversion
        // code goes below here
        totalSpent += Calculations("Mexico", "Pesos", pesoExchangeRate, pesosSpent, startingUsDollars);
        totalSpent += Calculations("Japan", "Yen", yenExchangeRate, yenSpent, startingUsDollars);
        totalSpent += Calculations("Australia", "Dollar", AUSDollarExchangeRate, AUSDollarSpent, startingUsDollars);
        moneyRemaining = startingUsDollars - totalSpent;
        System.out.println("============================================");
        System.out.println("Remaining US dollars:\t" + moneyRemaining + "\n\n");

        // Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");



		//Calculations for Souvenir #1
		int costItem1 = 12;  		                    //cost per item of first souvenir
		int budget1 = 100;   		                    //budget for first item
		int totalItems1 = budget1 % costItem1; 		    //how many items can be purchased
		int fundsRemaining1 = (int)moneyRemaining;       //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItems1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);
     	System.out.println();

		//Calculations for Souvenir #2
		double costItem2 = 29.99;  						//cost per item of second souvenir
		int budget2 = 500;   							//budget for second item
		int totalItems2 = (int)(budget2 % costItem2); 	//how many items can be purchased
		double fundsRemaining2 = moneyRemaining;  	    //how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItems2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method

    static double Calculations(String country, String currency, double exchangeRate, double fMoneySpent, double startingMoney) {
        double moneySpent = fMoneySpent / exchangeRate;     // The US equivalent
        double dollarsAfter = startingMoney - moneySpent;   // US money after

        System.out.println(country + ": ");
        System.out.println("\t"+ currency +" spent: " + fMoneySpent);
        System.out.println("\tUS Equivalent: " + moneySpent);
        System.out.println("\tUS Remaining: " + dollarsAfter);
        System.out.println();

        return moneySpent;
    }

} // end of class

