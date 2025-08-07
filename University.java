public class University {
   private String name;
    private String location;
    private int ranking;
    private Dean dean;

    public University(String name, String location, int ranking) {
       this.name = name;
        this.location = location;
        this.ranking = ranking;
  }

    public void setDean(Dean dean) {
       this.dean = dean;
  }

    public String getName() {
        return name;
  }

    public String getLocation() {
        return location;
   }

    public int getRanking() {
        return ranking;
   }

    public Dean getDean() {
        return dean;
    }
}
