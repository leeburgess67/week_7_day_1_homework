package Stalls;

import Packages.IReviewed;

public abstract class Stall implements IReviewed {

    private String name;
    private String owner;
    private int parkingSpot;


    public Stall(String name, String owner, int parkingSpot){
        super();
        this.name = name;
        this.owner = owner;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return this.name;
    }

    public String getOwner() { return this.owner;}

    public int getParkingSpot() { return this.parkingSpot;}







}
