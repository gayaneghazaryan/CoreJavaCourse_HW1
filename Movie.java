package com.company;

public class Movie {
    private String title;
    private int year;
    private String DirectorName;
    private String DirectorSurname;
    private String genre;
    private boolean isOscarWinning;

    public void setDirector(String directorName, String directorSurname) {
        setDirectorName(directorName);
        setDirectorSurname(directorSurname);
    }

    public String getDirector() {
        return getDirectorName() + " " + getDirectorSurname();
    }

    public boolean isOscarWinning() {
        return isOscarWinning;
    }

    public void setOscarWinning(boolean oscarWinning) {
        isOscarWinning = oscarWinning;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 0 || year > 2021) {
            System.out.println("Wrong year input");
            System.exit(0);
        }
        this.year = year;
    }

    public String getDirectorName() {
        return DirectorName;
    }

    public void setDirectorName(String directorName) {
        DirectorName = directorName;
    }

    public String getDirectorSurname() {
        return DirectorSurname;
    }

    public void setDirectorSurname(String directorSurname) {
        DirectorSurname = directorSurname;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        String oscarString;
        if(isOscarWinning) {
            oscarString = "yes";
        }else {
            oscarString = "no";
        }

        return  "Title: '" + title + '\'' +
                "\nYear: " + year +
                "\nDirector: " + DirectorName +" " + DirectorSurname +
                "\nGenre: " + genre +
                "\nHas won Oscar: " + oscarString;
    }
}

