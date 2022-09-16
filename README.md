# DATS2300-Algorithms-and-DataStructures
### FAGETS EMNER:
* Kapittel 1: Grunnleggende begreper og teknikker
* Kapittel 2: Plangeometriske algoritmer
* Kapittel 3: Lineære datastrukturer
* Kapittel 4: Stakker og køer
* Kapittel 5: Binære trær
* Kapittel 6: Hashing og hashingteknikker
* Kapittel 7: Komprimering
* Kapittel 9: Balanserte binære trær
* Kapittel 10: Anvendelser av trær
* Kapittel 11: Grafer

---

## Analyzing Algorithms

Algorithm analysis is an important part of computational complexity theory, which provides theoretical estimation for the required resources of an algorithm to solve a specific computational problem. Most algorithms are designed to work with inputs of arbitrary length. Analysis of algorithms is the determination of the amount of time and space resources required to execute it.

**Arbeidsmengde**: I mange algoritmer er det mulig å «telle opp» antallet ganger den dominerende operasjonen
utføres. Dette antallet utgjør algoritmens arbeidsmengde.

**Algoritmeorden**: Anta at vi har en algoritme som løser en oppgave av «størrelse» n og at arbeidsmengden er gitt
som en funksjon av n. Hvis g ( n ) er funksjonens dominerende ledd, sier vi at algoritmen er av orden g ( n ).
Hvis arbeidsmengden til en algoritme er gitt ved ƒ( n ) = 2 n² + 3 n + log2 n − 1, så er algoritmen av orden n² eller
av kvadratisk orden.

**Gjennomsnittelig arbeidsmengde**: For å finne gjennomsnittlig arbeidsmengde er det nødvendig å gjøre noen
forutsetninger. Vi antar for det første at alle verdiene i a er forskjellige, så at alle verdiene blir søkt etter med samme
sannsynlighet og til slutt at a inneholder verdien det søkes etter. Ligger verdi først blir det 1 sammenligning, 2
sammenligninger hvis den ligger nest først, osv. Til slutt hvis den ligger bakerst blir det n sammenligninger.
Tilsammen 1 + 2 + · · · + n = ½ n ( n + 1) sammenligninger. Gjennomsnittet får vi ved å dele på n. Med andre ord
½ (n + 1) sammenligninger i gjennomsnitt med hensyn på de gitte forutsetningene.

Det er arbeidsmengden i det mest ugunstige tilfellet og den gjennomsnittlige arbeidsmengden som har mest
interesse.

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

