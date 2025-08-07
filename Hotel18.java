public class Hotel18 {
    private String name;
    private String location;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }
}
public class Hotel18Runner {
    public static void main(String[] args) {
        Hotel18[] hotels = new Hotel18[5];

        Hotel18 h1 = new Hotel18();
        h1.setName("Taj Palace");
        h1.setLocation("Delhi");

        Hotel18 h2 = new Hotel18();
        h2.setName("Oberoi");
        h2.setLocation("Mumbai");

        Hotel18 h3 = new Hotel18();
        h3.setName("Leela Palace");
        h3.setLocation("Bangalore");

        Hotel18 h4 = new Hotel18();
        h4.setName("ITC Maurya");
        h4.setLocation("Delhi");

     Hotel18 h5 = new Hotel18();
     h5.setName("Marriott");
        h5.setLocation("Hyderabad");

        for (int i = 0; i < hotels.length; i++) {
            if (i == 0) {
            hotels[i] = h1;
            } else if (i == 1) {
                hotels[i] = h2;
            } else if (i == 2) {
                hotels[i] = h3;
            } else if (i == 3) {
                hotels[i] = h4;
            } else if (i == 4) {
                hotels[i] = h5;
            }
        }

        for (int i = 0; i < hotels.length; i++) {
            Hotel18 h = hotels[i];
            if (h != null) {
                System.out.println(h.getName());
                System.out.println(h.getLocation());
                System.out.println("----------");
     }
    }
    }
}
