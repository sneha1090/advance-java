
import java.util.ArrayList;

public class mapping {
    public static void main(String[] args)
    {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(60);
        list.add(70);
       
        list.stream().filter(n-> n%2==0).map(x-> x*2)
        .forEach(System.out::print);
    }
}
