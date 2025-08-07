public class Hotel {
    private String name;
    private int rooms;
    private boolean hasPool;

    public void setName(String name) { this.name = name; }
    public void setRooms(int rooms) { this.rooms = rooms; }
    public void setHasPool(boolean hasPool) { this.hasPool = hasPool; }

    public String getName() { return name; }
    public int getRooms() { return rooms; }
    public boolean getHasPool() { return hasPool; }
}
