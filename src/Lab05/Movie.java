package Lab05;

public class Movie {

    private String title = "";
    private int year = 1900;

    Movie(String movieTitle, int movieYear){
        this.title = movieTitle;
        this.year = movieYear;
    }

    public String getTitle(){
        return this.title;
    }

    public String setTitle(String userTitle){
        this.title = userTitle;
        return this.title;
    }


    public String toString(){
        return this.title + this.year;
    }
}
