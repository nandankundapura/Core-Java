class Fibonacci {
public static void main(String [] args) {
	
	int a=0;
	int b=1;
	int c=0;
System.out.println("Fibonacciusing while loop---------------");

for(int i=0;i<10;i++) {
c=a+b;
System.out.println(c);
a=b;
b=c;
}
System.out.println("Fibonacci using while loop-------------");
int j=0;
a=0;
b=1;
while(j<10) {
c=a+b;
System.out.println(c);
a=b;
b=c;
j++;
}
}
}