public class BST<Key extends Comparable<Key,Value>{
    private node root;
    private class node{
        private Key key;
        private Value val;
        private node left, right;
        public node(Key key, Value){
            this.key = key;
            this.val = val;
        }
    }
    public void put(Key key, Value val){
        root = put(root, key, val);
    }
    private node put(node x, Key key, Value val){
        if(x == null)
            return new node(key, val);
        int cmp = key.compareTo(x.key);
        if(cmp < 0)
            x.left = put(x.left, key, val);
        else if(cmp > 0)
            x.right = put(x.right, key, val);
        else x.val = val;
        return x;
    }
    public Value get(Key key){
        node x = root;
        while(x != null){
            int cmp = key.compareTo(x.key);
            if(cmp < 0)
                x = x.left;
            else if(cmp > 0)
                x = x.right;
            else return x.val;
        }
        return null;
    }
    
}
