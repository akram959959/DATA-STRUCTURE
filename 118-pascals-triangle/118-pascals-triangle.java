class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> pt=new ArrayList<>(); 
        List<Integer> p=new ArrayList<>();
        List<Integer> q;
        for(int i=0;i<numRows;i++){
            if(i==0){
            q=List.of(1);
            }
            else if (i==1){
                q=List.of(1,1);
            }
            else{
                q=new ArrayList<>();
                q.add(1);
                for(int j=1;j<i;j++){
                    q.add(p.get(j)+p.get(j-1));
                }
                q.add(1);
            }
            p=q;
            pt.add(q);
        }
        return pt;
        
        
    }
}



/*List<Integer> pr = new ArrayList<>();
        List<Integer> c;
        
        for(int i=0;i<numRows;i++) {
            if(i==0) {
                c = List.of(1);
            }
            else if(i==1) {
                c = List.of(1,1);
            }
            else {
                c = new ArrayList<>();
                c.add(1);
                for(int j=1;j<i;j++) {
                    c.add(pr.get(j)+pr.get(j-1));
                }
                c.add(1);
            }
            pr=c;
            pt.add(c);
        }
        return pt;*/