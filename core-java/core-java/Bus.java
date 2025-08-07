class Bus {
static char busService='A';
short busNumber=5467;
float milage=15.3f;
int price=500000;


public static void main(String[] args)
{
System.out.println("busNumber"+ busNumber);
int totalPrice=Bus.totalPrice(8);
System.out.println(totalPrice);
}
public static int getTotalPrice(int numberofBuses){

int totalPrice=price*numberofBuses;
return totalPrice;
}
}