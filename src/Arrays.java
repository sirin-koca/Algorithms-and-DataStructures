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

        //traversing array
        for(int i=0; i<a.length; i++) //length is the property of array
            System.out.println(a[i]);

        // we can also create an array like this:
        int[] numbers = {3, 9, 5, -5, 0, 1, 9, 123};

        // for each loop
        for (int number: numbers) {
            System.out.println(number);
        }

    }
}

