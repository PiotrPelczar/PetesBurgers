import java.util.Scanner;

public class Hamburger {

    public int breadRollType;
    public int meat;
    public int price;
    public int lettuce;
    public int tomato;
    public int pickles;
    public int totalAdds;
    Scanner scanner = new Scanner(System.in);
    public int lettucePrice = 1;
    public int tomatoPrice = 1;
    public int picklesPrice = 1;
    public int wheatBunPrice = 2;
    public int wholeGrainBunPrice = 3;
    public int meatPrice = 4;

    public Hamburger(int breadRollType, int meat) {
        this.breadRollType = breadRollType;
        if (breadRollType == 1) {
            price += wheatBunPrice;
        } else if (breadRollType == 2) {
            price += wholeGrainBunPrice;
        }
        this.meat = meat;
        if (meat > 0 && meat < 10) {
            price += meatPrice * meat;
        }

        this.price = price;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.pickles = pickles;
        this.totalAdds = totalAdds;
    }


    public int getBreadRollType() {
        return breadRollType;
    }

    public int getMeat() {
        return meat;
    }

    public int getPrice() {
        return price;
    }

    public void setLettuce(int lettuce) {
        this.lettuce = lettuce;
        if ((lettuce <= 4) && (totalAdds <= 4) && (lettuce + totalAdds < 5)) {
            totalAdds = totalAdds + lettuce;
            price += lettucePrice * lettuce;
        }
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
        if ((tomato <= 4) && (totalAdds <= 4) && (tomato + totalAdds < 5)) {
            totalAdds = totalAdds + tomato;
            price += tomatoPrice * tomato;
        }
    }

    public void setPickles(int pickles) {
        this.pickles = pickles;
        if ((pickles <= 4) && (pickles <= 4) && (pickles + totalAdds < 5)) {
            totalAdds = totalAdds + pickles;
            price += picklesPrice * pickles;
        }
    }

    public int getTotalAdds() {
        return totalAdds;
    }

    public void getStandardPrice() {
        int standardPrice = meatPrice + lettucePrice + tomatoPrice + picklesPrice + wheatBunPrice;
        System.out.println("The standard price for hamburger is: " + standardPrice + "$");
    }


    public void getHamburger() {
        System.out.println("Custom Burger Selected: ");
        if (this.breadRollType == 1) {
            System.out.println("Wheat Bun - " + wheatBunPrice + "$");
        } else if (this.breadRollType == 2) {
            System.out.println("Wholegrain bun - " + wholeGrainBunPrice + "$");
        }
        int meatTotal = this.meat * meatPrice;
        System.out.println(this.meat + " x meat - " + meatTotal + "$");
        int veggiesTotalPrice = this.lettuce * lettucePrice + this.tomato * tomatoPrice + this.pickles * picklesPrice;
        int veggiestotalAmount = this.lettuce + this.pickles + this.tomato;
        System.out.println(veggiestotalAmount + " x veggies - " + veggiesTotalPrice + "$");
        System.out.println("Total: " + this.price + "$");
    }


}





