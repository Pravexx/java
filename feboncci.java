public class feboncci {
    public static void main(String[] args) {
        int first = 0;
        int sec = 1;
        int next;
        for(int i=0; i<=10; i++){
            next = first + sec;
            System.out.println(next);
            first = sec;
            sec = next;
        }
    }
}
