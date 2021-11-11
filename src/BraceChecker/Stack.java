package BraceChecker;

public class Stack {
    public int stck[] = new int[0];
    int size;

    public Stack() {
        size = 0;
    }

    void push(int symbol) {
        if (size == stck.length) {

            extend();
            stck[size++] = symbol;
        } else {
            stck[size++] = symbol;
        }
    }

    public int pop() {
        if (size < 0) {
            System.out.println("Stacke lracvac che");
            return 0;
        } else {
            //  int lastValue = stck[size--];
            //      deleteLast();
            return stck[--size];
        }
    }

    private void extend() {
        int temp[] = new int[stck.length + 1];
        for (int i = 0; i < stck.length; i++) {
            temp[i] = stck[i];
        }
        stck = temp;
    }
}

