public class CustomerOrder {

    static int orderNumber = 1000;

    static double seniorDiscount = 2.0;

    // Variables that define a customer's order
    int foodChoice;
    int drinkChoice;
    boolean largeDrink;
    int dessertChoice;
    String couponCode;
    boolean seniorCitizen;

    double orderAmount = 0.0;

    public CustomerOrder(int foodChoice, int drinkChoice, boolean largeDrink, int dessertChoice, String couponCode, boolean seniorCitizen) {
        this.foodChoice = foodChoice;
        this.drinkChoice = drinkChoice;
        this.largeDrink = largeDrink;
        this.dessertChoice = dessertChoice;
        this.couponCode = couponCode;
        this.seniorCitizen = seniorCitizen;

        orderNumber = orderNumber + 1;
    }

    public CustomerOrder(int foodChoice, int drinkChoice, boolean largeDrink, int dessertChoice, String couponCode) {
        this(foodChoice, drinkChoice, largeDrink, dessertChoice, couponCode, false);
    }

    public double generateOrderBill() {

        double foodPrice = Menu.getMenuItemPrice(foodChoice, largeDrink);
        double drinkPrice = Menu.getMenuItemPrice(drinkChoice, largeDrink);
        double dessertPrice = Menu.getMenuItemPrice(dessertChoice, largeDrink);

        orderAmount = foodPrice + drinkPrice + dessertPrice;

        if (orderAmount > 10.0) {
            orderAmount -= Menu.applyCoupon(couponCode);
        }

        // Apply discount if customer is a senior citizen
        if (seniorCitizen) {
            orderAmount -= seniorDiscount;
        }

        return orderAmount;
    }

}