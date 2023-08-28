import java.util.Scanner;

public class twoDArray {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int rows = scan.nextInt();

		System.out.print("Enter number of columns: ");
		int columns = scan.nextInt();

		int[][] multidimensionalArray= new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				multidimensionalArray[i][j]= (i + 1) * (j + 1);
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(multidimensionalArray[i][j]+ " ");
			}

			System.out.println();
		}
		scan.close();
	}
}
