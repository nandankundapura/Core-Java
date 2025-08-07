class Movie {
	static String movieName = "KGF";
    static String director = "Neel";
    static float rating = 8.2f;
    static int duration = 145; 
    static int ticketPrice = 200;
    static int totalViewers = 2000000;
	static int profitPerticket=50;
	static int taxPerTicket = 10;


public static int totalCollection()
{
	int totalCollection=ticketPrice * totalViewers;
	return totalCollection;
	System.out.println(totalCollection);

}

public static int totalProfit() 
{
        int profit = profitPerticket * totalViewers;
        return profit;
	System.out.println(profit);
}
public static int totalTaxCollected() 
{
        int tax = taxPerTicket * totalViewers;
        return tax;
	System.out.println(tax);

}

public static void main(String[] args) 
{
        System.out.println("Movie Name: " + movieName);
        System.out.println("Director: " + director);
	System.out.println("Rating:" + rating);
	System.out.println("Ticket Price:" + ticketPrice);
	System.out.println("Total viewers:" + totalViewers);
}
}


