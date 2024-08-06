public class Menu {

    public static double getMenuItemPrice(int choice, boolean largeDrink) {
        double itemPrice = 0.0;

        return switch (choice) {
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
                yield 0.0;
            }
        };
    }

    public static double applyCoupon(String couponCode) {
        return switch (couponCode) {
            case "SAVE4" -> 4.0;
            case "HAPPYHOUR" -> 5.0;
            case "SPECIAL3OFF" -> 3.0;
            case "SUNDAY2OFF", "GOODSTUDENT" -> 2.0;
            default -> 0.0;
        };
    }
}