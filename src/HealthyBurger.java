public class HealthyBurger extends Hamburger {

    private int price;
    private int lettuce;
    private int tomato;
    private int pickles;
    private int totalAdds;
    private int onions;
    private int healthyStuff;
    private int healthyStuffPrice;


    public HealthyBurger() {
        super(2, 1);

        this.price = price;
        this.lettuce = 1;
        this.tomato = 1;
        this.pickles = 1;
        this.totalAdds = 6;
        this.healthyStuff = healthyStuff;
        this.onions = onions;
        this.healthyStuffPrice = 2;

    }

    public int getLettuce() {
        return lettuce;
    }

    public void setOnions(int onions) {
        this.onions = onions;
        if ( (onions <= 2) && (totalAdds <= 6) && (onions + totalAdds < 7) ) {
            totalAdds = totalAdds + onions;
            price += onions * 2;
        }
    }

    public void setHealthyStuff(int healthyStuff) {
        this.healthyStuff = healthyStuff;
        if ( (lettuce <= 6) && (totalAdds <= 6) && (healthyStuff + totalAdds < 7) ) {
            totalAdds = totalAdds + healthyStuff;
            price += healthyStuff * healthyStuffPrice;
        }
    }

    public void getHealthyHamburger() {
        System.out.println("Healthy Burger Selected: ");

        System.out.println("Wholegrain bun - " + wholeGrainBunPrice + "$");
        int meatTotal = this.meat * meatPrice;
        System.out.println(this.meat + " x meat - " + meatTotal + "$");
        int veggiesTotalPrice = this.lettuce * lettucePrice + this.tomato * tomatoPrice + this.pickles * picklesPrice;
        int veggiestotalAmount = this.lettuce + this.pickles + this.tomato;
        System.out.println(veggiestotalAmount + " x veggies - " + veggiesTotalPrice + "$");
        int healthystuffTotal = healthyStuff*healthyStuffPrice;
        System.out.println("Healthy stuff: " + healthystuffTotal+"$");
        int totalPrice = veggiesTotalPrice + meatTotal + wholeGrainBunPrice + healthystuffTotal;
        System.out.println("Total: " + totalPrice + "$");
    }

}



