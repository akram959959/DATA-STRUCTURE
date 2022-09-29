/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long i =0;
        long j =n;
        
        long mid = (i+j)/2;
        while(mid!=i){
            if(isBadVersion((int)mid)){
                j = mid;
                
            }
            else{
                i = mid;
            }
            mid=(i+j)/2;
        }
        return (int)mid +1 ;
        
    }
}
