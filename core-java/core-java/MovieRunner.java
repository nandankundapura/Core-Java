public class MovieRunner {
    public static void main(String[] args) {
        Movie14[] movies = new Movie[5];
        for (int i = 0; i < 5; i++) {
            movies[i] = new Movie();
            movies[i].setTitle("Movie " + (i + 1));
            movies[i].setDuration(90 + i * 10);
        }

        for (Movie m : movies) {
            System.out.println(m.getTitle() + " - " + m.getDuration() + " mins");
        }
    }
}
