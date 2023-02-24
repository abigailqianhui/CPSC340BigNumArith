import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BigNumArithmetic {

    // constructor
    public BigNumArithmetic() {

    }

    // adds two Linked List integer values
    public LList addition(LList num1, LList num2) {

    }

    // multiplies two Linked List integer values
    public LList multiplication() {

    }

    // exponentiation on two Linked List integer values
    public LList exponentiation() {

    }

    // main method
    public static void main(String args[]) {
        try {
            // open the file
            FileInputStream file = new FileInputStream("BignumInput");

            // create a scanner for the file
            Scanner in = new Scanner(file);

            // read from the file until it reaches the end of the file
            while(in.hasNext()) { // loops through file
                String nextLine = in.nextLine();
                Scanner lineScanner = new Scanner(nextLine);
                BigNumArithmetic BNA = new BigNumArithmetic();
                LStack lStack = new LStack();
                while(lineScanner.hasNext()) { // loops though line
                    String value = lineScanner.next();
                    if(value.equals("+")) { // if the current value in the line is + (addition)
                        // check if there are two LLists of ints on the stack; if not enough values, not an equation & break
                        Object llist1 = lStack.pop();
                        Object llist2 = lStack.pop();
                        LList sum = BNA.addition(llist1, llist2);
                        lStack.push(sum);
                    } else if(value.equals("*")) { // if the current value in the line is * (multiplication)
                        // check if there are two LLists of ints on the stack; if not enough values, not an equation & break
                        Object llist1 = lStack.pop();
                        Object llist2 = lStack.pop();
                        LList product = BNA.multiplication(llist1, llist2);
                        lStack.push(product);
                    } else if(value.equals("^")) { // if the current value in the line is ^ (exponentiation)
                        // check if there are two LLists of ints on the stack; if not enough values, not an equation & break
                        Object llist1 = lStack.pop();
                        Object llist2 = lStack.pop();
                        LList ex = BNA.exponentiation(llist1, llist2);
                        lStack.push(ex);
                    } else if(value.equals(" ")) { // if the current value is 0 or " " (blankspace)
                        break;
                    } else if(value.equals("0")) {
                        // check if it has a blank space after, if so, add to the linked list
                        // check if int after, add it to the linked list
                    } else { // if the current value is an int (1-9)
                        // convert String to int
                        // add int to Linked List
                        // if the lineScanner.next() == " " add to the Stack
                    }
                }
                // remove leading zeroes - check the front value of the linked list int, if 0, remove; continue until no leading zeroes
            }
        } catch (FileNotFoundException e) { // identifies when the file cannot be found
            // the file was not found
            System.out.println("File BignumInput could not be found!"); // print statement
            System.exit(-1); // exit from the program
        }

        // initiate File reader
        // iterate through the File while(file.hasNext())
        // read in value from first line
        // add ints to Linked List
        // add Linked List to Stack
        // pop() from the Stack when we reach operand
        // perform operation
        // add Linked List int result to the Stack
        // continue to iterate through the file

        // if the Stack is Empty or does not contain enough LinkedList of ints when trying to perform an operation
        // or is left with more than one LinkedList of ints with no more operands
        // return not a valid equation
    }
}
