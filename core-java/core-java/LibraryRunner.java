public class LibraryRunner {
    public static void main(String[] args) {
        Library[] libraries = new Library[5];

        for (int i = 0; i < libraries.length; i++) {
            libraries[i] = new Library();
            libraries[i].setName("Library " + (i + 1));
            libraries[i].setBooks(1000 + i * 200);
            libraries[i].setType((i % 2 == 0) ? "Public" : "Private");
        }

        for (Library lib : libraries) {
            System.out.println("Name: " + lib.getName());
            System.out.println("Books: " + lib.getBooks());
            System.out.println("Type: " + lib.getType());
            System.out.println("---------------------");
        }
    }
}
