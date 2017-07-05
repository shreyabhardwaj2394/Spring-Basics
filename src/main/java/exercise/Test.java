package exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Shreya on 7/5/2017.
 */
public class Test {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");

        //For Database Class
        Database database=applicationContext.getBean("database",Database.class);
        System.out.println("Obtaining Bean From the Database Class::");
        System.out.println(database.toString());

        //For Restaurant Class
        System.out.println("All the operations over Restaurant Class::");
        Restaurant restaurant=applicationContext.getBean("teaRestaurant",Restaurant.class);
        restaurant.display();

            //To get both the beans
        Tea tea=applicationContext.getBean("tea",Tea.class);
        ExpressTea expressTea=applicationContext.getBean("expressTea",ExpressTea.class);

        restaurant.hotDrink.prepareHotDrink();

        Restaurant restaurant1=applicationContext.getBean("expressTeaRestaurant",Restaurant.class);
        restaurant1.display();


        //For Complex Class which has 3 different types of collections
        Complex complex=applicationContext.getBean("complexBean",Complex.class);
        System.out.println("For different type of Collections:");
        System.out.println("List:");
        System.out.println(complex.getList());
        System.out.println("Set:");
        System.out.println(complex.getSet());
        System.out.println("Map:");
        System.out.println(complex.getMap());

        //For autowiring the Bean
        Restaurant restaurant2=applicationContext.getBean("restaurant",Restaurant.class);
        System.out.println("After Autowiring::");
        System.out.println(restaurant2.getHotDrink());


        //Checking for prototype scope
        System.out.println("Checking the scope of the Bean::");
        System.out.println("(Since the scope is prototype, If the same bean is invoked twice it gives a different message)");
        Restaurant testBean=applicationContext.getBean("teaRestaurant",Restaurant.class);
        Restaurant testAgain=applicationContext.getBean("teaRestaurant",Restaurant.class);
        testBean.setMessage("On Test Bean!!");
        System.out.println("For the first call :"+testBean.getMessage());
        System.out.println("For the second call :"+testAgain.getMessage());
    }
}
