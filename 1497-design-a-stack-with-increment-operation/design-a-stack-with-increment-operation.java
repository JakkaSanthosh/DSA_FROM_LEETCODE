class CustomStack {
    int maxSize, idx;
    int arr[];

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        idx = -1;
        arr = new int[maxSize];
        Arrays.fill(arr, -1);
    }

    public void push(int x) {
        if (idx < maxSize-1){
         idx++;
         arr[idx] = x;
        }
    }

    public int pop() {
        if (idx != -1){
             idx--;
            return arr[idx+1];
        }
        return -1;
    }

    public void increment(int k, int val) {
        int i = 0;
        while (i < maxSize && i < k && arr[i] != -1)
            arr[i++] += val;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */