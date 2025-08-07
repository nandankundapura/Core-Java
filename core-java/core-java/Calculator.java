class Calculator{
	public static void main(String[] args){
	 int a=20;
	int b=10;
	char operator = '+';
if (operator=='+'){
System.out.println("Addition is " + (a+b));
}
else if (operator=='-') {
System.out.println("Subrtaction is " + (a-b));
}
else if (operator=='*'){
System.out.println("Multiplication is " + (a*b));
}
else if (operator=='/') {
System.out.println("Division is " + (a/b));
}
else {
System.out.println("Invalid operator");
}
}
}