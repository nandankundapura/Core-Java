public class Hospital14Runner {
    public static void main(String[] args) {
        Hospital14[] hospitals = new Hospital14[5];
        for (int i = 0; i < 5; i++) {
            hospitals[i] = new Hospital14();
            hospitals[i].setName("Hospital " + (i + 1));
            hospitals[i].setLocation("City " + (char)('A' + i));
            hospitals[i].setNumberOfBeds(50 + i * 10);
        }

        for (Hospital14 h : hospitals) {
            System.out.println(h.getName() + ", " + h.getLocation() + ", Beds: " + h.getNumberOfBeds());
        }
    }
}

