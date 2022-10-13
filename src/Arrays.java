public class Arrays {

    // Array is a data structure where we store similar elements.
    // We can store only a fixed set of elements in a Java array.
    public static void main(String[] args){

        //declaration and instantiation
        int[] a =new int[5]; // integer array with 5 elements
        a[0]=1; //initialization: index 0 of "a" is allocated for integer 1
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;

        //traversing array from left to right (ASC order)
        System.out.print("ASC order: ");        
        for(int i=0; i < a.length; i++) //length is the property of array
            System.out.print(a[i] + ", ");

        System.out.println(); // empty line for break

        
        //traversing array from right to left (DESC order)
        System.out.print("DESC order: ");
        int n = a.length;
        for (int i = n-1 ; i >= 0 ; i--) {
            System.out.print(a[i] + ", ");
        }

        System.out.println(); // empty line for break

        // we can also create an array like this in one line:
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.print("This is my number-array: ");
        // for each loop
        for (int number: numbers) {
            System.out.print(number + ", ");
        }

        /** The enhanced for loop, or "for each loop"
         * Syntax:
         for(data_type variableName : myArray){
         //body of the loop
         }
         */

    }
}

