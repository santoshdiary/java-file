import java.util.Scanner;

public class whilLoops {
    public static void main(String []args){
        int num;
        System.out.print("Enter any number:");
        Scanner s =new Scanner(System.in);
        num=s.nextInt();
while(num>=0){
    if(num%2==0){
        System.out.print("Even");
        break;
    }
    else{
        System.out.print("odd");
        break;
    }
}
    }
}
