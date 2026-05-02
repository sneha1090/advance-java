class Parent {
    void show() {
        System.out.println("This is Parent class show()");
    }
}

class Child extends Parent {

    @Override
    void show() {
        System.out.println("This is Child class show()");
    }

    
    void show(int x) {
        System.out.println("Overloaded method with int: " + x);
    }

    
    void show(String msg) {
        System.out.println("Overloaded method with String: " + msg);
    }
}

public class Main_22{
    public static void main(String[] args) {

        Child obj = new Child();

        obj.show();          
        obj.show(10);        
        obj.show("Hello");   
    }
}


