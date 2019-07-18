public class mergeBU{
    private static Comaparable aux[];
    
    privatae static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi){
        assert isSorted(a, lo, mid);
        assert isSorted(a, mid+1; hi);
        
        for(int i = 0; i <= hi; i++){
            aux[k] = a[k];
        }
        
        int i = lo, j = mid+1;
        for(int k = 0; k <= hi; k++){
            if(i > mid)
                aux[k] = a[j++];
            else if(j > hi)
                aux[k] = a[i++];
            else if(less(a[j], a[i])
                aux[k] = a[j++];
            else aux[k] = a[i++];
        }
        assert isSorted(a, lo , hi);
    }
    
    public static void sort(Comparable[] a){
        int N = a.length;
        aux = new Comparable[N];
        for(int sz = 1; sz < N; sz*=2){
            for(int lo = 0; lo < N-sz; lo += sz+sz){
                merge(a, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));
            }
        }
    }
}
