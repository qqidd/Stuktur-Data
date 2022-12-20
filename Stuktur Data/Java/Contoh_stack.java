import java.util.Stack;

public class Contoh_stack {
    public static void main(String[] args) {

        // Buat Objek Stack
        Stack<String> animals= new Stack<>();
    
        // push elemen ke (memasukkan elemen)
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);
    
        // pop elemen (memunculkan elemen stack)
        animals.pop();
        System.out.println("Stack after pop: " + animals);
    }
}