package movierecommendationsystem;
import java.util.*;

public class MovieRecommendationSystem {
    private List<Movie> movieList;

    public MovieRecommendationSystem() {
        movieList = new ArrayList<>();
    }

    public void addMovie(String title, String director, int releaseYear) {
        Movie movie = new Movie(title, director, releaseYear);
        movieList.add(movie);
    }

    public void rateMovie(String title, double rating) {
        Movie movie = searchMovie(title);
        if (movie != null) {
            movie.addRating(rating);
            System.out.println("Rating added successfully!");
        } else {
            System.out.println("Movie not found!");
        }
    }

    public Movie searchMovie(String title) {
        for (Movie movie : movieList) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return movie;
            }
        }
        return null;
    }

    public void displayMovies() {
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }

    public void displayTopRatedMovies() {
        movieList.sort((m1, m2) -> Double.compare(m2.getRating(), m1.getRating()));
        int count = 0;
        for (Movie movie : movieList) {
            if (count >= 5) break;
            System.out.println(movie);
            count++;
        }
    }

    public static void main(String[] args) {
        MovieRecommendationSystem system = new MovieRecommendationSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Movie");
            System.out.println("2. Rate Movie");
            System.out.println("3. Search Movie");
            System.out.println("4. Display All Movies");
            System.out.println("5. Display Top Rated Movies");
            System.out.println("6. Exit");
            System.out.println("enter your choice");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter title:");
                    String title = scanner.nextLine();
                    System.out.println("Enter director:");
                    String director = scanner.nextLine();
                    System.out.println("Enter release year:");
                    int releaseYear = scanner.nextInt();
                    system.addMovie(title, director, releaseYear);
                    break;
                case 2:
                    System.out.println("Enter title:");
                    title = scanner.nextLine();
                    System.out.println("Enter rating:");
                    double rating = scanner.nextDouble();
                    system.rateMovie(title, rating);
                    break;
                case 3:
                    System.out.println("Enter title:");
                    title = scanner.nextLine();
                    Movie movie = system.searchMovie(title);
                    if (movie != null) {
                        System.out.println(movie);
                    } else {
                        System.out.println("Movie not found!");
                    }
                    break;
                case 4:
                    system.displayMovies();
                    break;
                case 5:
                    system.displayTopRatedMovies();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
