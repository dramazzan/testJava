package Observer;

import java.util.List;

public class User implements Observer{

    private String name;


    public User(String name ) {
        this.name = name;
    }


    @Override
    public void update(List<String> articles , boolean isAdded) {

        if(isAdded){
            System.out.println("Dear " + name + ", a new article has been added!\n Articles: " + articles);

        }else{
            System.out.println("Dear " + name + ", an article has been removed!\n Articles: \" " + articles);

        }

    }
}
