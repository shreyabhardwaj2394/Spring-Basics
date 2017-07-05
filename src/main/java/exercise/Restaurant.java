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

    HotDrink hotDrink;
    String message;     //To test the scope of the bean

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

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
}

class Tea implements HotDrink{
    @Override
    public String toString() {
        return "Tea{}";
    }

    @Override
    public void prepareHotDrink() {
        System.out.println("Tea object");
    }
}

class  ExpressTea implements HotDrink{
    @Override
    public String toString() {
        return "ExpressTea{}";
    }

    @Override
    public void prepareHotDrink() {
        System.out.println("ExpressTea object");
    }
}