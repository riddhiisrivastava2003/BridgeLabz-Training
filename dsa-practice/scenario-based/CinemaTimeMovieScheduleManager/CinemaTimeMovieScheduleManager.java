import java.util.*;
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