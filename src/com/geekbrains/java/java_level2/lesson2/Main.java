package com.geekbrains.java.java_level2.lesson2;

public class Main {
    public static void main(String[] args) {
        String write = "1 3 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 0";
        String not4x4 = "13 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 0";
        String notNumber = "1 a 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 0";

        String[][] stringsArray = convertStringToArray(write);
        System.out.println(calculate(stringsArray));
    }

    static String[][] convertStringToArray(String write) {
        String newWrite = write + "\n";
        int length = newWrite.split("\n").length;
        String[][] numbersArray = new String[length][length];
        String[] line = newWrite.split("\n");

        for (int i = 0, j = 0; i < newWrite.length(); i++) {
            if (newWrite.charAt(i) == ' ') j++;
            if (newWrite.charAt(i) == '\n') {
                if (j == 3) j = 0;
                else throw new MyException("размер матрицы, полученной из строки, не равен 4x4");
            }
        }


        for (int i = 0; i < length; i++) {
            String[] g = line[i].split(" ");
            for (int j = 0; j < length; j++) {
                numbersArray[i][j] = g[j];
            }
        }

        return numbersArray;
    }

    static double calculate(String[][] stringsArray) {
        int sum = 0;

        for (String[] sum1 : stringsArray) {
            for (String sum2 : sum1) {
                try {
                    sum = sum + Integer.parseInt(sum2);
                } catch (NumberFormatException e) {
                    System.out.println("в одной из ячеек полученной матрицы не число");
                    e.printStackTrace();
                    System.exit(1);
                }
          }
        }

        return sum / 2;
   }
}





