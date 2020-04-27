import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {2,1,2,3,2,4,2,5};
        int[] s3 = {3,3,1,1,2,2,4,4,5,5};
        int answer1 = 0; int answer2 = 0; int answer3 = 0;
        
        for(int i=0; i<answers.length; i++) {
            if(s1[i%s1.length] == answers[i]) answer1++;
            if(s2[i%s2.length] == answers[i]) answer2++;
            if(s3[i%s3.length] == answers[i]) answer3++;
        }
        //'수열 인덱스 =  (배열인덱스 % 수열길이)' 로 하면 배열인덱스는 그냥 쭉 검사하는 동시에 수열 
        //인덱스를 범위 초과없이 검사할 수 있게 된다
        
        int largest = Math.max(Math.max(answer1, answer2), answer3);
        ArrayList<Integer> list = new ArrayList<>();
        
        if(answer1 == largest) {
            list.add(1);
        }
        if(answer2 == largest) {
            list.add(2);
        }
        if(answer3 == largest) {
            list.add(3);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
