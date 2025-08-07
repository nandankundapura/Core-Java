public class Movie18Runner {
    public static void main(String[] args) {
        Movie18[] movies = new Movie18[5];

        Movie18 movie1 = new Movie18();
        movie1.setTitle("Inception");
      movie1.setDirector("Christopher Nolan");

        Movie18 movie2 = new Movie18();
        movie2.setTitle("Interstellar");
        movie2.setDirector("Christopher Nolan");

        Movie18 movie3 = new Movie18();
        movie3.setTitle("The Godfather");
        movie3.setDirector("Francis Ford Coppola");

     Movie18 movie4 = new Movie18();
        movie4.setTitle("Parasite");
        movie4.setDirector("Bong Joon-ho");

        Movie18 movie5 = new Movie18();
        movie5.setTitle("Dangal");
        movie5.setDirector("Nitesh Tiwari");

        for (int i = 0; i < movies.length; i++) {
            if (i == 0) {
                movies[i] = movie1;
          } else if (i == 1) {
                movies[i] = movie2;
          } else if (i == 2) {
                movies[i] = movie3;
            } else if (i == 3) {
              movies[i] = movie4;
            } else if (i == 4) {
                movies[i] = movie5;
            }
        }

        for (int i = 0; i < movies.length; i++) {
            Movie18 m = movies[i];
            if (m != null) {
                System.out.println(m.getTitle());
                System.out.println(m.getDirector());
                System.out.println("----------");
         }
      }
    }
}
