import java.util.*;

public class main{
    public static void main (String[] args){
        Scanner numInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        int numTest = numInput.nextInt();
        numInput.nextLine(); // To consume the newline character after reading the integer
        for (int i = 0; i < numTest; i++){
            String text = stringInput.nextLine();
            System.out.println(text);
        }
        stringInput.close(); // Close stringInput after finishing the loop
        numInput.close(); // Close numInput after use
    }
}
