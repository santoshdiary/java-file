public class personclass {
    int age=21;
    int weight=56;
    String  color="Light";
    void eat(){
        System.out.println ("I'm eating....");

    }
    void sleep(){
        System.out.println ("I'm Sleeping....");
    }
   
    public static void main(String[]args){
        personclass p=new personclass();
        System.out.println (p.age);
        System.out.println (p.weight);
        System.out.println (p.color);
        p.eat(); p.sleep();
        
    }
}
