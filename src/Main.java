public class Main {


    public static void checkArray(String[][] array) {

        if (array.length != 4) {
            throw new MyArraySizeException("Неверное количество строк: " + array.length);
        }


        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException(
                        "Неверная длина строки " + i + ": " + array[i].length);
            }
        }

        System.out.println("Массив 4x4, всё в порядке");
    }

    public static void main(String[] args) {
        String[][] correct = new String[4][4];
        String[][] wrongRows = new String[3][4];
        String[][] wrongColumns = new String[4][5];

        try {
            checkArray(correct);
            checkArray(wrongRows);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            checkArray(wrongColumns);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}