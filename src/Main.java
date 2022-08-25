import java.util.Scanner;

public class Main {
    public static void main (String [] args){

    Hamburger randomHamburger = new Hamburger(1,1);


    Hamburger peterBurger = new Hamburger(1,4);
    HealthyBurger katia = new HealthyBurger();
    HamburgerSet benny = new HamburgerSet();


    peterBurger.setTomato(1);
    peterBurger.setPickles(1);
    peterBurger.setLettuce(1);
    peterBurger.getHamburger();

        System.out.println();


    katia.setHealthyStuff(1);
    katia.getHealthyHamburger();

        System.out.println();


    benny.getSetBurger();











    }
}
