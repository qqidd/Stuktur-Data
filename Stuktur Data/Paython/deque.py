# Implementasi
# Stack menggunakan deque
from collections import deque
queue = deque(["Ram", "Tarun", "Asif", "John"])
print(queue)
queue.append("Akbar")
print(queue)
queue.append("Birbal")
print(queue)
print(queue.pop())                 
print(queue.pop())                 
print(queue)

# Namun jika menyangkut antrean, penerapan daftar di atas tidak efisien. Dalam antrian saat pop() dibuat dari awal daftar yang lambat. Hal ini terjadi karena sifat-sifat list, yang cepat pada operasi akhir tetapi lambat pada operasi awal, karena semua elemen lainnya harus digeser satu per satu.
# Jadi, kami lebih suka menggunakan dequeue daripada daftar, yang dirancang khusus untuk menambahkan dan muncul dengan cepat dari bagian depan dan belakang.

# Implementasi
# Queue menggunakan deque
from collections import deque
queue = deque(["Ram", "Tarun", "Asif", "John"])
print(queue)
queue.append("Akbar")
print(queue)
queue.append("Birbal")
print(queue)
print(queue.popleft())                 
print(queue.popleft())                 
print(queue)