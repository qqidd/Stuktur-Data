import java.util.Queue;
import java.util.LinkedList;

class Contoh_queue {

  public static void main(String[] args) {
    // Membuat Queue menggunakan kelas LinkedList
    Queue<Integer> numbers = new LinkedList<>();

    // enqueue
    // insert elemen ke queue
    numbers.offer(1);
    numbers.offer(2);
    numbers.offer(3);
    System.out.println("Queue: " + numbers);

    // dequeue
    // menghapus elemen queue
    int removedNumber = numbers.poll();
    System.out.println("Removed Element: " + removedNumber);

    System.out.println("Queue after deletion: " + numbers);
    }
}