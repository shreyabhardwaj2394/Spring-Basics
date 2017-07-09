package exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Shreya on 7/5/2017.
 */
@Component
public class Test {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");


        //For Autowiring and Required annotations
        System.out.println("All the operations over exercise.Restaurant Class::");
        Restaurant restaurant=applicationContext.getBean("restaurant",Restaurant.class);
        restaurant.display();



    }
}