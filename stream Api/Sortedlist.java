
import java.util.ArrayList;
import java.util.*;

public class Sortedlist 
{
    public static void main(String[] args)
     {
          ArrayList<Integer>list=new ArrayList<>();
          list.add(10);
          list.add(30);
          list.add(5);
          list.add(17);
 
          List<Integer>result=list.stream().sorted().toList();
           System.out.println("original list: "+ list);
           System.out.println("sorted list:"+ result);


    }
}
