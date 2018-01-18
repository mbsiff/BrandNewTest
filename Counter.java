
public class Counter {
    private int _val;

    public Counter() {
        _val = 0;
    }

    public int read() {
        return _val;
    }
    
    public void inc() {
        _val++;
    }
}
