import java.util.*;
/**
* This is the starter code for a EDUC420 computer science lesson.
* It is the skeleton of a calculator which is to be filled in by students.
*
* @author Katrina Hoefflinger & Lukas Jimenez-Smith
* @version 1.0
*/

//DO NOT TOUCH BELOW THIS LINE
public class Calc{
    private static Scanner scan = new Scanner(System.in);

    /** 
    * Executes methods to greet the user, compile the operands, and complete the mathematical functions
    * Basically, this method controls what the user sees and inputs.
    */
    public static void main(String[] args){
		System.out.println("Welcome to Calc.java");
		while (true){
			int selection = getUser();
            if (selection == 5){
                break;
            }
            Pair pair = getNums();
            int a = pair.getKey();
            int b = pair.getValue();
            String eq = eq(a,b,selection);
			if (selection == 1){
				System.out.println(eq + add(a,b));
			} else if (selection == 2){
				System.out.println(eq + sub(a,b));
			} else if (selection == 3){
				System.out.println(eq + mult(a,b));
			} else if (selection == 4){
				System.out.println(eq + div(a,b));
			} else {
				System.out.println("Invalid input try again.");
			}		
		}
		System.out.println("Thank you for using Calc.java!");
    }

    /**
    * Sets up the menu for the user, then returns the desired operation.
    * @return int the number related to the desired operation
     */
    private static int getUser(){
		System.out.println("****MENU****\nEnter 1 for Addition\nEnter 2 for Subtraction\nEnter 3 for Multiplication\nEnter 4 for Division\nEnter 5 to Quit");
        int input = scan.nextInt();
        scan.nextLine();
		return input;
	}

    /**
    * Gets the first and second operand for the equation.
    * @return Pair containing the first and second operands
    */
    private static Pair getNums(){
        System.out.println("Enter the first operand: ");
        int a = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the second operand: ");
        int b = scan.nextInt();
        scan.nextLine();
        Pair p = new Pair(a, b);
        return p;
    }

    /**
    * Builds the string that represents the equation.
    * @param int a, int b, int selection
    * @return String 
    */
    private static String eq(int a, int b, int selection){
        String s = "";
        s += a;
        if(selection == 1){
            s += " + ";
        } else if (selection == 2){
            s += " - ";
        } else if (selection == 3){
            s += " * ";
        } else if (selection == 4){
            s += " / ";
        }
        s += b;

        s += " = ";
        return s;
    }
    //DO NOT TOUCH ABOVE THIS LINE
    //CODE BELOW THIS LINE
    /**
    * Does addition 
    * @param int a, int b
    * @return int result
    */
    private static int add(int a, int b){
        int result = 0; //save your results into this variable

        return result;
    }

    /**
    * Does subtraction
    * @param int a, int b
    * @return int result
    */
    private static int sub(int a, int b){
        int result = 0; //save your results into this variable

        return result;
    }

    /**
    * Does multiplication 
    * @param int a, int b
    * @return int result
    */
    private static int mult(int a, int b){
        int result = 0; //save your results into this variable

        return result;
    }

    /**
    * Does Division
    * @param int a, int b
    * @return int result
    */
    private static int div(int a, int b){
        int result = 0; //save your results into this variable

        return result;
    }
    //CODE ABOVE THIS LINE
    //DO NOT TOUCH BELOW THIS LINE
    private static class Pair{
        int a;
        int b;
        public Pair(int a, int b){
            this.a = a;
            this.b = b;
        }
        public int getKey(){
            return a;
        }

        public int getValue(){
            return b;
        }
    }
}

