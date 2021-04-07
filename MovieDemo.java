package com.company;

public class MovieDemo {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setTitle("A Beautiful Mind");
        movie1.setYear(2001);
        movie1.setDirector("Ron", "Howard");
        movie1.setGenre("drama");
        movie1.setOscarWinning(true);

        //String director1 = movie1.getDirector();

        //System.out.println(director1);
        System.out.println(movie1);
        System.out.println();

        Movie movie2 = new Movie();
        movie2.setTitle("Hidden Figures");
        movie2.setYear(2017);
        movie2.setDirector("Theodore","Melfi");
        movie2.setGenre("drama");
        movie2.setOscarWinning(false);

        //String director2 = movie2.getDirector();
        //System.out.println(director2);
        System.out.println(movie2);
    }
}
