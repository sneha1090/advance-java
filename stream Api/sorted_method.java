import java.util.*;
import java.util.stream.*;

public class sorted_method{
    public static void main(String[] args) {

        
        ArrayList<Integer> list = new ArrayList<>();

    
        list.add(30);
        list.add(10);
        list.add(50);
        list.add(20);

        
        List<Integer> result = list.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Original List: " + list);
        System.out.println("Sorted List: " + result);
    }
}