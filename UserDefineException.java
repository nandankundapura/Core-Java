package Exception;

import javax.activity.InvalidActivityException;

public class UserDefineException {
    public static void main(String[] args) {
        int age=17;
        try{
            voting(age);
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
    public static  void  voting(int age) {
        if(age == 18) {
            System.out.println("Voting is eligible");
        }else {
            System.out.println("Voting is not eligible");
            throw new InvalidAgeException("Not Eligible ange is"+age);
            throw new InvalidAgeException();
        }
    }
}
