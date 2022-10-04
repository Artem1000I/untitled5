package Variant2;

public class MyArrayDataException extends Exception {
    public int i;
    public int j;

    MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;

    }

    public MyArrayDataException(String[][] arr) {
        super(String.format("Incorrect values in '%s'", arrToString(arr));
        this.arr = arr;
    }

    private static String arrToString(String[][] arr) {
        // write code here
    }
}
