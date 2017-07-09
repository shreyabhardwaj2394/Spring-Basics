package exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by Shreya on 7/5/2017.
 */

interface HotDrink{
    void prepareHotDrink();
}

public class Restaurant {

    //@Autowired    for autowiring using field
    HotDrink hotDrink;
    public Restaurant() {

    }
    //@Autowired        for autowiring using constructor
    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }
    @Autowired    //    for  autowiring using setter
    @Required
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    void display(){
        System.out.println(hotDrink.toString());
    }
}

class Tea implements HotDrink{
    @Override
    public String toString() {
        return "exercise.Tea{}";
    }

    @Override
    public void prepareHotDrink() {
        System.out.println("exercise.Tea object");
    }
}

class  ExpressTea implements HotDrink{
    @Override
    public String toString() {
        return "exercise.ExpressTea{}";
    }

    @Override
    public void prepareHotDrink() {
        System.out.println("exercise.ExpressTea object");
    }
}