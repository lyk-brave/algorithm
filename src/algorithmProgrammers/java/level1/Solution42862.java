/***
 * 체육복 
 * https://programmers.co.kr/learn/courses/30/lessons/42862?language=java
 */
package algorithmProgrammers.java.level1;

import java.util.ArrayList;
import java.util.List;

public class Solution42862 {
	public int solution(int n, int[] lost, int[] reserve) {
		int okMember = n - lost.length;
		
		List<Integer> lostList = new ArrayList<Integer>();
		for (int i : lost) lostList.add(i);

		List<Integer> reserveList = new ArrayList<Integer>();
		for (int i : reserve) reserveList.add(i);
		
        for(int i=0; i<lostList.size(); i++) {
			for(int j=0; j<reserveList.size(); j++) {
				if(lostList.get(i) == reserveList.get(j)) {
					lostList.remove(i);
					reserveList.remove(j);
                    i--;
					okMember++;
					break;
				}
			}
		}
    
		for (int i = 0; i < lostList.size(); i++) {
			int lostNum = lostList.get(i);
			for (int j = 0; j < reserveList.size(); j++) {
				int reserveNum = reserveList.get(j);
				if (lostNum == reserveNum - 1 || lostNum == reserveNum + 1) {
					reserveList.remove(j);
					okMember++;
					break;
				}
			}
		}

		return okMember;
	}
}
