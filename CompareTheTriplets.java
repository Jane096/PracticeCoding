static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        Integer[] score = {0, 0};

        for(int i=0; i<a.size(); i++) {
            if(a.get(i) < b.get(i)) {
                score[1] += 1;
            }else if(a.get(i) == b.get(i)){
                continue;
            }else{
                score[0] += 1;
            }
        }
        List<Integer> list = Arrays.asList(score);
        return list;
    }
