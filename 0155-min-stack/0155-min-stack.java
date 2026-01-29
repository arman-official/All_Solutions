class MinStack {
    Stack<Long> st;
    long min;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int x) {
        if (st.isEmpty()) {
            st.push((long) x);
            min = x;
        } else if (x >= min) {
            st.push((long) x);
        } else {
            // encode
            st.push(2L * x - min);
            min = x;
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        long top = st.pop();
        if (top < min) {
            // decode previous min
            min = 2 * min - top;
        }
    }

    public int top() {
        long top = st.peek();
        if (top >= min) {
            return (int) top;
        } else {
            // encoded value represents current min
            return (int) min;
        }
    }

    public int getMin() {
        return (int) min;
    }
}
