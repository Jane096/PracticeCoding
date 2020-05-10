 // 이진 검색
	    static int binarySearch(int[] array, int arrayLength, int searchValue){
	        int first = 0;// 검색 범위의 첫 인덱스
	        int last = arrayLength-1;// 검색 범위의 끝 인덱스
	        
	        while(first <= last){
	            int center = (first +  last) /2 ; //pivot
	            
	            if(array[center] == searchValue) 
	                return center;    // 검색 성공
	            else if(array[center] < searchValue) 
	                first = center+1;    // 검색 범위를 뒤쪽 절반으로 한정
	            else 
	                 last = center -1;    // 검색 범위를 앞쪽 절반으로 한정
          }
	        return -1;        // 검색 실패
	    }
