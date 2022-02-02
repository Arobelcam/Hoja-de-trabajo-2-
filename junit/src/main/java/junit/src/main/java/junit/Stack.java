package junit.src.main.java.junit;

/**
 * Defines all the methods that a Stack should have.
 * @param <Double> Type of the items stored on the Stack. Example: String
 */
public interface Stack<Double> {
    /**
     * Add an item to the stack. Will be popped next.
     * @param item
     */
    public void add(Double item);

    /**
     * If the Stack is not empty, the most recent item will be removed and returned.
     * @return Item
     */
    public Double remove();

    /**
     * Get the current Item on the Stack (without popping it).
     * @return Item
     */
    public Double peek();

    /**
     * Check if the Stack is empty.
     * @return Boolean indicating if the Stack is empty
     */
    public boolean empty();

    /**
     * Get the size of the Stack.
     * @return Integer indicating the size of the Stack
     */
    public int size();
}