package example.domain.model;

/**
 * 購入希望
 */
public class Attempt {
    int adult;
    int child;
    Destination destination;
    TrainType trainType;
    TripType tripType;

    public Attempt(int adult, int child, Destination destination, TrainType trainType, TripType tripType) {
        this.adult = adult;
        this.child = child;
        this.destination = destination;
        this.trainType = trainType;
        this.tripType = tripType;
    }

    @Override
    public String toString() {
        return  "大人=" + adult + "人" +
                "\n子供=" + child + "人" +
                "\n目的地=" + destination +
                "\n列車種類=" + trainType +
                "\n片道/往復=" + tripType
                ;
    }
}