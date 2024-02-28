package Observer;

public interface Observered {

     void addUserAdmin(Observer observer);

     void removeUserAdmin(Observer observer);

     void notifyUser(boolean isAdded);


}
