package practice;


//what is array?
// array is cantainer object that holds fixed number of values of same data type.
public class Arrays {

    static void main(String[] args) {

        int a[];
        int[] j = new int[10]; //array size initalization
        j[0] = 1;
        j[1] = 2;
        j[2] = 3;
        j[3] = 4;

        System.out.println(j[2]); //print value of 3rd index

        for(int i =0; i<j.length; i++) {
            System.out.println(j[i]);

        }
// for loop
        int[] arr = {1,2,3,4,5};
        for(int c =0; c<arr.length; c++) {
            System.out.println(arr[c]);
        }

        //for each  //increment order only
        for(int b:arr) {
            System.out.println(b);
        }


        //arrayindexoutofboundsException

    }
}
