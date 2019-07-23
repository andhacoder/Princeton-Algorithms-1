public value get(Key key){
    if isEmpty()
        return null;
    int i = rank(key);
    if(i < N && keys[i].compareTo(key) == 0)
        return vals[i];
    else return null;
}
private int rank(Key key){
    int lo = 0, hi = N-1;
    while(lo <= hi){
        int mid = lo + (hi - lo)/2;
        if(key < keys[mid])
            hi = mid -1;
        else if(key > keys[mid])
            lo = lo + 1;
        else return mid;
    }
}
