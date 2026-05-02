import java.util.ArrayList;
import java.util.List;

public class primeno 
{
     public static void main(String[] args)
    {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(60);
        list.add(30);
        list.add(33);
     
        //stream use 
        List<Integer>result = list.stream().filter(n->isPrime(n)).toList();
        System.out.println(result);
    }

    
}
