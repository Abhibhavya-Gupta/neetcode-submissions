class MyHashSet {
    boolean[] ispresent;

    public MyHashSet() {
        ispresent=new boolean[1000001];
    }
    
    public void add(int key) {
        ispresent[key]=true;
    }
    
    public void remove(int key) {
        ispresent[key]=false;
    }
    
    public boolean contains(int key) {
        return ispresent[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */