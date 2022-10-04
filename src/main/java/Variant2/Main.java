package Variant2;



/*Получил method, который принимает two dimensional String array в качестве параметра, size из array должен быть 4x4,
затем method() проверьте, если size неверно, method() throw new MyArraySizeException(arr), после method() должны суммироваться
 все элементы array, и если в array ячейка не содержит {{X13} }
 значение method() должно throw MyArrayDataException - с детализацией, в которой ячейка содержит неверные значения.*/
public class Main {
    private static final int COLUMNS = 4;
    private static final int ROWS = 4;

    private static int convertString(String[][] arr){
        int result = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr.length != 4 || arr[i].length != 4){
                    try {
                        throw new MyArraySizeException(arr);
                    } catch (MyArraySizeException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i][j].matches("[0-9]+")) {
                    result += Integer.parseInt(arr[i][j]);
                }else {
                    throw new MyArrayDataException(arr);
                }
            }
        }

        return result;
    }
}
