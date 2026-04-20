
import java.util.ArrayList;
import java.util.List; 

public class mapping {
    public static void main(String[] args)
    {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(60);
        list.add(70);
       
         List<Integer>list2=list.stream().filter(n-> n%2==0).map(n-> n*2).toList();
          System.out.print("update list: "+ list2);
    }
}
