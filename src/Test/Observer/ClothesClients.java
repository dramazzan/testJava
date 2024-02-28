package Test.Observer;

public class ClothesClients implements Subscriber{

    private String name;
    private int age;
    private String email;

    public ClothesClients(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public void update() {

    }
}

