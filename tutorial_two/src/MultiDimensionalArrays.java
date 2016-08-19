
public class MultiDimensionalArrays {

	public static void main(String[] args) {
		int[] values = {3, 5, 2345};
		
		System.out.println(values[2]);
		
		// example of 2D array = array of arrays
		int[][] grid = {
				{3, 5, 2345},
				{2, 4},
				{1, 2, 3, 4}
		};
		
		// specify element at (row, column)
		System.out.println(grid[0][2]);
		
		String[][] texts = new String[2][3];
		
		texts[0][1] = "Hello there";
		
		System.out.println(texts[0][1]);
		
		for(int row=0; row < grid.length; row++){
			for(int col=0; col < grid[row].length; col++) {
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println();
		}
	}

}
