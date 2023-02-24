// Linked stack implementation
// changed all Objects on the LStack into LLists on the LStack so it can be more easily accessed and used
class LStack implements Stack {
    private Link top;               // Pointer to first element
    private int size;               // Number of elements

    // Constructors
    LStack() { top = null; size = 0; }
    LStack(int size) { top = null; size = 0; }

    // Reinitialize stack
    public void clear() { top = null; size = 0; }

    // Put "it" on stack
    public boolean push(LList it) {
        top = new Link(it, top);
        size++;
        return true;
    }

    // Remove "it" from stack
    public LList pop() {
        if (top == null) return null;
        LList it = top.element();
        top = top.next();
        size--;
        return it;
    }

    public LList topValue() {      // Return top value
        if (top == null) return null;
        return top.element();
    }

    // Return stack length
    public int length() { return size; }

    // Check if the stack is empty
    public boolean isEmpty() { return size == 0; }
}

