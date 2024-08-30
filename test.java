 class superkey {
    int a=10;      // super key program
    
}
class b extends  superkey {
 int a=20; 
 void show(){
    System.out.println (a);
    System.out.print (super.a);
 }

}
class test {
    public static void main(String []args){
        b r= new b ();
        r.show();
    }
}
