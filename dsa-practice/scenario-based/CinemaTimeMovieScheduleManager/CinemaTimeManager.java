import java.util.*;
public class CinemaTimeManager {

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