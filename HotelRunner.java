public class HotelRunner {
    public static void main(String[] args) {
        Hotel[] hotels = new Hotel[5];

        for (int i = 0; i < hotels.length; i++) {
            hotels[i] = new Hotel();
            hotels[i].setName("Hotel " + (i + 1));
            hotels[i].setRooms(100 + i * 20);
            hotels[i].setHasPool(i % 2 == 0);
        }

        for (Hotel h : hotels) {
            System.out.println("Name: " + h.getName());
            System.out.println("Rooms: " + h.getRooms());
            System.out.println("Has Pool: " + h.getHasPool());
            System.out.println("---------------------");
        }
    }
}
