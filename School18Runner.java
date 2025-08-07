public class School18Runner {
    public static void main(String[] args) {
        School18[] schools = new School18[5];

        School18 s1 = new School18();
        s1.setName("Delhi Public School");
        s1.setArea("Yelahanka");

        School18 s2 = new School18();
        s2.setName("National Public School");
        s2.setArea("Rajajinagar");

        School18 s3 = new School18();
        s3.setName("Bishop Cotton");
        s3.setArea("Shivajinagar");

    School18 s4 = new School18();
        s4.setName("Kendriya Vidyalaya");
      s4.setArea("Hebbal");

        School18 s5 = new School18();
        s5.setName("Greenwood High");
        s5.setArea("Sarjapur");

        for (int i = 0; i < schools.length; i++) {
            if (i == 0) {
          schools[i] = s1;
        } else if (i == 1) {
                schools[i] = s2;
            } else if (i == 2) {
                schools[i] = s3;
            } else if (i == 3) {
                schools[i] = s4;
            } else if (i == 4) {
                schools[i] = s5;
            }
        }

        for (int i = 0; i < schools.length; i++) {
            School18 s = schools[i];
            if (s != null) {
                System.out.println(s.getName());
                System.out.println(s.getArea());
                System.out.println("----------");
       }
        }
    }
}
