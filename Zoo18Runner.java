public class Zoo18Runner {
    public static void main(String[] args) {
        Zoo18[] zoos = new Zoo18[5];

        Zoo18 z1 = new Zoo18();
        z1.setName("Bannerghatta Zoo");
        z1.setCity("Bangalore");

        Zoo18 z2 = new Zoo18();
        z2.setName("Nehru Zoological Park");
        z2.setCity("Hyderabad");

        Zoo18 z3 = new Zoo18();
        z3.setName("Arignar Anna Zoo");
        z3.setCity("Chennai");

        Zoo18 z4 = new Zoo18();
        z4.setName("Sanjay Gandhi Zoo");
        z4.setCity("Patna");

        Zoo18 z5 = new Zoo18();
        z5.setName("Indira Gandhi Zoo");
        z5.setCity("Visakhapatnam");

        for (int i = 0; i < zoos.length; i++) {
            if (i == 0) {
                zoos[i] = z1;
            } else if (i == 1) {
                zoos[i] = z2;
            } else if (i == 2) {
                zoos[i] = z3;
            } else if (i == 3) {
                zoos[i] = z4;
            } else if (i == 4) {
                zoos[i] = z5;
            }
        }

        for (int i = 0; i < zoos.length; i++) {
            Zoo18 zoo = zoos[i];
            if (zoo != null) {
                System.out.println(zoo.getName());
                System.out.println(zoo.getCity());
                System.out.println("----------");
            }
        }
    }
}
