import java.util.*;
public class divisible 
{
    public static void main(String[] args)
    {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(60);
        list.add(30);
        list.add(33);
     
        //stream use 
        List<Integer>result = list.stream().filter(n->n%3==0 && n%5!=0).toList();
        System.out.println(result);
       

    }
}
