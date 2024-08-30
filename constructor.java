 /* simple constructor */

// public class constructor {
//     int a;  String name;
// constructor(){
//     a=0; name=null;

// }
// void show(){
//     System.out.println(a+" "+name);

// }
//     public static void main(String []args){
//         constructor ref=new constructor();
//         ref.show();

//     }
// }
// class B{
// public static void main (String []args){
//     constructor ref=new constructor();
//     ref.show();
// }

// }

 /* parameterized constructor */

//  public class constructor {
//     int x,y;
    
// constructor(int a , int b){
//    x=a;   y=b;

// }
// void show(){
//     System.out.println(x+" "+" "+y);

// }
  
// public static void main (String []args){
//     constructor ref=new constructor(100,89);
//     ref.show();
// }



// }
/* private constructor */
 public class constructor {
    int a ; double b; String c;

    
 private constructor(){
    a=10; b=34.3; c=" Santosh";
    System.out.print(a+" "+b+" "+c);
 }


 public static void main(String [] args ){
    constructor r =new constructor();
 }
}


