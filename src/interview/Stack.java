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

    public void push(Object data) {
        count = data;
    }

}
