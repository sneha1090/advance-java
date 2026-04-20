import java.util.stream.*;
import java.util.*;
public class uppercase
 {
    public static void main(String[] args)
     {
         List<String>list=Stream.of("Sneha","Kshitij","Golu").toList();
        //  System.out.println(list);
        //operation perform 
         List<String>uppercase=list.stream()
            .map(x->x.toUpperCase()).toList();
         System.out.println("uppercase :"+ uppercase);
        

            
     }
}
 