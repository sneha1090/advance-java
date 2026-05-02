
import java.util.*;

public class arraylist 
{
    public static void main(String[] args) 
    {
         ArrayList<Integer>list=new ArrayList<>();
         list.add(10);
         list.add(20);
         list.add(30);

         //  how to stream use

         List<Integer>result=list.stream().sorted().toList();
         System.out.println(result);
                
         
    }
}
