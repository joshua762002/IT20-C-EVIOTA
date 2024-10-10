class Stack {
    private int[] stackArray;
    private int top;

    // Constructor to initialize the stack with a specific size
    public Stack(int size) {
        stackArray = new int[size];
        top = -1; // Initially, stack is empty
    }

    // Method to push an element onto the stack
    public boolean push(int value) {
        if (top >= stackArray.length - 1) {  // Stack is full
            return false;
        }
        stackArray[++top] = value;  // Add element to stack
        return true;
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top < 0) {  // Stack is empty
            return -1;
        }
        return stackArray[top--];  // Remove and return top element
    }

    // Method to return the current size of the stack
    public int size() {
        return top + 1;
    }
}
