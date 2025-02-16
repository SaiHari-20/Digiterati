/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Collections;

/**
 *
 * @author Sai Hari
 */
import java.util.*;

public class CollectionAPI {

    public static void main(String[] args) {
        // 1. Create an ArrayList, add some colors, and print the collection
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        System.out.println("Colors: " + colors);

        // 2. Iterate through all elements in an ArrayList
        for (String color : colors) {
            System.out.println(color);
        }

        // 3. Insert an element at the first position
        colors.add(0, "Yellow");
        System.out.println("After inserting at first position: " + colors);

        // 4. Retrieve an element from a specific index
        System.out.println("Element at index 2: " + colors.get(2));

        // 5. Update an array element
        colors.set(1, "Black");
        System.out.println("After update: " + colors);

        // 6. Remove the third element
        colors.remove(2);
        System.out.println("After removing third element: " + colors);

        // 7. Search for an element
        System.out.println("Contains 'Green'? " + colors.contains("Green"));

        // 8. Sort an ArrayList
        Collections.sort(colors);
        System.out.println("Sorted List: " + colors);

        // 9. Copy one ArrayList to another
        ArrayList<String> copyColors = new ArrayList<>(colors);
        System.out.println("Copied List: " + copyColors);

        // 10. Shuffle elements in an ArrayList
        Collections.shuffle(colors);
        System.out.println("Shuffled List: " + colors);

        // 11. Append an element to the end of a LinkedList
        LinkedList<String> linkedList = new LinkedList<>(colors);
        linkedList.add("Purple");
        System.out.println("After appending: " + linkedList);

        // 12. Iterate through a LinkedList
        for (String item : linkedList) {
            System.out.println(item);
        }

        // 13. Iterate through a LinkedList from a specified position
        ListIterator<String> iterator = linkedList.listIterator(2);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 14. Iterate a LinkedList in reverse order
        Iterator<String> reverseIterator = linkedList.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }

        // 15. Insert at a specified position in a LinkedList
        linkedList.add(2, "Pink");
        System.out.println("After inserting at position 2: " + linkedList);

        // 16. Insert at first and last positions in a LinkedList
        linkedList.addFirst("White");
        linkedList.addLast("Black");
        System.out.println("After inserting at first and last: " + linkedList);

        // 17. Insert at the front of a LinkedList
        linkedList.offerFirst("Gray");
        System.out.println("After inserting at front: " + linkedList);

        // 18. Insert at the end of a LinkedList
        linkedList.offerLast("Cyan");
        System.out.println("After inserting at end: " + linkedList);

        // 19. Insert multiple elements at a specified position
        linkedList.addAll(3, Arrays.asList("Magenta", "Brown"));
        System.out.println("After inserting multiple elements: " + linkedList);

        // 20. Get first and last occurrence of an element
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());
    }
}
