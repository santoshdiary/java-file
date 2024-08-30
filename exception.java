import java.util.Scanner;

public class exception {

    public static void main (String[]args){

int a,b,c;
     System.out.println("ENTER  TWO NUMBER FOR DIVISION:");

     try (Scanner s = new Scanner(System.in)) {
        try (Scanner y = new Scanner(System.in)) {
            a=s.nextInt();
            b=y.nextInt();
        }
    }
      try{
   c=a/b;
System.out.println("Division: "+c);
}
catch(ArithmeticException e){
 System.out.println("can't divisible by 0 ");   
}

    }
    
}
