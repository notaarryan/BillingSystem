# Basic Billing System in Java

## Introduction

This is a simple billing system implemented in Java, demonstrating the use of basic Java constructs such as classes, methods, if statements, and switch expressions. The system calculates the total bill for a customer's order based on their choices from a menu and applicable discounts.

## Features

- **Menu Items**: Allows customers to choose food, drinks, and desserts from a menu.
- **Order Calculation**: Calculates the total amount based on the selected items.
- **Discounts**: Applies senior citizen discounts and promotional coupon discounts.
- **Customizable Orders**: Supports different sizes for drinks.

## Classes and Methods

### `CustomerOrder` Class

This class represents a customer's order. It contains the following key components:

- **Attributes**:
  - `orderNumber`: A unique identifier for each order.
  - `foodChoice`: The choice of food item.
  - `drinkChoice`: The choice of drink.
  - `largeDrink`: A boolean indicating if the drink is large.
  - `dessertChoice`: The choice of dessert.
  - `couponCode`: A code for applying a discount.
  - `seniorCitizen`: A boolean indicating if the customer is a senior citizen.
  - `orderAmount`: The total amount of the order.

- **Constructors**:
  - `CustomerOrder(int foodChoice, int drinkChoice, boolean largeDrink, int dessertChoice, String couponCode, boolean seniorCitizen)`: Initializes the order with the specified choices and details.
  - `CustomerOrder(int foodChoice, int drinkChoice, boolean largeDrink, int dessertChoice, String couponCode)`: Initializes the order with the specified choices and details, defaulting to `seniorCitizen` as `false`.

- **Methods**:
  - `double generateOrderBill()`: Calculates and returns the total bill amount after applying applicable discounts.

### `Menu` Class

This class provides the menu details and manages the application of discounts.

- **Methods**:
  - `static double getMenuItemPrice(int choice, boolean largeDrink)`: Returns the price of a menu item based on the customer's choice and drink size.
  - `static double applyCoupon(String couponCode)`: Returns the discount amount based on the provided coupon code.
 
## Installation

To get started with the BillingSystem project, follow these steps:

1. **Clone the repository:**

   ```sh
   git clone https://github.com/notaarryan/BillingSystem.git
   ```

2. **Navigate to the project directory:**

   ```sh
   cd BillingSystem
   ```

3. **Open the project in your favorite IDE or text editor.**


## Usage

To use this billing system:

1. **Create an Order**: Instantiate the `CustomerOrder` class with the customer's choices and details.
2. **Calculate the Bill**: Call the `generateOrderBill` method to compute the total bill, including any discounts.

## Example

```java
CustomerOrder order = new CustomerOrder(1, 7, true, 9, "SAVE4", true);
double totalAmount = order.generateOrderBill();
System.out.println("Total Amount: " + totalAmount);
```

## Conclusion

This basic billing system provides a foundation for building more complex billing and ordering systems in Java. It demonstrates the use of essential Java programming concepts and serves as a practical example for beginners.
