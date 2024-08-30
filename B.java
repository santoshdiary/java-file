
 class A {

int a; String b;
    A(){
        a=10;b="Learn Coding";
        System.out.println(a+" "+b);
    }
    
    A( A ref){
        a=ref.a;
        b=ref.b;
        System.out.print(a+" "+b);
    }
}
class B{
    public static void main (String [] args){
        A r=new A();
        A r2=new A(r);
        
    }
}
