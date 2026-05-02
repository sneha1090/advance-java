package streamApi_practicesheet;


import java.util.ArrayList;
import java.util.List;

public class Employee {
    public static void main(String[] args)
     {
         ArrayList<Integer>list=new ArrayList<>();
        list.add(100008);
        list.add(607790);
        list.add(30000);
        list.add(330);
     
        //stream use 
        List<Integer>result = list.stream().filter(salary->salary>50000).toList();
        System.out.println(result);
       
     }
}
