package org.restaurant;

public class Restaurant {
    public static void main(String[] args) {

        MenuItem item1 =new MenuItem("Pepperoni Pizza", "The classic slice, hot and delicious!", 7.39, "main course");
        MenuItem item2 =new MenuItem("Toasted Ravioli", "A St. Louis favorite, served with a size of pizza sauce", 6.89, "appetizer");
        MenuItem item3 =new MenuItem("Chocolate Cake", "Rich, moist cake with dark chocolate cream", 4.99, "dessert");
        MenuItem item4 =new MenuItem("Veggie Pizza", "Peppers, onions, mushrooms, olives, and tomatoes make a delicious combo", 6.39, "main course");
        MenuItem item5 = new MenuItem("Garlic breadsticks", "Hot, garlicky carbs FTW", 4.59, "appetizer" );

        //Create a menu
        Menu menu = new Menu();

        //Add menu items to menu
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);


       // System.out.println(menu.getMenuItems().size());

        // Print the entire menu
        System.out.println(menu);

        //Print just one menu item
        System.out.println(item1);

        // Test equals method
        System.out.println(item1.equals(item2));

        //Remove an item and reprint menu
        menu.removeItem(item4);
        System.out.println(menu);


    }


}