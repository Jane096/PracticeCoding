import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] nums = new String[numbers.length];
        
        //Convert int to String 
        for(int i=0; i<numbers.length; i++) {
            nums[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(nums, new Comparator<String>(){ //사용자정의 순서 
            @Override
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2); //거꾸로 하면 제일 작은수가 나옴..
            }
        });
        if(nums[0].equals("0")) return "0";
        for(int i=0; i<nums.length; i++) {
            answer += nums[i]; 
        }// 숫자 하나하나마다 인덱스 존재(..?)
        return answer;
    }
}
