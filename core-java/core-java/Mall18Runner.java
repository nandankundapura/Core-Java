public class Mall18Runner {
    public static void main(String[] args) {
        Mall18[] malls = new Mall18[5];

        Mall18 m1 = new Mall18();
        m1.setName("Orion Mall");
        m1.setLocation("Rajajinagar");

        Mall18 m2 = new Mall18();
        m2.setName("Phoenix Marketcity");
        m2.setLocation("Whitefield");

        Mall18 m3 = new Mall18();
        m3.setName("Garuda Mall");
        m3.setLocation("MG Road");

     Mall18 m4 = new Mall18();
     m4.setName("Mantri Square");
        m4.setLocation("Malleswaram");

        Mall18 m5 = new Mall18();
     m5.setName("Forum Mall");
     m5.setLocation("Koramangala");

     for (int i = 0; i < malls.length; i++) {
            if (i == 0) {
                malls[i] = m1;
            } else if (i == 1) {
                malls[i] = m2;
            } else if (i == 2) {
                malls[i] = m3;
            } else if (i == 3) {
                malls[i] = m4;
            } else if (i == 4) {
                malls[i] = m5;
            }
        }

        for (int i = 0; i < malls.length; i++) {
            Mall18 mall = malls[i];
            if (mall != null) {
                System.out.println(mall.getName());
                System.out.println(mall.getLocation());
                System.out.println("----------");
        }
        }
    }
}
