/***
 * X보다 작은 수 
 * https://www.acmicpc.net/problem/10871
 */
package algorithmBaekjoon.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem10871 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int chkNum = Integer.parseInt(st.nextToken());
			if(chkNum < X)
				System.out.print(chkNum + " ");
		}
	}
}
