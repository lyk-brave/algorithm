/**
 * 2070. 큰 놈, 작은 놈, 같은 놈
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5QQ6qqA40DFAUq&categoryId=AV5QQ6qqA40DFAUq&categoryType=CODE
 */
package algorithmSWExpertAcademy.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2070 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=1; i<=T; i++) {
			String numberAry[] = br.readLine().split(" ");
			int firstNumber = Integer.parseInt(numberAry[0]);
			int secondNumber = Integer.parseInt(numberAry[1]);
			
			char symbol = ' ';
			if(firstNumber < secondNumber) symbol = '<';
			else if (firstNumber > secondNumber) symbol = '>';
			else symbol = '=';
			
			System.out.println("#"+i+" "+symbol);
		}
	}
}
