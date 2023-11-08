package Quiz_02;

public class Movie {
    String title ="Titanic";
    String stdio ="Paramount Pictures";
    double rating = 7.9;

    public void movieDetail(){
        System.out.println("Name of the Movie:"+title);
        System.out.println("Production Studio:"+stdio);
        System.out.println("IMDB Rating:"+rating);
    }

    public static void main(String[] args) {
        Movie m= new Movie();
        m.movieDetail();
    }

}
