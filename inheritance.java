class student{                  //Simple inheritance :)
    int roll, marks;
    String name;
    void input(){
        System.out.println ("Enter roll name & Marks:");

    }
}
class ankit extends student{
    void disp(){
        roll=93; name="ankit";
        marks=67; 
         System.out.println (roll+"  "+name+" "+" "+marks); 
    }
}



public class inheritance {
    

    public static void main(String[]args){
     ankit r=new ankit();
     r.input(); r.disp();    

    }
}
