package interview;

public class Stack {

    public Object count = null;

    public boolean isEmpty() {
        if (count == null) {
            return true;
        } else {
            return false;
        }

    }

    public Object peakTop() {
        return count;
    }

    public void push(Object data) {
        count = data;
    }

    public Object pop() {
        Object top = count;
        count =- 1;
        return top;
    }
}
