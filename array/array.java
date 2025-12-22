public class array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 101;
        arr[1] = 102;
        arr[2] = 103;
        arr[3] = 104;
        arr[4] = 105;

        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

// What is an Array?
// An array is a linear data structure that stores multiple values of the same data type in contiguous memory locations.

// Why Arrays are Used?
// Store multiple values in a single variable
// Fast access using index
// Base of many DSA concepts (stack, queue, heap, DP)

// Types of Arrays in Java
// 🔹 1. One-Dimensional Array
// int[] arr = new int[5];
// Memory Layout
// Index: 0  1  2  3  4
// Value: _  _  _  _  _

// 2. Two-Dimensional Array (Matrix)
// int[][] matrix = new int[3][3];
// Used in
// Matrix problems
// Graphs
// DP tables

// Jagged Array (Irregular 2D Array)
// int[][] jagged = new int[3][];
// jagged[0] = new int[2];
// jagged[1] = new int[4];
// jagged[2] = new int[1];
//  Rows have different lengths


// | Operation       | Description    | Time     |
// | --------------- | -------------- | -------- |
// | Access          | `arr[i]`       | O(1)     |
// | Traverse        | Loop           | O(n)     |
// | Search (Linear) | Find element   | O(n)     |
// | Search (Binary) | Sorted array   | O(log n) |
// | Insert (End)    | Add at last    | O(1)*    |
// | Insert (Middle) | Shift elements | O(n)     |
// | Delete (End)    | Remove last    | O(1)     |
// | Delete (Middle) | Shift elements | O(n)     |


// Array Memory Representation
// Stored in contiguous memory
// Each element has same size
// Address calculation:
// Address = Base + (index × size)
//  This is why access is fast (O(1))


// Advantages of Arrays ✅
// ✅ 1. Fast Access
// arr[3] // O(1)
// ✅ 2. Cache Friendly
// Contiguous memory → better performance
// ✅ 3. Simple & Easy to Use
// Basic structure for beginners
// ✅ 4. Less Memory Overhead
// No pointers like Linked List
// ✅ 5. Foundation of DSA
// Used in sorting, searching, DP, sliding window



// Disadvantages of Arrays ❌
// ❌ 1. Fixed Size
// int[] arr = new int[5]; // Cannot grow
// ❌ 2. Insertion is Costly
// // Insert at index 2
// // Shift all elements → O(n)
// ❌ 3. Deletion is Costly
// Same shifting problem
// ❌ 4. Memory Waste
// Unused allocated space
// ❌ 5. Homogeneous Elements Only
// Same data type only

// | Feature       | Array             | ArrayList       |
// | ------------- | ----------------- | --------------- |
// | Size          | Fixed             | Dynamic         |
// | Speed         | Faster            | Slightly slower |
// | Memory        | Less              | More (overhead) |
// | Type          | Primitive allowed | Objects only    |
// | Insert/Delete | Costly            | Easier          |

// Real-Life Use Cases
// Store marks of students
// Image pixels
// Matrix calculations
// Sliding window problems
// Dynamic Programming tables

// Interview One-Liners 🧠
// “Array provides O(1) random access”
// “Array size is fixed”
// “Insertion & deletion are costly”
// “Better cache performance than linked list”

// When to Use Array vs Linked List?
// 👉 Use Array when:
// Fast access required
// Size known beforehand
// Less insert/delete
// 👉 Use Linked List when:
// Frequent insert/delete
// Size unknown