import java.util.Scanner;       // FOR LOOPS;

public class loops {
    public static void main(String[]args){
        int num;
        System.out.println("Enter any numbers:");
        Scanner s = new Scanner (System.in);
        num=s.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}
