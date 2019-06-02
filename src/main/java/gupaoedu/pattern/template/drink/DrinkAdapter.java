package gupaoedu.pattern.template.drink;

/**
 * 2019/6/2
 * wangyuwen
 */
public class DrinkAdapter {
    private Drinks drinks;

    private DrinkAdapter(){}

    public DrinkAdapter(Drinks drinks){
        this.drinks=drinks;
    }

    public Drinks getDrinks() {
        return drinks;
    }

    public void setDrinks(Drinks drinks) {
        this.drinks = drinks;
    }
}
