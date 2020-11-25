package level_1;

import java.util.ArrayList;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42862
 * 체육복
 * @author Shinu_o
 *
 */
public class Level1_2 {

	
	public static void main(String[] args) {
	
		
		int n = 3;
		int[] lost = new int[]{1,2};
		int[] reserve = new int[] {2,3};
	
		
		solution(n, lost, reserve);
		
	}
	
    /**
     * @param n
     * @param lost
     * @param reserve
     * @return
     */
    private static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        List<Integer> memberList = new ArrayList<>();
        List<Integer> lostMemList = arrToList(lost);
        List<Integer> reserveMemList = arrToList(reserve);
        
        
        for (int i = 0; i < n; i++) { // 일단 모든 인원추가
			memberList.add(i+1);
		}

        
        for (int i = 0; i < lostMemList.size(); i++) { 
			
        	int lostMem = lostMemList.get(i);
        	System.out.println("### lostMem :  " + lostMem);
        	int preLostMem = lostMem -1;
        	int afterLostMem = lostMem +1;
        	
        	if(reserveMemList.contains(lostMem)) {
        		reserveMemList.remove(Integer.valueOf(lostMem));
        		continue;
        	}
        	
        	if(reserveMemList.contains(preLostMem)) { 
        		System.out.println("reserve contain preLostMem : " + preLostMem);
        		reserveMemList.remove(Integer.valueOf(preLostMem));
        		System.out.println("reserveMemList remove : " + preLostMem);
        	} else if (reserveMemList.contains(afterLostMem)) {
        		
        		System.out.println("reserve contain  afterLostMem : " + afterLostMem);
        		reserveMemList.remove(Integer.valueOf(afterLostMem));
        		System.out.println("reserveMemList remove : " + afterLostMem);
        		
        		
        	} else {
        		
        		System.out.println("reserve not contain : " + lostMem);
        		memberList.remove(Integer.valueOf(lostMem));
        		System.out.println("memberList remove : " + lostMem);        		
        		
        	}
		}

        answer = memberList.size();
        
        System.out.println(answer);
        
        return answer;
    }
    
    private static List<Integer> arrToList(int[] array) {
    	List<Integer> intList = new ArrayList<Integer>();
        for (int i : array) {
            intList.add(i);
        }
        
        return intList;
    }
    
    
}
