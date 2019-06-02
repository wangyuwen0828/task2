package gupaoedu.pattern.template.drink;

/**
 * 2019/6/2
 * wangyuwen
 * 模板模式的另外一种实现方式
 */
public class DrinkTest {
    public static void main(String[] args) {
        DrinkAdapter drinkAdapter = new DrinkAdapter(new Drinks() {
            @Override
            public void other() {
                System.out.println("加糖");
            }

            @Override
            protected boolean needOther() {
                return true;
            }
        });

        drinkAdapter.getDrinks().makeDrinks();
    }
}
