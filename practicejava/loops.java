package practicejava;// public class practicejava.loops {
//     public static void main(String[] args) {
//         String name = "praveen";
//         String rev = "";
//         for(int i=name.length()-1;i>=0;i--){
//             rev = rev + name.charAt(i);
//         }
//         System.out.println(rev);
//     }
// }

// public  class practicejava.loops{
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
// public class practicejava.loops{
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
// public class practicejava.loops{
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

// public class practicejava.loops{
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
// public class  practicejava.loops{
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

// public class practicejava.loops{
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


//Print all Armstrong numbers between 1 to 10000.
// public class practicejava.loops{
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
// import  java.util.Scanner;
// public class practicejava.loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter N = ");
//         int N = sc.nextInt();
//         for(int i = 2; i <= N;i++){
//             boolean isPrime = true;
//             for(int num = 2; num<=Math.sqrt(i);num++){
//                 if(i%num == 0){
//                     isPrime = false;
//                     break;
//                 }
//             }
//             if(isPrime){
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }


// Print a diamond star pattern using only for practicejava.loops.

// public class loops {
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i=1;i<=n;i++){
//             for(int s=0;s<n-i;s++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<2*i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=n-1;i>0;i--){
//             for(int s=0;s<n-i;s++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<2*i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



//Count frequency of each character in a string without using collections.

//public class loops{
//    public static void main(String[] args) {
//        StringBuilder name = new StringBuilder("kamatchi Sundharam");
//
//        for(int i = 0;i<name.length();i++){
//            int frequen = 1;
//            if(name.charAt(i) == '0' || name.charAt(i) == ' '){
//                continue;
//            }
//            for(int j = 1+i ;j<name.length();j++){
//                if(name.charAt(i) == name.charAt(j)){
//                    frequen++;
//                    name.setCharAt(j,'0');
//                }
//            }
//            System.out.println(name.charAt(i) + " --> " + frequen);
//        }
//    }
//}