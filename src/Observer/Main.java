package Observer;

public class Main {

    public static void main(String[] args)  {

        String article1 = "Article 1";
        String article2 = "Article 2";
        String article3 = "Article 3";
        String article4= "Article 4";


        Journal journal = new Journal();



        Observer firstUser = new User("Ramazan");
        Observer admin = new Admin("Dimash");

        journal.addUserAdmin(firstUser);
        journal.addUserAdmin(admin);

        journal.addArticle(article1);
        journal.addArticle(article2);


        journal.removeArticle(article2);
        journal.removeArticle(article1);





    }


}
