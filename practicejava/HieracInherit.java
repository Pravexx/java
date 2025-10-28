public class HieracInherit {
    public static void main(String[] args) {
        Son s1 = new Son();
        Daughter d1 = new Daughter();
        s1.fight();
        d1.fight();
    }
}

class Father {
    void fight(){
        System.out.println("He is fighting");
    }
}

class Son extends Father{
    void son(){
        System.out.println("he is a son");
    }
}

class Daughter extends Father{
    void Dau(){
        System.out.println("She is Daughter");
    }
}