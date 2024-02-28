package Observer;

import java.util.List;

public class Admin implements Observer{

    private String name;

    public Admin(String name){
        this.name = name;
    }


    @Override
    public void update(List<String> articles, boolean isAdded) {
        if(isAdded){
            System.out.println("Dear ADMIN " + name + ", a new article has been added!\n Articles: " + articles);

        }else{
            System.out.println("Dear ADMIN" + name + ", an article has been removed!\n Articles: \" " + articles);

        }
    }
}
