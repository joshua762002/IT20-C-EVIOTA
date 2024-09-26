package multidimensional_array ;

public class Multidimensional_Array {
    public static void main(String[] args) {
        // Inputs for the array (Simple Character)
        String[][] characterArray = {
            {".", "-", "-", "-", "."},
            {"|", "0", ",", "0", "|", " ", "?"},
            {"[", " ", "-", " ", "]"},
            {"|", "_", "|", "_", "|"}
        };
        
        // Nested for loop to print the multidimensional array
        for(int row = 0; row < characterArray.length; row++) {
            for(int column = 0; column < characterArray[row].length; column++) {
                System.out.print(characterArray[row][column]);
            }
            // Added println for a new line after each row
            System.out.println(" ");
        }
    }
}
