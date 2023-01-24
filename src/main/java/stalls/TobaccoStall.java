package stalls;

import people.Visitor;

public class TobaccoStall extends Stall {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }


    public String isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 18) {
            return "No bacci for you!";
        }
        return "Welcome you may purchase!";
    }
}
