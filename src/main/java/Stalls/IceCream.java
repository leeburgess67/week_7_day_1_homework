package Stalls;

public class IceCream extends Stall {

    public IceCream(String name, String owner, int parkingSpot) {
        super(name, owner, parkingSpot);
    }

    @Override
    public int getRating() {
        return 0;
    }
}
