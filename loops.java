public class loops {
    public static void main(String[] args) {
        String name = "praveen";
        String rev = "";
        for(int i=name.length()-1;i>=0;i--){
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);
    }
}
