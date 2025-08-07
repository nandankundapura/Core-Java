public class Book18Runner {
    public static void main(String[] args) {
        Book18[] books = new Book18[5];

        Book18 b1 = new Book18();
        b1.setTitle("To Kill a Mockingbird");
        b1.setAuthor("Harper Lee");

        Book18 b2 = new Book18();
        b2.setTitle("1984");
        b2.setAuthor("George Orwell");

        Book18 b3 = new Book18();
        b3.setTitle("The Alchemist");
        b3.setAuthor("Paulo Coelho");

        Book18 b4 = new Book18();
        b4.setTitle("Wings of Fire");
        b4.setAuthor("A. P. J. Abdul Kalam");

        Book18 b5 = new Book18();
        b5.setTitle("The Hobbit");
        b5.setAuthor("J. R. R. Tolkien");

        for (int i = 0; i < books.length; i++) {
            if (i == 0) {
                books[i] = b1;
            } else if (i == 1) {
                books[i] = b2;
            } else if (i == 2) {
                books[i] = b3;
            } else if (i == 3) {
                books[i] = b4;
            } else if (i == 4) {
                books[i] = b5;
            }
        }

        for (int i = 0; i < books.length; i++) {
            Book18 b = books[i];
            if (b != null) {
                System.out.println(b.getTitle());
               System.out.println(b.getAuthor());
               System.out.println("----------");
        }
        }
    }
}
