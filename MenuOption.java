public class MenuOption {
    public static void main(String[] args) {
        int option = 2;

      switch (option) {
          case 1: System.out.println("Start");
		 break;
            case 2: System.out.println("Pause");	
		 break;
            case 3: System.out.println("Stop");
		 break;
            case 4: System.out.println("Restart");
		 break;
            case 5: System.out.println("Exit"); 
		break;
            default: System.out.println("Invalid Option");
      }
    }
}
