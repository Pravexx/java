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

// public  class loops{
//     public static void main(String[] args) {
//         String name = "kamatchi";
//         int count = 0;
//         for(int i=0; i<=name.length()-1;i++){
//             if('a'==name.charAt(i)){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }



// find min and max value in array
// public class loops{
//     public static void main(String[] args) {
//         int[] arr = {24,76,78,43,900};
//         int max = arr[0];
//         int min = arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//             if(arr[i]<min){
//                 min = arr[i];
//             }
//         }
//         System.out.println(max);
//         System.out.println(min);
//     }
// }



// find sum of an array
public class loops{
    public static void main(String[] args) {
        int[] arr = {24,76,78,43,900};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
