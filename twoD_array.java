import java.util.Scanner;

public class twoD_array {


    public static void main(String []args){

        int a[][]=new int [3][3];
        System.out.print("Enter array Element:");
      try (Scanner s = new Scanner(System.in)) {
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                a[i][j]=s.nextInt();

            }
        }
    }
            System.out.println("\nArray Element:");
           for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
               
                 System.out.print(a[i][j]+"  ");
            } 
            System.out.println();
        }
   
   
   
    }



    
    
}
