// Implementasi stack di Java

class Stack {

    // store elements of stack
    private int arr[];
    // represent bagian top stack
    private int top;
    // kapasitas stack
    private int capacity;
  
    // membuat stack
    Stack(int size) {
      // menginisialisasi array
      // menginisialisasi variabel tumpukan
      arr = new int[size];
      capacity = size;
      top = -1;
    }
  
    // push elemen ke stack
    public void push(int x) {
      if (isFull()) {
        System.out.println("Stack OverFlow");
  
        // mengakhiri program 
        System.exit(1);
      }
  
      // memasukkan elemen ke stack
      System.out.println("Inserting " + x);
      arr[++top] = x;
    }
  
    // menampilkan elemen stack
    public int pop() {
  
      // jika stack kosong
      // tidak ada elemen untuk dimunculkan
      if (isEmpty()) {
        System.out.println("STACK EMPTY");
        // menghentikan program
        System.exit(1);
      }
  
      // menampilkan elemen yang berada di atas stack
      return arr[top--];
    }
  
    // mengembalikan ukuran stack
    public int getSize() {
      return top + 1;
    }
  
    // cek apakah stack kosong (?)
    public Boolean isEmpty() {
      return top == -1;
    }
  
    // cek apakah stack penuh (?)
    public Boolean isFull() {
      return top == capacity - 1;
    }
  
    // tampilkan stack
    public void printStack() {
      for (int i = 0; i <= top; i++) {
        System.out.print(arr[i] + ", ");
      }
    }
  
    public static void main(String[] args) {
      Stack stack = new Stack(5);
  
      stack.push(1);
      stack.push(2);
      stack.push(3);
  
      System.out.print("Stack: ");
      stack.printStack();
  
      // hapus stack
      stack.pop();
      System.out.println("\nAfter popping out");
      stack.printStack();
  
    }
  }
