/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<Integer>(5);
        array.add(5);
        array.add(3);
        array.add(-4);
        array.add(-12);
        System.out.println(array.size());
        System.out.println(array.isEmpty());
        System.out.println(array.get(1));
        array.set(2, -9);
        System.out.println(array.pop(3));
        System.out.println(array.remove(5));
        System.out.println(array.contains(-4));
        System.out.println(array.indexOf(-4));
        System.out.println(array);
        array.clear();
        System.out.println(array);
        System.out.println();

        Stack<String> stack = new Stack<String>("elem1");
        stack.push("elem2");
        stack.push("elem3");
        stack.push("elem4");
        System.out.println(stack.toString());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.search("elem1"));
        System.out.println(stack.toString());
        
        
    }
}