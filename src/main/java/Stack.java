import java.util.EmptyStackException;

/**
 * 清除对象的引用模拟
 */
public class Stack {

    private Object[] elements;
    private int size = 0;
    private int capacityIncrement = 10;

    public Stack(int initialCapacity){
        elements = new Object[initialCapacity];
    }

    public Stack(int initialCapacity , int capacityIncrement){
        this(initialCapacity);
        this.capacityIncrement = capacityIncrement;
    }

    private void ensureCapacity(){
        if(elements.length == size){
            Object[] old = elements;
            elements = new Object[elements.length + capacityIncrement];
            System.arraycopy(old , 0 , elements , 0 , size);
        }
    }

    public void push(Object object){
        ensureCapacity();
        elements[size++] = object;
    }

    public Object pop(){
        if(size == 0)
            throw new EmptyStackException();
        Object obj = elements[--size];
        elements[size] = null;
        return obj;
    }

    private static final int CAPACITY = 10000000;

    public static void main(String[] args) {
        Stack stack = new Stack(CAPACITY);
        for(int i = 0; i < CAPACITY; i++){
            stack.push(new Integer(i));
        }
        for(int i = 0; i < CAPACITY; i++){
            System.out.println(stack.pop());
        }
    }

}
