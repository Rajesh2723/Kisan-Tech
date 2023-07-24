package ex08.coll.lists;
 
import java.util.*;
 
public class ArrayListDemo {
 
    public static void main(String[] args) {
        ArrayList<String> fruitsBag = new ArrayList<String>();
        fruitsBag.add("Apples");
        fruitsBag.add("Oranges");
        fruitsBag.add("Watermelon");
        fruitsBag.add("Bananas");
        fruitsBag.add("Papaya");
        System.out.println("1. " + fruitsBag);

        // add something in the middle
        fruitsBag.add(2, "Berries");
        System.out.println("2. " + fruitsBag);

        // replace an element with another
        fruitsBag.set(2, "Blue Berries");
        System.out.println("3. " + fruitsBag);

        // remove an element from a position
        String removedItem = fruitsBag.remove(3);
        System.out.println(removedItem);

        // remove an element by name
        boolean isItemRemoved = fruitsBag.remove("Banana");
        System.out.println(isItemRemoved); // false -> Banana != Bananas

        System.out.println("4. " + fruitsBag);

        // New List of vegetables
        List<String> vegetables = List.of("Tomatos", "Potatos", "Beans", "Onions", "Cabbage");
        System.out.println("5. " + vegetables);

        // New list of Fast food
        // var was introduced in Java 10
        var fastFood = new ArrayList<String>();
        fastFood.add("Pizza");
        fastFood.add("Burger");
        fastFood.add("Pazzta");
        System.out.println("6. " + fastFood);

        // Put all these bags into the bigger one
        ArrayList<String> bigBag = new ArrayList<String>(fruitsBag);
        bigBag.addAll(vegetables);
        bigBag.addAll(fastFood);

        System.out.println("7. " + bigBag);

        // Duplicates are allowed
        bigBag.add("Oranges");
        System.out.println("8. " + bigBag);

        // null values can also be stored
        bigBag.add(null);
        System.out.println("9. " + bigBag);
