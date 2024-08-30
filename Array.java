// public class Array {
//     public static void main (String[]args){
//         int a[]={10,45,34,53,24,523};
//         System.out.println(a[2]); // for single element print


//         // for multiple elemnent print we use "FOR EACH LOOOP" 
//   System.out.println( "All Element are: ");
//         for(int b:a){
//             System.out.print(  b +" ");
//         }
//     }
// }

import java.util.Scanner;

public class Array {
    public static void main (String[]args){
  int a[]=new int [5];
   System.out.print("Enter array Element:");
   try (Scanner s = new Scanner(System.in)) {
    for(int i=0;i<5;i++){
        a[i]=s.nextInt();

    }
}
  
    // for each loops printing;
    for(int b:a){
        System.out.print(b+" ");
    }
     
}
}
