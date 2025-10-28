public class singleInheritance {
    public static void main(String[] args) {
        son s = new son();
        s.parant();
        s.child();
    }
}

class father {
    void parant(){
        System.out.println("this is parant class");
    }
}

class son extends father{
    void child(){
        System.out.println("this is child class");
    }
}
