import java.util.*;
import java.util.stream.*;

public class stream_method{
    public static void main(String[] args) {

        
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements in list
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);


        List<Integer> result = list.stream()

            
                .filter(x -> x % 2 == 0)

        
                .map(x -> x * 2)

            
                .collect(Collectors.toList());

        // Step 3: Print the result
        System.out.println("Original List: " + list);
        System.out.println("Processed List: " + result);
    }
}
