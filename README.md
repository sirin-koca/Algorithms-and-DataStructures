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
 
[Pensum](https://www.cs.hioa.no/~ulfu/appolonius/index.html)

