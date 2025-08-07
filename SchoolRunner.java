public class SchoolRunner {
    public static void main(String[] args) {
        School[] schools = new School[5];

        for (int i = 0; i < schools.length; i++) {
            schools[i] = new School();
            schools[i].setName("School " + (i + 1));
            schools[i].setPrincipal("Principal " + (i + 1));
            schools[i].setStudents(500 + i * 100);
        }

        for (School s : schools) {
            System.out.println("Name: " + s.getName());
            System.out.println("Principal: " + s.getPrincipal());
            System.out.println("Students: " + s.getStudents());
            System.out.println("---------------------");
        }
    }
}
