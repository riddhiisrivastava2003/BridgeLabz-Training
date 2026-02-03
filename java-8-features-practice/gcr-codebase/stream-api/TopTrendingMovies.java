import java.util.*;
import java.util.stream.*;

public class TopTrendingMovies{

    static class Movie{

        String name;
        double rating;
        int releaseYear;

        Movie(String name,double rating,int releaseYear){
            this.name=name;
            this.rating=rating;
            this.releaseYear=releaseYear;
        }

        public double getRating(){
            return rating;
        }
        public int getReleaseYear(){
            return releaseYear;
            
        }

        @Override

        public String toString(){

            return name+" ("+releaseYear+") - Rating: "+rating+"/10";

        }




    }



    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        List<Movie> movies=new ArrayList<>();

        System.out.println("Enter number of movies: ");
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){

            System.out.println("Enter movie name: ");
            String name=sc.nextLine();

            System.out.println("Enter movie rating out of 10: ");
            double rating=sc.nextDouble();

            System.out.println("Enter movie release year: ");
            int year=sc.nextInt();
            sc.nextLine();

            movies.add(new Movie(name,rating, year));






        }

        System.out.println("Enter minimum release year to consider trending movies: ");
        int minYear=sc.nextInt();

        System.out.println("Top 5 Trending Movies: ");
        movies.stream()
        .filter(m->m.getReleaseYear() >=minYear)
        .sorted((m1,m2)->Double.compare(m2.getRating(),m1.getRating()))
    .limit(5)
    .forEach(System.out::println);
    }
}

