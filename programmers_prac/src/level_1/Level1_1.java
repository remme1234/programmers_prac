package level_1;

import java.util.HashSet;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/68644?language=java
 * 두 개 뽑아서 더하기
 * @author Shinu_o
 *
 */
public class Level1_1 {

	public static void main(String[] args) {

		int[] numbers = new int[]{2,1,3,4,1};
		
		solution(numbers);
	}
	
	
    public static int[] solution(int[] numbers) {
        
        HashSet<Integer> resultSet = new HashSet<Integer>();
        
        for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				
				int sum = numbers[i] + numbers[j];
		
				resultSet.add(sum);
				
			}
		}
       
        
       return resultSet.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

}
