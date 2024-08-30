import java.util.Scanner;

public class arrayElementFinding {
    
    public static void main(String[] args) {

        float [] marks = {67.5f, 55.6f, 66.2f, 56.8f, 89.5f};
        System.out.println("Enter marks which you want to print:");
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat(); // Change the input type to float
        boolean isInArray = false;
        
        for (float element : marks) {
            if (Math.abs(num - element) < 0.0001) { // Use a tolerance level for comparison
                isInArray = true;
                break;
            }
        }
        
        if (isInArray) {
            System.out.println("Marks is Available in Array");
        } else {
            System.out.println("Marks is not Available in Array");
        }
    }
}
