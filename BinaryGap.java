import java.util.*;

class Solution {
    public int solution(int N) {
        String binaryN = Integer.toBinaryString(N);
        //int num = Integer.parseInt(binaryN);
        int count = 0;
        char[] num = binaryN.toCharArray();
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<num.length; i++) {// 1이 들어있는 인덱스 값 추출
            if(num[i] == '1') list.add(i);
        }
        
        for(int i=0; i<list.size()-1; i++) {
            int binSize = list.get(i+1) - list.get(i) - 1;
            if(binSize > count) {
                count = binSize;
            }
        }
        return count;
    }
}
