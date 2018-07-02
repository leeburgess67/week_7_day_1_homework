package Stalls;

public class CandyFloss extends Stall {

    public CandyFloss(String name, String owner, int parkingSpot) {
        super(name, owner, parkingSpot);
    }

    @Override
    public int getRating() {
        return 0;
    }
}
