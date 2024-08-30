import java.util.Scanner;

public class do_while {
    public static void main(String[]args){
        Scanner s =new Scanner (System.in);
        
int num;
System.out.print("Enter any number:");
num=s.nextInt();
do{
    System.out.print(num+" ");
    num++;

}
while(num<=10);

    }
}
