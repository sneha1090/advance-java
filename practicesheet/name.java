import java.util.ArrayList;
import java.util.List;

public class name
 {
      public static void main(String[] args)
      { 
        ArrayList<String>list=new ArrayList<>();
        list.add("sneha");
        list.add("jaman");
        list.add("gitesh");
        list.add("ayan");
     
        //stream use 
        List<String>result = list.stream().filter(names->names.endsWith("n")).toList();
        System.out.println(result);
       
      }
}
