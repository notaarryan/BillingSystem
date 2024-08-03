public class Menu {

    public static double getMenuItemPrice(int choice, boolean largeDrink) {
        double itemPrice = 0.0;

        return switch (choice) {
            case 0 -> {
                yield  itemPrice = 0.0;
            }
            case 1 -> {
                yield itemPrice = 12.0;
            }
            case 2 -> {
                yield itemPrice = 8.0;
            }
            case 3 -> {
                yield itemPrice = 10.0;
            }
            case 4 -> {
                yield itemPrice = 15.0;
            }
            case 5 -> {
                yield itemPrice = 7.0;
            }
            case 6 -> {
                yield itemPrice = 9.0;
            }
            case 7 -> {
                if (largeDrink) {
                    yield itemPrice = 4.0;
                } else {
                    yield itemPrice = 3.0;
                }
            }
            case 8 -> {
                if (largeDrink) {
                    yield itemPrice = 5.0;
                } else {
                    yield itemPrice = 3.0;
                }
            }
            case 9 -> {
                yield itemPrice = 5.0;
            }
            case 10 -> {
                yield itemPrice = 6.0;
            }
            default -> {
                yield itemPrice = 0.0;
            }
        };
    }

    public static double applyCoupon(String couponCode) {
        double discount = 0.0;

        switch (couponCode) {
            case "SAVE4": discount = 4.0;
                break;
            case "HAPPYHOUR": discount = 5.0;
                break;
            case "SPECIAL3OFF": discount = 3.0;
                break;
            case "SUNDAY2OFF": discount = 2.0;
                break;
            case "GOODSTUDENT": discount = 2.0;
                break;
            default: discount = 0.0;
                break;
        }

        return discount;
    }
}