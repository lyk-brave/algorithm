/**
 * 두 개 뽑아서 더하기
 * https://programmers.co.kr/learn/courses/30/lessons/68644?language=java
 */
package algorithmProgrammers.java.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution68644 {
	public int[] solutionV1(int[] numbers) {		
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				sum = numbers[i] + numbers[j];
				if(list.isEmpty() || !list.contains(sum)) {
					list.add(sum);
				}
			}
		}
		
		int[] answer = new int[list.size()];
		int size = 0;
		for(int l : list) {
			answer[size++] = l;
		}
        
		Arrays.sort(answer);
        return answer;
    }
	
	public int[] solutionV2(int[] numbers) {
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		
		return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
	
	public static void main(String[] args) {
		Solution68644 sol = new Solution68644();
		sol.solutionV1(new int[] {2,1,3,4,1});
		//sol.solutionV1(new int[] {5,0,2,7});
		//sol.solutionV2(new int[] {5,0,2,7});
	}
}
