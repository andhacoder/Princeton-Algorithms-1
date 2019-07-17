public ResizingArrayStackOfStrings(){
    s = new String[1];
}

public void push(String item){
    if(s.length == N){
        resize(2*length);
    }
    s[N++] = item;
}

private void resize(int capacity){
    String[] copy = new String[capacity];
    for(int i = 0; i < N; i++)
        copy[i] = s[i];
    s = copy;
}

public String pop(){
    String item = s[--N];
    if(N > 0 && N == s.length/4)
        resize(s.length/2)
}
