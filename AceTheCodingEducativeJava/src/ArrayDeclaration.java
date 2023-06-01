import java.util.Arrays;

public class ArrayDeclaration {

	public static void main(String[] args) {
		int array1[] = { 1, 2, 2, 4, };
		int[][] twoDarray = { { 0, -1 }, { 1, 2 }, { 4, 4 } };
		int[][][] threeDarray = { { { 0, -1 }, { 5, 4 } }, { { 1, 2, 7 }, { 4, 4, 4 } } };

		// simple array print gives junk values, Arrays.toString gives proper
		// [1, 2, 2, 4] [I@15db9742
		System.out.println(Arrays.toString(array1) + " " + twoDarray);
		// [[0, -1], [1, 2], [4, 4]]
		System.out.println(Arrays.deepToString(twoDarray));
		//[[[0, -1], [5, 4]], [[1, 2, 7], [4, 4, 4]]]

		System.out.println(Arrays.deepToString(threeDarray));

	}
}
