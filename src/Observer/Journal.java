package Observer;

import java.util.ArrayList;
import java.util.List;

public class Journal implements Observered {

    private final List<String> articles = new ArrayList<>();

    private final List<Observer> users = new ArrayList<>();


    public void addArticle(String article){
        this.articles.add(article);
        notifyUser(true);
    }

    public void removeArticle(String article){
        this.articles.remove(article);
        notifyUser(false);
    }
    @Override
    public void addUserAdmin(Observer observer) {
        this.users.add(observer);

    }
    @Override
    public void removeUserAdmin(Observer observer) {
        this.users.remove(observer);

    }

    @Override
    public void notifyUser(boolean isAdded) {
        for(Observer user: users){
            user.update(this.articles , isAdded);
        }
    }


}
