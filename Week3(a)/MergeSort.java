public class merge{
    public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi){
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
    
    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi){
        if(hi <= lo)
            return;
        int mid = lo + (hi - lo)/2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, hi);
        merge(a, aux, lo, mid, hi);
    }
    
    public static void sort(Comparable[] a){
        aux = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }
}
