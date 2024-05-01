import java.math.BigInteger;

public class PascalTriangle {
    public static void main(String[] args) {
        int totalRows = 1000000000; // Number of rows in Pascal's triangle
        int count = 0; // Initialize count of entries not divisible by 7

        // Calculate Pascal's triangle up to the specified number of rows
        for (int row = 0; row < totalRows; row++) {
            BigInteger num = BigInteger.ONE; // Initialize the first element of the row to 1
            BigInteger denom = BigInteger.ONE; // Initialize the denominator to 1

            // Calculate each element in the current row using the formula nCr = (n * (n - 1) * ... * (n - r + 1)) / r!
            for (int col = 0; col <= row; col++) {
                // Calculate nCr using BigInteger to handle large numbers
                BigInteger nCr = num.divide(denom);

                // Check if the entry is not divisible by 7 and increment count if true
                if (!nCr.mod(BigInteger.valueOf(7)).equals(BigInteger.ZERO)) {
                    count++;
                }

                // Calculate the next element in the row
                num = num.multiply(BigInteger.valueOf(row - col));
                denom = denom.multiply(BigInteger.valueOf(col + 1));
            }
        }

        // Output the total count of entries not divisible by 7
        System.out.println("Total entries not divisible by 7: " + count);
    }
}
