public class Institute {
    private String name;
    private String location;
    private int students;
    private int courses;
    private String principal;

    public Institute(String name) {
        this.name = name;
        System.out.println("Initializing name");
    }

    public Institute(String name, String location) {
        this(name);
        this.location = location;
        System.out.println("Initializing location");
    }

    public Institute(String name, String location, int students) {
        this(name, location);
        this.students = students;
        System.out.println("Initializing students");
    }

    public Institute(String name, String location, int students, int courses) {
        this(name, location, students);
        this.courses = courses;
        System.out.println("Initializing courses");
    }

    public Institute(String name, String location, int students, int courses, String principal) {
        this(name, location, students, courses);
        this.principal = principal;
        System.out.println("Initializing principal");
    }

    public String getName() { return name; }
    public String getLocation() { return location; }
    public int getStudents() { return students; }
    public int getCourses() { return courses; }
    public String getPrincipal() { return principal; }
}
