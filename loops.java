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
// public class loops{
//     public static void main(String[] args) {
//         int[] arr = {24,76,78,43,900};
//         int sum = 0;
//         for(int i=0;i<arr.length;i++){
//             sum+=arr[i];
//         }
//         System.out.println(sum);
//     }
// }



// 2	Print even and odd numbers between 1–50	Loop + condition

// public class loops{
//     public static void main(String[] args) {
//         for(int i = 1 ; i <= 50 ; i++){
//             if(i%2 != 0){
//                 System.out.println("Odd Number = " + i);
//             }
//             if(i%2 == 0){
//                 System.out.println("Even Number = " + i);
//             }
//         }
//     }
// }

// Reverse a number	while + % operator
// import java.util.Scanner;
// public class  loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Number : ");
//         int num = sc.nextInt();
//         int rev = 0;

//         while(num > 0){
//             int digit = num % 10;
//             rev = (rev * 10) + digit;
//             num = num / 10;
//         }
//         System.out.println("reversed Number = " + rev);

//     }
// }

// Check if number is palindrome
// import java.util.Scanner;

// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Your Number : ");
//         int num = sc.nextInt();
//         int og = num;
//         int rev = 0;
//         while(num != 0){
//             int digit = num%10; // get the last digit
//             rev = (rev*10) + digit ;
//             num = num/10;
//         }
//         if(og == rev){
//             System.out.println(og + " is a Palindrome");
//         }else{
//             System.out.println(og + " is not palindrome");
//         }
//     }
// }

// public class loops{
//     public static void main(String[] args) {
//         for(int i=1;i<=10000;i++){
//             int num = i;
//             int digits = String.valueOf(num).length();
//             int sum = 0;
//             int temp = num;
//             while(temp != 0){
//                 int lastDigit = temp % 10;
//                 sum += Math.pow(lastDigit,digits);
//                 temp = temp/10;
//             }
//             if(num == sum){
//                 System.out.println(num);
//             }
//         }
//     }
// }



// Print all prime numbers between 1 to N
import  java.util.Scanner;
public class loops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N = ");
        int N = sc.nextInt();
        for(int i = 2; i <= N;i++){
            boolean isPrime = true;
            for(int num = 2; num<=Math.sqrt(i);num++){
                if(i%num == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }
        }
    }
}