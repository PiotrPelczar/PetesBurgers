public class HamburgerSet extends Hamburger{

    private int price;
    private int lettuce;
    private int tomato;
    private int pickles;
    private int totalAdds;
    private int coke;
    private int fries;
    private int cokePrice;
    private int friesPrice;


    public HamburgerSet() {
        super(1, 2);
        this.lettuce = 1;
        this.tomato = 1;
        this.pickles = 1;
        this.totalAdds = 4;
        this.coke = 1;
        this.fries = 1;
        this.friesPrice = 2;
        this.cokePrice = 3;
    }

    public void setCoke(int coke) {
        this.coke = coke;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 14;
    }

    public void getSetBurger() {
        System.out.println("Burger Set selected: ");

        System.out.println("Wholegrain bun - " + wholeGrainBunPrice + "$");
        int meatTotal = this.meat * meatPrice;
        System.out.println(this.meat + " x meat - " + meatTotal + "$");
        int veggiesTotalPrice = this.lettuce * lettucePrice + this.tomato * tomatoPrice + this.pickles * picklesPrice;
        int veggiestotalAmount = this.lettuce + this.pickles + this.tomato;
        System.out.println(veggiestotalAmount + " x veggies - " + veggiesTotalPrice + "$");
        System.out.println("Fries: " + friesPrice +"$");
        System.out.println("Coke: " + cokePrice +"$");
        int totalPrice = veggiesTotalPrice + meatTotal + wholeGrainBunPrice + friesPrice + cokePrice;
        System.out.println("Total: " + totalPrice + "$");
    }
}
