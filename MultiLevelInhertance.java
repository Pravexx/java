public class MultiLevelInhertance {
    public static void main(String[] args) {
        son s = new son();
        s.F();
        s.GF();
    }
}


class grandfather{
    void GF(){
        System.out.println("He is grandfather");
    }
}

class father extends grandfather{
    void F(){
        System.out.println("He is father");
    }
}

class son extends father{
    void S(){
        System.out.println("He is son");
    }
}