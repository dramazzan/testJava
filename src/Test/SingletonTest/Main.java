package Test.SingletonTest;



public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();

        if(s1 == s2){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }



}
