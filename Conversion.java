public class Conversion 
{
   public static void main(String[] args) 
{
        String s1 = "42";
        String s2 = "3.14";
        String s3 = "123456789";
        String s4 = "true";

        int i = Integer.parseInt(s1);
        float f = Float.parseFloat(s2);
        double d = Double.parseDouble(s2);
        long l = Long.parseLong(s3);
        boolean b = Boolean.parseBoolean(s4);

        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(l);
        System.out.println(b);
  }
}
