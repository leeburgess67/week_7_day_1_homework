package ThemePark;

import Attractions.Attraction;
import Packages.IReviewed;


import java.util.ArrayList;

public abstract class ThemePark {

    private int rating;
    public ArrayList<IReviewed> reviewed;


    public ThemePark(int rating, ArrayList<IReviewed> reviewed) {

        this.rating = rating;
        this.reviewed = new ArrayList<>();
    }

    public int getRating(){
        return this.rating;
    }

    public void addReviewed(IReviewed reviewedThing){
        reviewed.add(reviewedThing);
    }

    public ArrayList getAllReviewed(){
        return reviewed;
    }




}