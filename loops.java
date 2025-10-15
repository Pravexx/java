// public class loops {
//     public static void main(String[] args) {
//         String name = "praveen";
//         String rev = "";
//         for(int i=name.length()-1;i>=0;i--){
//             rev = rev + name.charAt(i);
//         }
//         System.out.println(rev);
//     }
// }

public  class loops{
    public static void main(String[] args) {
        String name = "kamatchi";
        int count = 0;
        for(int i=0; i<=name.length()-1;i++){
            if('a'==name.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}