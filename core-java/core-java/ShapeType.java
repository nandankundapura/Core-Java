public class ShapeType {
    public static void main(String[] args) {
        String shape = "circle";

       switch (shape.toLowerCase()) {
           case "circle": System.out.println("This is a circle"); 
		break;
            case "square": System.out.println("This is a square");
		 break;
            case "triangle": System.out.println("This is a triangle"); 
		break;
            case "rectangle": System.out.println("This is a rectangle");
		 break;
            case "hexagon": System.out.println("This is a hexagon");
		 break;
            default: System.out.println("Unknown shape");
        }
    }
}
