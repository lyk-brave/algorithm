package algorithmProgrammers.level1;

public class Solution12954 {
	public long[] solution(int x, int n) {
		long[] arr = new long[n];
		long next = 0;
		for(int i=0; i<arr.length; i++) arr[i] = next += x;
		
		return arr;
	}
}
