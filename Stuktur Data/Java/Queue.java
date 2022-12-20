// Implementasi queue di Java

public class Queue {
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;
  
    Queue() {
      front = -1;
      rear = -1;
    }
  
    // mengecek isi queue (apakah queue full?)
    boolean isFull() {
      if (front == 0 && rear == SIZE - 1) {
        return true;
      }
      return false;
    }
  
    // mengecek isi queue (apakah queue kosong?)
    boolean isEmpty() {
      if (front == -1)
        return true;
      else
        return false;
    }
  
    // insert elemen ke queue
    void enQueue(int element) {
  
      // if queue is full
      if (isFull()) {
        System.out.println("Queue is full");
      }
      else {
        if (front == -1) {
          // tanda front menunjukkan elemen pertama antrian
          front = 0;
        }
  
        rear++;
        // sisipkan elemen di bagian belakang
        items[rear] = element;
        System.out.println("Insert " + element);
      }
    }
  
    // hapus elemen di queue
    int deQueue() {
      int element;
  
      // jika queue kosong
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return (-1);
      }
      else {
        // menghapus elemen (di depan) pada queue
        element = items[front];
  
        // jika elemen queue hanya 1
        if (front >= rear) {
          front = -1;
          rear = -1;
        }
        else {
          // tandai elemen berikutnya sebagai bagian depan (front)
          front++;
        }
        System.out.println( element + " Deleted");
        return (element);
      }
    }
  
    // tampilkan queue
    void display() {
      int i;
      if (isEmpty()) {
        System.out.println("Empty Queue");
      }
      else {
        // tampilkan elemen front queue
        System.out.println("\nFront index-> " + front);
  
        // tampilkan queue
        System.out.println("Items -> ");
        for (i = front; i <= rear; i++)
          System.out.print(items[i] + "  ");
  
        // tampilkan bagian belakang queue
        System.out.println("\nRear index-> " + rear);
      }
    }
  
    public static void main(String[] args) {
  
      // membuat objek queue
      Queue q = new Queue();
  
      // coba hapus elemen dari queue
      // queue saat ini kosong
      // jadi penghapusan tidak memungkinkan
      q.deQueue();
  
      // memasukkan elemen ke queue
      for(int i = 1; i < 6; i ++) {
        q.enQueue(i);
      }
  
      // elemen ke-6 tidak dapat ditambahkan ke antrean karena antrean sudah penuh
      q.enQueue(6);
  
      q.display();
  
      // deQueue menghapus elemen yang dimasukkan terlebih dahulu yaitu 1
      q.deQueue();
  
      // sekarang kita hanya memiliki 4 elemen
      q.display();
  
    }
}
