// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// import java.util.Scanner;

import java.util.*;

class InvalidTimeFormatException extends Exception {

    public InvalidTimeFormatException(String message) {
        super(message);
    }
}

class CinemaTimeManager {

    private List<String> movieTitles = new ArrayList<>();
    private List<String> movieTimes = new ArrayList<>();

    private boolean isValidTime(String time) {
        String regex = "^(?:[01]\\d|2[0-3]):[0-5]\\d$";
        return time != null && time.matches(regex);
    }

    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!isValidTime(time)) {
            throw new InvalidTimeFormatException("invalid time format: " + time);
        }
        movieTitles.add(title);
        movieTimes.add(time);
    }
    public void searchMovie(String keyword) {
        boolean found = false;
        for (int i = 0; i < movieTitles.size(); i++) {
            String title = movieTitles.get(i);
            if (title.toLowerCase().contains(keyword.toLowerCase())) {
                String time = movieTimes.get(i);
                String formatted = String.format("%s - %s", title, time);
                System.out.println("[" + i + "] " + formatted);
                found = true;
            }
        }
        if (!found) {
            System.out.println("no movies found for: " + keyword);
        }
    }

    public void displayAllMovies() {
        if (movieTitles.isEmpty()) {
            System.out.println("no movies scheduled");
            return;
        }
        System.out.println("all movies: ");
        for (int i = 0; i < movieTitles.size(); i++) {
            String formatted = movieTitles.get(i) + " - " + movieTimes.get(i);
            System.out.println("[" + i + "] " + formatted);
        }
    }

    public void printMovieByIndex(int index) {
        try {
            String title = movieTitles.get(index);
            String time = movieTimes.get(index);
            System.out.println("movie at index " + index + ": " + title + " - " + time);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("invalid index: " + index + " please enter a valid movie index");
        }
    }
    public String[] generateReportArray() {
        String[] report = new String[movieTitles.size()];
        for (int i = 0; i < movieTitles.size(); i++) {
            report[i] = String.format("%s - %s", movieTitles.get(i), movieTimes.get(i));
        }
        return report;
    }
}

public class CinemaTimeMovieScheduleManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CinemaTimeManager manager = new CinemaTimeManager();

        while (true) {
            System.out.println("\n--- Cinema Time Menu ---");
            System.out.println("1. add movie");
            System.out.println("2. search movie");
            System.out.println("3. display all movies");
            System.out.println("4. print movie by index");
            System.out.println("5. generate report");
            System.out.println("6. exit");

            int choice = sc.nextInt();
            sc.nextLine();          

            switch (choice) {

                case 1:
                    try {
                        System.out.println("enter movie title:");
                        String title = sc.nextLine();

                        System.out.println("enter show time (hh:mm):");
                        String time = sc.nextLine();

                        manager.addMovie(title, time);
                    } catch (InvalidTimeFormatException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("enter keyword to search:");
                    String keyword = sc.nextLine();
                    manager.searchMovie(keyword);
                    break;

                case 3:
                    manager.displayAllMovies();
                    break;

                case 4:
                    System.out.println("enter index:");
                    int index = sc.nextInt();
                    manager.printMovieByIndex(index);
                    break;

                case 5:
                    String[] report = manager.generateReportArray();
                    System.out.println("printable report:");
                    System.out.println(Arrays.toString(report));
                    break;

                case 6:
                    System.out.println("exiting program...");
                    System.exit(0);

                default:
                    System.out.println("invalid choice!");
            }
        }
    }
}