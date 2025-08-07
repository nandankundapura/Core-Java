class AddString
{
    public static void main(String[] args) {
        addition();
        addition("Hello", "Java");
    }

    public static void addition() {
        System.out.println("Without argument");
        String a = "Learn";
        String b = "Coding";
        String c = a + " " + b;
        System.out.println("Result: " + c);
    }

    public static void addition(String a, String b) {
        String c = a + " " + b;
        System.out.println("With String arguments: " + c);
    }
}
