/**
 * 탑
 * 문제 삭제됨 
 */
package algorithmProgrammers.level2;

public class Solution42588 {
	public int[] solution(int[] heights) {
		int[] answer = new int[heights.length];
		for(int i=heights.length-1; i>=0; i--) {
			for(int j=i-1; j>=0; j--) {
				if(heights[j] > heights[i]) {
					answer[i] = j+1;
					break;
				}
				if(j==0) answer[i] = 0;
			}
		}
		
		return answer;
	}
}
