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

    public static int sumArray(String[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            "Неверные данные в ячейке [" + i + "][" + j + "]: \"" + array[i][j] + "\"");
                }
            }
        }
        return sum;
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
        String[][] correctType = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] wrongData = {
                {"1", "2", "3", "4"},
                {"5", "abc", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            sumArray(wrongData);
        } catch (MyArrayDataException e) { System.out.println("Ошибка: " + e.getMessage()); }
        try {
            System.out.println("Сумма: " + sumArray(correctType));
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}