package collection;

import java.util.Vector;

public class VectorEx3 {
    public static void main(String[] args) {
        
        Vector<String> cars = new Vector<>();

        cars.add("Toyota");   /*index 0*/
        cars.add("Honda");    /*index 1*/
        cars.add("BMW");      /*index 2*/
        cars.add("Mercedes"); /*index 3*/
        cars.add("Tesla");    /*index 4*/
        cars.add("Honda");    /*index 5 (duplicate value)*/

        System.out.println("Initial Car List: " + cars);
        System.out.println("------------------");

        cars.remove((String) "Honda");
        System.out.println("After removing first Honda: " + cars);
        System.out.println("------------------");

        cars.remove(4);
        System.out.println("After removing car at index 4: " + cars);
        System.out.println("------------------");

        /*Now after removing "Tesla", "BMW" is at index 1, and "Mercedes" is at index 2*/
        cars.removeElementAt(1);
        System.out.println("After removeElementAt(1): " + cars);
        System.out.println("------------------");

        /*After the previous removals, "Mercedes" is now at index 2*/
        String carAtIndex2 = cars.get(2);
        System.out.println("Car at index 2: " + carAtIndex2);
        System.out.println("------------------");

        System.out.println("Total number of cars in the list: " + cars.size());
        System.out.println("------------------");

        cars.clear();
        System.out.println("After clearing the list: " + cars);
    }
}
