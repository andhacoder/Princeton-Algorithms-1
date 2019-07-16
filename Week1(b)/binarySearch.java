//Inv: if key appears in a[] then a[lo] <= key <= a[mid]
public int binarySearch( int[] a, int key){
    int lo= 0, hi = a.length - 1;
    int mid = (lo + hi) / 2;
    while(lo <= hi){
        if (key < a[mid])
            hi = mid -1;
        else if(key > a[mid])
            lo = mid + 1;
        else return mid;
    }
    return -1;
}
