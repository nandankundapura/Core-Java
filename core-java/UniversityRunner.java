public class UniversityRunner {
    public static void main(String[] args) {
      University university = new University("Oxford", "UK", 1);
        Dean dean = new Dean("Dr. Alice Smith", 55, "Ph.D in Education");

        university.setDean(dean);

      System.out.println("University Details:");
       System.out.println("Name: " + university.getName());
        System.out.println("Location: " + university.getLocation());
        System.out.println("Ranking: " + university.getRanking());

      Dean uniDean = university.getDean();
       System.out.println("\nDean Details:");
        System.out.println("Name: " + uniDean.getName());
        System.out.println("Age: " + uniDean.getAge());
        System.out.println("Qualification: " + uniDean.getQualification());
   }
}
