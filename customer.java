
import java.util.Scanner;
 class bank {
     private double bal=5000;
     private int pwd;


     public void Deposite(){
        
        System.out.print(" Enter password ");
        Scanner s=new Scanner(System.in);
pwd=s.nextInt();
        if(pwd==123){

            int amount;
            System.out.println("Enter your Deposite Amount:" );
            Scanner j =new Scanner(System.in);
            amount =j.nextInt();

            bal=bal+amount;
            System.out.println(" Deposite money: "+amount);
            System.out.print(" Total balance: "+bal);

        }else{
            System.out.println("Incorrect password");        }
     }


     public void withdraw(){

 System.out.print(" Enter password ");
        Scanner s=new Scanner(System.in);
pwd=s.nextInt();
        if(pwd==123){
int amount;
            System.out.println("Enter your Withdraw Amount:" );
 Scanner j =new Scanner(System.in);
            amount =j.nextInt();
if( amount >bal){
    System.out.print ("Not sufficient amount in you account ...");
}else{
 bal=bal-amount;
            System.out.println("withdraw money: "+amount);
            System.out.println(" Total balance: "+bal);
}
           

        }else{
              System.out.print("Incorrect password"); 
        }

     }
public void checkBal(){

 System.out.print(" Enter password ");
        Scanner s=new Scanner(System.in);
pwd=s.nextInt();
        if(pwd==123){
            
            System.out.println(" Total balance: "+bal);

        }else{
              System.out.println("Incorrect password"); 
        

     }


}
}
class customer{
    public static  void main(String []args){
bank b=new bank();
int ch;
System.out.println ("1. Deposite");
System.out.println ("2. Withdraw");
System.out.println ("3. check balance.");


System.out .println(" Enter your choice:");

Scanner s2=new Scanner(System.in);
ch=s2.nextInt();

switch(ch){


    case 1:b.Deposite();
    break;
    case 2: b.withdraw();
    break;
    case 3: b.checkBal();
    break;
    default: System.out.print("Invalid Choice.....");


}
    }
}