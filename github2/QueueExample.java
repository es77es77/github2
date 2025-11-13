import java.util.LinkedList;

class MyQueue<T> {

    // 使用 JCF 的 LinkedList 當作底層儲存結構（不直接使用 java.util.Queue）
    private LinkedList<T> queue;

    public MyQueue() {
        queue = new LinkedList<>();
    }

    // 將元素加入佇列尾端（enqueue）
    public void enqueue(T item) {
        queue.addLast(item);
    }

    // 從佇列前端取出元素並回傳（dequeue）
    public T dequeue() {
        return queue.removeFirst();
    }

    // 佇列是否為空
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // 目前佇列中的元素個數
    public int size() {
        return queue.size();
    }
}

public class QueueExample {
    public static void main(String[] args) {
        MyQueue<Integer> intQueue = new MyQueue<>();
        // 可以在這裡自己測試
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);

        System.out.println(intQueue.dequeue()); // 10
        System.out.println(intQueue.dequeue()); // 20
        System.out.println(intQueue.dequeue()); // 30
    }
}


//我的Junit測試會測這個Object，這邊以下請不要修改
//---------------------------------------------------------------------------------
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
//---------------------------------------------------------------------------------
