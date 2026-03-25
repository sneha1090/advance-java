import java.util.*;

public class concat_reduce
 {
    public static void main(String[] args)
     {
         List<String>list=Arrays.asList("sneha","singh");
         String result=list.stream()
         .reduce("",(a,b)->a+b);
         System.out.println(result);
    }
}