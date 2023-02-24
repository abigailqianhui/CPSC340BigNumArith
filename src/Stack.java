// changed all Objects on the LStack into LLists on the LStack so it can be more easily accessed and used

public interface Stack { // Stack class ADT
        // Reinitialize the stack.
        public void clear();

        // Push "it" onto the top of the stack
        public boolean push(LList it);

        // Remove and return the element at the top of the stack
        public LList pop();

        // Return a copy of the top element
        public LList topValue();

        // Return the number of elements in the stack
        public int length();

        // Return true if the stack is empty
        public boolean isEmpty();
    }

