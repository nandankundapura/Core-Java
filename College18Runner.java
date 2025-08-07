public class College18Runner {
    public static void main(String[] args) {
        College18[] colleges = new College18[5];

        College18 c1 = new College18();
        c1.setName("RV College");
        c1.setCity("Bangalore");

        College18 c2 = new College18();
        c2.setName("IIT Madras");
        c2.setCity("Chennai");

        College18 c3 = new College18();
        c3.setName("NIT Trichy");
        c3.setCity("Tiruchirappalli");

     College18 c4 = new College18();
     c4.setName("Christ University");
        c4.setCity("Bangalore");

        College18 c5 = new College18();
        c5.setName("BITS Pilani");
        c5.setCity("Pilani");

        for (int i = 0; i < colleges.length; i++) {
            if (i == 0) {
                colleges[i] = c1;
            } else if (i == 1) {
                colleges[i] = c2;
            } else if (i == 2) {
                colleges[i] = c3;
            } else if (i == 3) {
                colleges[i] = c4;
            } else if (i == 4) {
                colleges[i] = c5;
            }
        }

        for (int i = 0; i < colleges.length; i++) {
            College18 c = colleges[i];
            if (c != null) {
                System.out.println(c.getName());
                System.out.println(c.getCity());
                System.out.println("----------");
        }
        }
    }
}
