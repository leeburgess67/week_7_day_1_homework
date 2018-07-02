package ThemePark;

import Packages.IReviewed;

import java.util.ArrayList;

public abstract class ThemePark {

    private int rating;
    public ArrayList<IReviewed> reviewed;


    public ThemePark(int rating, ArrayList<IReviewed> reviewed) {
        this.rating = rating;
    }

    public int getRating(){
        return this.rating;
    }

    public ArrayList getAllReviewed(){
        return reviewed;
    }




}