package exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * Created by Shreya on 7/5/2017.
 */

interface HotDrink{
    void prepareHotDrink();
}


@Component  //@service and @controller can also be used here
public class Restaurant {
    @Autowired
    HotDrink hotDrink;
    public Restaurant() {
    }

    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }


    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    void display(){
        System.out.println(hotDrink.toString());
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "hotDrink=" + hotDrink +
                '}';
    }
}

@Component
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

@Component
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