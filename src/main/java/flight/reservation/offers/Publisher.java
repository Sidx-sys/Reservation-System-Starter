package flight.reservation.offers;
import java.util.List;

public class Publisher {
    private List<Subscriber> offerSubs;

    public void addSubscriber(Subscriber sub){
        offerSubs.add(sub);
    }
    public void removeSubscriber(Subscriber sub){
        offerSubs.remove(sub);
    }

    public void update(String offerData){
        for (Subscriber sub : offerSubs) {
            sub.update("Offer !! offer!! offer!! :"+ offerData);
        }    
    }
}
