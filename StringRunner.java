package StringPrograms;

public class StringRunner {
    public static void main (String args[]) {
        int a=10;
        int b=10;
        if(a==b) {
            System.out.println("int equals");
        }
        String str="java";
        String str1="java";
        int i=10;
        if(str.equals(str1)) {
            System.out.println("str equals str!equals");
        }else {
            System.out.println("str equals str1 not equal");
        }
        if(str==str1) {
            System.out.println("String is equal");

        }
        String str1=new String("java");
        if(str==str2) {
            System.out.println("str==str2 class equals");
        }
        String str3= new String("java");
        if(str2==str3) {
            System.out.println("str2==str3 equals");
        }
        if(str2.equals(str3)) {
            System.out.println("str2 equals str3 equals");
        }
        System.out.println("printing str3" +str3);
        System.out.println(str3.toUpperCase());
        System.out.println("Printing str3" +str3);
    }
}
