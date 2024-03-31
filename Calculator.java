import java.util.Scanner;
public class Calc {
    public int add;
    public int sub;
    public int mul;
    public int div;
    
    public static void main(String[] args) {
        //Get input from a user
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your first number: ");
        int num1 = scan.nextInt();
        System.out.println("What's your Second number: ");
        int num2 = scan.nextInt();
        //Get the opperation sign from the user
        System.out.println("What's your operation if add press 1, if subtract press 2, if multiply press 3, lastly if division press 4");
        int Opp = scan.nextInt();
        //If else add
        if (Opp == 1 ){
          int sum = add(num1, num2);
            System.out.println("The addition of the first number and the second number is " + sum);
        }
        //else if Subtraction
        else if(Opp == 2){
          int subt = sub(num1, num2);
        System.out.println("The Subtraction of the first number and the second number is " + subt);
        }
        //else if Multiplication
        else if(Opp == 3){
          int mull = mul(num1, num2);
       System.out.println("The Multiplication of First number and the second number is " + mull);   
        }
        //else Division
        else if(Opp == 4){
            float divi =  div(num1, num2);
        System.out.println("The Division of First number and the second number is " + divi);
    }
    }
    //Return type for addition
    public static int add(int num1, int num2){
    return num1 + num2;
}
    public static int sub(int num1, int num2){
    return num1 - num2;
    }
    public static int mul(int num1, int num2){
        return num1 * num2;
    }
    public static int div(int num1, int num2){
        return num1/num2;
    }
}
