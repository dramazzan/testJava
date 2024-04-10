package Command;

import Adapter.OnlineCarListing;

public class CarFacade {

    private OnlineCarListing onlineCarListing;

    public CarFacade(){
        onlineCarListing = new OnlineCarListing();
    }


}
