package algorithmProgrammers.level2;

public class Solution12949 {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] newArr = new int[arr1.length][arr2[0].length];
		for(int i=0; i<newArr.length; i++) {
			for(int j=0; j<newArr[0].length; j++) {
				for(int k=0; k<arr1[0].length; k++) {
					newArr[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		
		return newArr;
	}
}
