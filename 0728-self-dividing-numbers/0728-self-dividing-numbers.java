class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> sdn_list = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int n = i;
            boolean sdn = true;
            while(n != 0){
                int d = n%10;
                
                if(d == 0 || i%d != 0 ){
                    sdn = false;
                    break;
                }
                n/=10;    
            }
            if(sdn)
                sdn_list.add(i);
        }
        return sdn_list;
    }
}