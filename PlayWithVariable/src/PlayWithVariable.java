public class PlayWithVariable {
    public static void main (String[] args) {
        System.out.println("Let's play with variable's...!!");

        //int, byte, short, float, double, long, string, char are the data-types available in Java

        //Declaring two variables varA and varB and print out them..
        int varA = 5;
        int varB = 10;
        System.out.println("value of A = " + varA + " and value of B = " + varB);


        //Add two variables and store in third variable and print third variable
        int varC = varA + varB;
        System.out.println("Addition of variable A and B = " + varC);

        //Addition of two number while declaring the variable
        int inLineAdd = 20 + 19;
        System.out.println("Addition of inline add: " + inLineAdd);

        int expressionVariable = (20 + 2) + (10 * 5);
        System.out.println("Value of expression variable = " + expressionVariable);

        //Defining the string variable
        String firstString = "Hello World 1";
        System.out.println("Print the first string " + firstString);

        //Define the two string variable and concatenate them
        String strA = "String";
        String strB = "Concatenate Demo";
        System.out.println(strA + " " + strB);

        //
        int myLastValue;
        myLastValue = 1000 - varC;
        System.out.println(myLastValue);
    }
}
