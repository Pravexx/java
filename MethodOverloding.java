class calculator{
    int add(int a ,int b){
        return a+b;
    }
    double add(double a,double b,double c){
        return a+b+c;
    }

}
public class MethodOverloding {
    public static void main(String[] args) {
        calculator c1 = new calculator();
        System.out.println(c1.add(10,20));
        System.out.println(c1.add(10,20,20));
    }
}
