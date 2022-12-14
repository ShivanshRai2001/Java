import java.util.Scanner;

// Here we have created our own custom exception what it will throw in error.
class MyException extends Exception{
    @Override
    public String toString() {
        // return super.toString() + " I am toString()";
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        // return super.getMessage() + " I am get message()";
        return "I am get message()";
    }
}

class MyAgeException extends Exception{
    @Override
    public String toString() {
        return "Age cannot be greater than 125.";
    }

    @Override
    public String getMessage() {
        return "Make sure that the value of age entered is correct.";
    }
}

public class Practice2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();

        if(a<9){
            try{
                throw new MyException();
                // throw new ArithmeticException("This is an exception.");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
}


// Basic Exception example
public class Practice2{
    public static void main(String[] args) {
        try{
            int a = 66/0; // change the value and accordingly the result will change.
        }
        catch(IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch(ArithmeticException a){
            System.out.println("HaHa");
        }
    }
}


// Exception example
import java.util.Scanner;

public class Practice2{
    public static void main(String[] args) {
        boolean flag = true;
        int [] num = new int[3];
        num[0] = 5;
        num[1] = 10;
        num[2] = 15;

        Scanner sc = new Scanner(System.in);
        
        int index;
        int i=0;

        while(flag && i<5){
            try{
                System.out.println("Enter the index value : ");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + num[index]);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid Index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }
    }
}
