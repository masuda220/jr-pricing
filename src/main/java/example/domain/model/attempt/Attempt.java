package example.domain.model.attempt;

import example.domain.model.spacification.*;

/**
 * 購入希望
 */
public class Attempt {
    int adult;
    int child;

    DepartureDate departureDate;
    Destination destination;

    SeatType seatType;
    TrainType trainType;
    TripType tripType;

    public Attempt(int adult, int child, DepartureDate departureDate, Destination destination, SeatType seatType, TrainType trainType, TripType tripType) {
        this.adult = adult;
        this.child = child;
        this.departureDate = departureDate;
        this.destination = destination;
        this.seatType = seatType;
        this.trainType = trainType;
        this.tripType = tripType;
    }

    public Destination to() {
        return destination;
    }

    @Override
    public String toString() {
        return  "大人=" + adult + "人" +
                "\n子供=" + child + "人" +
                "\n出発日=" + departureDate +
                "\n目的地=" + destination +
                "\n座席区分=" + seatType +
                "\n列車種類=" + trainType +
                "\n片道/往復=" + tripType
                ;
    }
}