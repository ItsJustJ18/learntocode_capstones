# **DELI-CIOUS SANDWICH SHOP**

The project is designed as a capstone project for the LearnToCode series and demonstrates the usage of object-oriented programming concepts in Java, including classes, enums, constructors, and methods. Being able to make a sandwhich with many components, drink, and chips. With that it will be added to orders and add a sum of what is needed to complete a customer's receipt.

## **UML Diagram**

![super-uber-snack-shack-diagram](https://github.com/user-attachments/assets/fcbe2ebb-b2af-42b7-ab4d-ef363aa6a6d1)


## **Features**

Customizable Sandwiches: Users can select from a variety of bread types, bread lengths, meats, cheeses, toppings, sauces, and sides.
Prices are calculated by either a hard code implemented with the class itself or made depending on what the sizes of small, medium, or large.

Order Management: Multiple sandwiches can be added to an order with or without a drink or chips. A receipt with the total price is generated.
Toasting Option: Users can choose whether their sandwich is toasted or not

Enums: Various enums are used for components like bread types, meats, toppings, and sauces, each with an associated price.
ArrayLists: Used to manage dynamic lists of ingredients, like toppings.
Object-Oriented Programming: Classes and methods are used to model the sandwich creation and order management process.

## **Need to Run Program**

Make sure you have Java 8 or higher installed. Preferably want to use Java 17.
(If Java isn't installed then go to https://www.oracle.com/java/technologies/downloads/)

Installation
Clone the Repository: If you have Git installed, you can clone the repository to your local machine.

GitHub repository link for Command Prompt: git clone https://github.com/ItsJustJ18/learntocode_capstones.git
Then git clone again to the delicious-sandwich-shop repository

Run the Program: In the Initialize Program package -> RunSandwichShop

This will simulate the creation of a order of sandwiches with toppings, drinks, and chips. Display the sandwich details, chips details, and drink details as well.

Example of what can make a sandwich in the program:

Receipt: For Order

Sandwich:

Bread Length: MEDIUM

Bread Type: WHEAT

Cheese: CHEDDAR

Meat: BEEF

Toppings: [LETTUCE, TOMATO]

Sauce: MAYO

Side: PEPPER FLAKES

Toasted: Yes

Price: totalPriceOfSandwich += breadLength.getPrice() + meats.getMeatPrice + cheese.getCheesePrice();

--------------------------------------------------------------------------------------------------------------

Sandwich:

Bread Length: LARGE

Bread Type: RYE

Cheese: SWISS

Meat: CHICKEN

Toppings: [PICKLE]

Sauce: KETCHUP

Side: PEPPER

Toasted: No

Price: totalPriceOfSandwich += breadLength.getPrice() + meats.getMeatPrice + cheese.getCheesePrice();

-------------------------------------------------------------------------------------------------------------------

Customizing Sandwiches

The program lets you customize your sandwich with different options for:

Bread Type: (White, Wheat, Rye, etc...)

Bread Length: (Small, Medium, Large)

Cheese: (Cheddar, Swiss, American, etc...)

Meat: (Beef, Chicken, Ham, etc...)

Toppings: (Lettuce, Tomato, Onion, Pickle, etc..)

Sauce: (Mayo, Mustard, BBQ, Ranch etc...)

Side: (Salt, Pepper etc...)

Toasted Option: Choose whether the sandwich should be toasted.

Receipt Output
The program will print the sandwich receipt showing:

The sandwich components selected (bread, cheese, toppings, etc.)
The price of each sandwich
The total price for the order (sandwich, drink, and/or chips)

Adding More Ingredients
To add more bread types, cheese, meats, or toppings, you can modify the corresponding enum classes (e.g., BreadType.java, Topping.java, etc...)

Modifying Price Calculation: Based on bread length, certain prices will be able to change. Drinks are the same as well, but chips are hard coded since they are basically all the same while drinks changes price based on the size

## More Features

Custom Ingredient Quantities: Allow users to specify how many of each topping they want (e.g., extra cheese, double meat).

Order History: Implement functionality to save and display past orders into a receipt folder that then has files created and saved into it.

License
This project is open-source

Author: Jermaine Eggleston (ItsJustJ18)

## Images

![Screenshot 2024-11-15 090035](https://github.com/user-attachments/assets/88d87bc4-c716-48a6-8449-d921bddb6e08)
![Screenshot 2024-11-15 090303](https://github.com/user-attachments/assets/d5cb3dde-b790-41fa-8584-707dd8125fcf)
![Screenshot 2024-11-15 090356](https://github.com/user-attachments/assets/46c2b663-4b62-4863-8eb0-b70a0b960715)
![Screenshot 2024-11-15 090800](https://github.com/user-attachments/assets/137536e0-6a05-4bc3-b60c-f4c1b63db42f)

