package Quiz_02;

public class Author {

    String firstName = "Mohaimin ";
    String lastName = "Rahat";

    public void printInfo(){
        System.out.println(firstName+lastName);

    }

    public static void main(String[] args) {

        Author a = new Author();
        a.printInfo();
    }
}
