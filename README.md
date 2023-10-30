# DATS2300-Algorithms-and-DataStructures 

**_All examples and class-work located under the [/src](https://github.com/sirin-koca/Algorithms-and-DataStructures/tree/master/src) folder._** 

"An algorithm is a finite sequence of precise instructions to solve a specific computational problem."

[Curriculum](https://www.cs.hioa.no/~ulfu/appolonius/kap1/kap1.html)

---

## Analyzing Algorithms

Algorithm analysis is an important part of computational complexity theory. It is the process of finding the computational complexity of algorithms; the amount of time, storage, or other resources needed to execute them. 

**Arbeidsmengde**: I mange algoritmer er det mulig å «telle opp» antallet ganger den dominerende operasjonen utføres. Dette antallet utgjør algoritmens arbeidsmengde.

**Algoritmeorden**: Anta at vi har en algoritme som løser en oppgave av «størrelse» n og at arbeidsmengden er gitt som en funksjon av n. Hvis g ( n ) er funksjonens dominerende ledd, sier vi at algoritmen er av orden g ( n ). Hvis arbeidsmengden til en algoritme er gitt ved ƒ( n ) = 2 n² + 3 n + log2 n − 1, så er algoritmen av orden n² eller av kvadratisk orden.

> _When analyzing algorithms, we often focus on the dominant term of the function, as it dictates the performance behaviour as n grows. In the provided example, 2 n² is the dominant term, so the algorithm is of quadratic order._

---
## Runtime Analysis

- **Big O Notation**: *Big O Notation* is used to describe the upper bound of a particular algorithm. Big O is used to describe worst-case scenarios.
- **Little O Notation**: Little O Notation* is also used to describe an upper bound of a particular algorithm; however, Little O provides a bound that is not asymptotically tight.
- **Big Ω Omega Notation**: Big Omega Notation* is used to provide an asymptotic lower bound on a particular algorithm.
- **Little ω Omega Notation**: Little Omega Notation* is used to provide a lower bound on a particular algorithm that is not asymptotically tight.
- **Theta Θ Notation**: Theta Notation* is used to provide a bound on a particular algorithm such that it can be "sandwiched" between two constants (one for an upper limit and one for a lower limit) for sufficiently large values.

---

## Big O Notation  - *How well does my algorithm scale?*
Big O Notation is a way to measure an algorithm’s efficiency. It measures the time it takes to run your function as the input grows. In other words, it tells us how well the function scales.

There are two parts to measuring efficiency —  **time complexity** and **space complexity**. Time complexity is a measure of how long the function takes to run in terms of its computational steps. Space complexity has to do with the amount of memory used by the function.

---

## Time Complexity - Big O Notation: From Best to Worst

- **O(1)**: Constant time
  - The running time of the algorithm is constant and doesn't depend on the size of the input.
  
- **O(log n)**: Logarithmic time
  - Often seen in algorithms that decrease their input size significantly with each step (e.g., binary search).
  
- **O(n)**: Linear time
  - The running time increases linearly with the size of the input (e.g., simple search algorithms, iterating over all elements in a list).
  
- **O(n log n)**: Linearithmic time
  - Common in more efficient sorting algorithms like merge sort and quicksort.
  
- **O(n^2)**: Quadratic time
  - Often seen in algorithms with nested loops over the data (e.g., bubble sort, insertion sort).
  
- **O(n^3)**: Cubic time
  - Algorithms with three nested loops, less common than quadratic time but can be seen in some more naive algorithms.
  
- **O(2^n)**: Exponential time
  - Often seen in algorithms that solve problems by considering many different combinations, such as the naive solutions to the traveling salesman problem or the powerset of a set.
  
- **O(n!)**: Factorial time
  - Algorithms that have to consider all possible permutations of the input. This is even slower than exponential time and is often seen in problems like the brute-force solutions to the traveling salesman problem.


---

## DATA STRUCTURES
### Array
An Array is a collection of elements identified by index or key values. The memory for an array is allocated contiguously, meaning that the elements are stored next to each other in memory.
Arrays have a fixed size, meaning once they're allocated, their size can't change.
* Time Complexity:
   * Access: O(1)
   * Search:
     O(n) for a linear search,
     O(logn) for binary search (if the array is sorted)
   * Insert: O(n) (because of the need to shift elements, worst case)
   * Remove: O(n) (because of the need to shift elements, worst case)

### ArrayList (or Dynamic Array)
An ArrayList or Dynamic Array is a data structure that allows elements to be stored in a contiguous block of memory, similar to an array, but its size can be changed during runtime. If the array becomes full and a new element needs to be added, a new, larger block of memory is allocated, and the elements are copied over.
* Time Complexity (average case):
   * Access: O(1)
   * Search: O(n) for a linear search
   * Insert: O(1) (amortized, because occasionally the list will need to be resized)
   * Remove: O(n)

### Linked List
 * A *Linked List* is a linear collection of data elements, called nodes, each
   pointing to the next node by means of a pointer. It is a data structure
   consisting of a group of nodes which together represent a sequence.
 * **Singly-linked list**: linked list in which each node points to the next node and the last node points to null
 * **Doubly-linked list**: linked list in which each node has two pointers, p and n, such that p points to the previous node and n points to the next node; the last node's n pointer points to null
 * **Circular-linked list**: linked list in which each node points to the next node and the last node points back to the first node
 * Time Complexity:
   * Access: `O(n)`
   * Search: `O(n)`
   * Insert: `O(1)`
   * Remove: `O(1)`

### Stack
 * A *Stack* is a collection of elements, with two principle operations: *push*, which adds to the collection, and
   *pop*, which removes the most recently added element
 * **Last in, first out data structure (LIFO)**: the most recently added object is the first to be removed
 * Time Complexity:
   * Access: `O(n)`
   * Search: `O(n)`
   * Insert: `O(1)`
   * Remove: `O(1)`

### Queue
 * A *Queue* is a collection of elements, supporting two principle operations: *enqueue*, which inserts an element
   into the queue, and *dequeue*, which removes an element from the queue
 * **First in, first out data structure (FIFO)**: the oldest added object is the first to be removed
 * Time Complexity:
   * Access: `O(n)`
   * Search: `O(n)`
   * Insert: `O(1)`
   * Remove: `O(1)`

### Tree
 * A *Tree* is an undirected, connected, acyclic graph

### Binary Tree
 * A *Binary Tree* is a tree data structure in which each node has at most two children, which are referred to as
   the *left child* and *right child*
 * **Full Tree**: a tree in which every node has either 0 or 2 children
 * **Perfect Binary Tree**: a binary tree in which all interior nodes have two children and all leave have the same depth
 * **Complete Tree**: a binary tree in which every level *except possibly the last* is full and all nodes in the last
   level are as far left as possible

### Binary Search Tree
 * A binary search tree, sometimes called BST, is a type of binary tree which maintains the property that the value in each
   node must be greater than or equal to any value stored in the left sub-tree, and less than or equal to any value stored
   in the right sub-tree
 * Time Complexity:
   * Access: `O(log(n))`
   * Search: `O(log(n))`
   * Insert: `O(log(n))`
   * Remove: `O(log(n))`

### Heap
* A *Heap* is a specialized tree based structure data structure that satisfies the *heap* property: if A is a parent node of
B, then the key (the value) of node A is ordered with respect to the key of node B with the same ordering applying across the entire heap.
A heap can be classified further as either a "max heap" or a "min heap". In a max heap, the keys of parent nodes are always greater
than or equal to those of the children and the highest key is in the root node. In a min heap, the keys of parent nodes are less than
or equal to those of the children and the lowest key is in the root node
* Time Complexity:
  * Access Max / Min: `O(1)`
  * Insert: `O(log(n))`
  * Remove Max / Min: `O(log(n))

### Hashing
* *Hashing* is used to map data of an arbitrary size to data of a fixed size. The values returned by a hash
  function are called hash values, hash codes, or simply hashes. If two keys map to the same value, a collision occurs
* **Hash Map**: a *hash map* is a structure that can map keys to values. A hash map uses a hash function to compute
  an index into an array of buckets or slots, from which the desired value can be found.
* Collision Resolution
 * **Separate Chaining**: in *separate chaining*, each bucket is independent, and contains a list of entries for each index. The
 time for hash map operations is the time to find the bucket (constant time), plus the time to iterate through the list
 * **Open Addressing**: in *open addressing*, when a new entry is inserted, the buckets are examined, starting with the
 hashed-to-slot and proceeding in some sequence, until an unoccupied slot is found. The name open addressing refers to
 the fact that the location of an item is not always determined by its hash value

### Graph
* A *Graph* is an ordered pair of G = (V, E) comprising a set V of vertices or nodes together with a set E of edges or arcs,
  which are 2-element subsets of V (i.e. an edge is associated with two vertices, and that association takes the form of the
  unordered pair comprising those two vertices)
 * **Undirected Graph**: a graph in which the adjacency relation is symmetric. So if there exists an edge from node u to node
 v (u -> v), then it is also the case that there exists an edge from node v to node u (v -> u)
 * **Directed Graph**: a graph in which the adjacency relation is not symmetric. So if there exists an edge from node u to node v
 (u -> v), this does *not* imply that there exists an edge from node v to node u (v -> u)


## Algorithms

### Sorting

#### Quicksort
* Stable: `No`
* Time Complexity:
  * Best Case: `O(nlog(n))`
  * Worst Case: `O(n^2)`
  * Average Case: `O(nlog(n))`

#### Mergesort
* *Mergesort* is also a divide and conquer algorithm. It continuously divides an array into two halves, recurses on both the
  left subarray and right subarray and then merges the two sorted halves
* Stable: `Yes`
* Time Complexity:
  * Best Case: `O(nlog(n))`
  * Worst Case: `O(nlog(n))`
  * Average Case: `O(nlog(n))`

#### Bucket Sort
* *Bucket Sort* is a sorting algorithm that works by distributing the elements of an array into a number of buckets. Each bucket
  is then sorted individually, either using a different sorting algorithm, or by recursively applying the bucket sorting algorithm
* Time Complexity:
  * Best Case: `Ω(n + k)`
  * Worst Case: `O(n^2)`
  * Average Case:`Θ(n + k)`

#### Radix Sort
* *Radix Sort* is a sorting algorithm that like bucket sort, distributes elements of an array into a number of buckets. However, radix
  sort differs from bucket sort by 're-bucketing' the array after the initial pass as opposed to sorting each bucket and merging
* Time Complexity:
  * Best Case: `Ω(nk)`
  * Worst Case: `O(nk)`
  * Average Case: `Θ(nk)`

### Graph Algorithms

#### Depth First Search
* *Depth First Search* is a graph traversal algorithm which explores as far as possible along each branch before backtracking
* Time Complexity: `O(|V| + |E|)`

#### Breadth First Search
* *Breadth First Search* is a graph traversal algorithm which explores the neighbor nodes first, before moving to the next
  level neighbors
* Time Complexity: `O(|V| + |E|)`

#### Topological Sort
* *Topological Sort* is the linear ordering of a directed graph's nodes such that for every edge from node u to node v, u
  comes before v in the ordering
* Time Complexity: `O(|V| + |E|)`

#### Dijkstra's Algorithm
* *Dijkstra's Algorithm* is an algorithm for finding the shortest path between nodes in a graph
* Time Complexity: `O(|V|^2)`

---

## Video Lectures
* Data Structures
    * [UC Berkeley Data Structures](https://archive.org/details/ucberkeley-webcast?&and[]=subject%3A%22Computer%20Science%22&and[]=subject%3A%22CS%22)
    * [MIT Advanced Data Structures](https://www.youtube.com/watch?v=T0yzrZL1py0&list=PLUl4u3cNGP61hsJNdULdudlRL493b-XZf&index=1)
* Algorithms
    * [MIT Introduction to Algorithms](https://www.youtube.com/watch?v=HtSuA80QTyo&list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb&index=1)
    * [MIT Advanced Algorithms](https://www.youtube.com/playlist?list=PL6ogFv-ieghdoGKGg2Bik3Gl1glBTEu8c)
    * [UC Berkeley Algorithms](https://archive.org/details/ucberkeley-webcast?&and[]=subject%3A%22Computer%20Science%22&and[]=subject%3A%22CS%22)

Source: [Kevin Naughton](https://github.com/kdn251/interviews)

---

## Recursive Data Structure
- A recursive data structure is an object or class that contains an abstraction of itself.
- In mathematical terms, we say that the object is "isomorphic" to itself. The basics of a recursive data structure is the Composite Design pattern. Recursive data structures enable us to represent repetitive abstract patterns. In such, they enable us to generate or represent complexity from simplicity.

## Recursive Algorithm
- A recursive algorithm is a process that accomplishes its task, in part, by calling an abstraction of itself
- The similarity between recursive algorithms and recursive data structures is because in an OO system, the structure drives the algorithm. 
- A recursive processes or data structure is defined in terms of itself. A properly written recursive function must handle the base case, and convergence to the base case. Failure to properly handle the base case or converge to the base case (divergence) may result in infinite recursion.

## Recursive Method
- Recursion is a method in OOP which calls itself directly or indirectly until a suitable condition is met. 
- Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down into simple problems which are easier to solve.
- To prevent infinite recursion, you need at least one branch (i.e. of an if/else statement) that does not make a recursive call. Branches without recursive calls are called base cases; branches with recursive calls are called recursive cases.


_E.g. A Recursive Factorial Function_

```
public static int fac(int n) {
  if (n <= 1) {
  return 1;
  } else {
  return n * fac(n - 1);
  }
}


// Et annet eksempel på rekursiv metode:
// Euklids algoritme for det største felles divisor

  public static int euklid(int a, int b)
  {
    if (b == 0) return a;
    int r = a % b;            // r er resten
    return euklid(b,r);       // rekursivt kall
  }
     
 
```

```
   \  :  /                      \  :  /
`. __/ \__ .'                `. __/ \__ .'
_ _\     /_ _                _ _\     /_ _
   /_   _\                      /_   _\
 .'  \ /  `.                  .'  \ /  `.
   /  :  \                      /  :  \ 
     

```


# Examples:


<p><strong>O(1) - Constant Time Examples:</strong></p>

<ul>
<li><strong>Algorithm 1:</strong></li>
</ul>

<p>Algorithm 1 prints hello once and it doesn't depend on n, so it will always run in constant time, so it is <code>O(1)</code>.</p>

<pre><code>print "hello";
</code></pre>

<ul>
<li><strong>Algorithm 2:</strong></li>
</ul>

<p>Algorithm 2 prints hello 3 times, however it does not depend on an input size. Even as n grows, this algorithm will always only print hello 3 times. That being said 3, is a constant, so this algorithm is also <code>O(1)</code>.</p>

<pre><code>print "hello";
print "hello";
print "hello";
</code></pre>

<p><strong>O(log(n)) - Logarithmic Examples:</strong></p>

<ul>
<li><strong>Algorithm 3 - This acts like "log_2"</strong></li>
</ul>

<p>Algorithm 3 demonstrates an algorithm that runs in log_2(n). Notice the post operation of the for loop multiples the current value of i by 2, so <code>i</code> goes from 1 to 2 to 4 to 8 to 16 to 32 ... </p>

<pre><code>for(int i = 1; i &lt;= n; i = i * 2)
  print "hello";
</code></pre>

<ul>
<li><strong>Algorithm 4 - This acts like "log_3"</strong></li>
</ul>

<p>Algorithm 4 demonstrates log_3. Notice <code>i</code> goes from 1 to 3 to 9 to 27...</p>

<pre><code>for(int i = 1; i &lt;= n; i = i * 3)
  print "hello";
</code></pre>

<ul>
<li><strong>Algorithm 5 - This acts like "log_1.02"</strong></li>
</ul>

<p>Algorithm 5 is important, as it helps show that as long as the number is greater than 1 and the result is repeatedly multiplied against itself, that you are looking at a logarithmic algorithm.</p>

<pre><code>for(double i = 1; i &lt; n; i = i * 1.02)
  print "hello";
</code></pre>

<p><strong>O(n) - Linear Time Examples:</strong></p>
<ul>
<li><strong>Algorithm 6</strong></li>
</ul>

<p>This algorithm is simple, which prints hello n times.</p>

<pre><code>for(int i = 0; i &lt; n; i++)
  print "hello";
</code></pre>

<ul>
<li><strong>Algorithm 7</strong></li>
</ul>

<p>This algorithm shows a variation, where it will print hello n/2 times. n/2 = 1/2 * n. We ignore the 1/2 constant and see that this algorithm is O(n).</p>

<pre><code>for(int i = 0; i &lt; n; i = i + 2)
  print "hello";
</code></pre>

<p><strong>O(n*log(n)) - nlog(n) Examples:</strong></p>

<ul>
<li><strong>Algorithm 8</strong></li>
</ul>

<p>Think of this as a combination of <code>O(log(n))</code> and <code>O(n)</code>. The nesting of the for loops help us obtain the <code>O(n*log(n))</code></p>

<pre><code>for(int i = 0; i &lt; n; i++)
  for(int j = 1; j &lt; n; j = j * 2)
    print "hello";
</code></pre>

<ul>
<li><strong>Algorithm 9</strong></li>
</ul>

<p>Algorithm 9 is like algorithm 8, but each of the loops has allowed variations, which still result in the final result being <code>O(n*log(n))</code></p>

<pre><code>for(int i = 0; i &lt; n; i = i + 2)
  for(int j = 1; j &lt; n; j = j * 3)
    print "hello";
</code></pre>

<p><strong>O(n^2) - n squared Examples:</strong></p>

<ul>
<li><strong>Algorithm 10</strong></li>
</ul>

<p><code>O(n^2)</code> is obtained easily by nesting standard for loops.</p>

<pre><code>for(int i = 0; i &lt; n; i++)
  for(int j = 0; j &lt; n; j++)
    print "hello";
</code></pre>

<ul>
<li><strong>Algorithm 11</strong></li>
</ul>

<p>Like algorithm 10, but with some variations.</p>

<pre><code>for(int i = 0; i &lt; n; i++)
  for(int j = 0; j &lt; n; j = j + 2)
    print "hello";
</code></pre>

<p><strong>O(n^3) - n cubed Examples:</strong></p>

<ul>
<li><strong>Algorithm 12</strong></li>
</ul>

<p>This is like algorithm 10, but with 3 loops instead of 2.</p>

<pre><code>for(int i = 0; i &lt; n; i++)
  for(int j = 0; j &lt; n; j++)
    for(int k = 0; k &lt; n; k++)
      print "hello";
</code></pre>

<ul>
<li><strong>Algorithm 13</strong></li>
</ul>

<p>Like algorithm 12, but with some variations that still yield <code>O(n^3)</code>.</p>

<pre><code>for(int i = 0; i &lt; n; i++)
  for(int j = 0; j &lt; n + 5; j = j + 2)
    for(int k = 0; k &lt; n; k = k + 3)
      print "hello";
</code></pre>


**[⬆ back to top](#)**
