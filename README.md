# DATS2300-Algorithms-and-DataStructures 

<h4>"An algorithm is a finite sequence of precise instructions to solve a specific computational problem."</h4>

---
* Chapter 1: Basic Concepts and Techniques
* Chapter 2: Plane Geometry Algorithms
* Chapter 3: Linear Data-structures
* Chapter 4: Stacks and Queues
* Chapter 5: Binary Trees
* Chapter 6: Hashing and Hashing Techniques
* Chapter 7: Data Compression
* Chapter 9: Balanced Binary Trees
* Chapter 10: Applications of Trees
* Chapter 11: Graphs
---

## Qualities of a Good Algorithm
* Input and output should be defined precisely.
* Each step in the algorithm should be clear and unambiguous.
* Algorithms should be most effective among many different ways to solve a problem.
* An algorithm shouldn't include computer code. Instead, the algorithm should be written in such a way that it can be used in different programming languages.


## Analyzing Algorithms

Algorithm analysis is an important part of computational complexity theory. It is the process of finding the computational complexity of algorithms; the amount of time, storage, or other resources needed to execute them. 

**Arbeidsmengde**: I mange algoritmer er det mulig å «telle opp» antallet ganger den dominerende operasjonen utføres. Dette antallet utgjør algoritmens arbeidsmengde.

**Algoritmeorden**: Anta at vi har en algoritme som løser en oppgave av «størrelse» n og at arbeidsmengden er gitt som en funksjon av n. Hvis g ( n ) er funksjonens dominerende ledd, sier vi at algoritmen er av orden g ( n ). Hvis arbeidsmengden til en algoritme er gitt ved ƒ( n ) = 2 n² + 3 n + log2 n − 1, så er algoritmen av orden n² eller av kvadratisk orden.

**Gjennomsnittelig arbeidsmengde**: For å finne gjennomsnittlig arbeidsmengde er det nødvendig å gjøre noen forutsetninger. Vi antar for det første at alle verdiene i a er forskjellige, så at alle verdiene blir søkt etter med samme sannsynlighet og til slutt at a inneholder verdien det søkes etter. Ligger verdi først blir det 1 sammenligning, 2 sammenligninger hvis den ligger nest først, osv. Til slutt hvis den ligger bakerst blir det n sammenligninger. Tilsammen 1 + 2 + · · · + n = ½ n ( n + 1) sammenligninger. Gjennomsnittet får vi ved å dele på n. Med andre ord ½ (n + 1) sammenligninger i gjennomsnitt med hensyn på de gitte forutsetningene.

---

## Big O Notation 

**How well does my algorithm scale?**

Big O Notation is a way to measure an algorithm’s efficiency. It measures the time it takes to run your function as the input grows. Or in other words, it tells us how well does the function scale.

There are two parts to measuring efficiency —  **time complexity** and **space complexity**. Time complexity is a measure of how long the function takes to run in terms of its computational steps. Space complexity has to do with the amount of memory used by the function.

[towardsdatascience.com](https://towardsdatascience.com/introduction-to-big-o-notation-820d2e25d3fd)

---

## Time Complexity
- **O(log n) - Logarithmic time complexity** 
O(log n) means time goes up linearly while the n goes up exponentially. So if it takes 1 second to compute 10 elements, it will take 2 seconds to compute 100
elements, 3 seconds to compute 1000 elements, and so on. An example is binary search.

- **O(n) - Linear time complexity**
 O(n) describes an algorithm whose performance will grow linearly and in direct proportion to the size of the input data set. As the input increases, the time to run the algorithm will grow proportionally. Dobling av antall = dobling av tid.

- **O(n²) - Quadratic time complexity**
 O(n²) represents an algorithm whose performance is directly proportional to the square of the size of the input data set. This is common with algorithms that involve nested iterations over the data set. As the input increases, the time to run the algorithm grows at the rate of it’s square.
 
 ---
 
 <p><strong>Simple Code Examples Of Various Big O Categories:</strong></p>

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

---

[Pensum](https://www.cs.hioa.no/~ulfu/appolonius/index.html)

