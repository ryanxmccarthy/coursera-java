public class BandMatrix
{
	public static void main(String[] args) {
	    int n = Integer.parseInt(args[0]);      // dimension of the matrix
	    int width = Integer.parseInt(args[1]);  // the range (or max distance)
		
	    for (int row = 0; row < n; row++) {     // the loop for the rows
            for (int column = 0; column < n; column++) {    // te loop for the columns
                if (Math.abs(row - column) <= width) {      // if the column index is in the "width" range of the row index then... 
                    System.out.print("*");                  // ...we print a * character...
                } else {
                    System.out.print("0");                  // ...otherwise a 0
                }
                
                // we add a whitespace after each character, except the last one
                if (column < n - 1) {
                    System.out.print(" ");
                }
            }
            
            // ...and new line after each finished row
            System.out.println("");
		}
	}
}