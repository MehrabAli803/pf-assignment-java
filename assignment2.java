  import java.util.Scanner;

public class Matrixpro {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int rows, cols;

        System.out.print("Enter number of rows: ");
        rows = in.nextInt();

        System.out.print("Enter number of columns: ");
        cols = in.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for(int i = 0; i < rows; i=i+1){
            for(int j = 0; j < cols; j=j+1){
                matrix[i][j] = in.nextInt();
            }
        }

        
        System.out.println("\nSum of Rows:");
        for(int i = 0; i < rows; i=i+1){
            int sum = 0;
            for(int j = 0; j < cols; j=j+1){
                sum += matrix[i][j];
            }
            System.out.println("Row " + (i+1) + " = " + sum);
        }

        
        System.out.println("\nSum of Columns:");
        for(int j = 0; j < cols; j=j+1){
            int sum = 0;
            for(int i = 0; i < rows; i=i+1){
                sum = sum + matrix[i][j];
            }
            System.out.println("Column " + (j+1) + " = " + sum);
        }

       
        int forward = 0;
        for(int i = 0; i < rows; i=i+1){
           forward = forward + matrix[i][i];
        }

        
        int reverse = 0;
        for(int i = 0; i < rows; i=i+1){
            reverse = reverse + matrix[i][cols - 1 - i];
        }

        System.out.println("\nForward Diagonal Sum = " + forward);
        System.out.println("Reverse Diagonal Sum = " + reverse);

        in.close();
    }
}