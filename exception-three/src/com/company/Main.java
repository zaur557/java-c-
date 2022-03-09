package com.company;

public class Main {

    public static void main(String[] args) {
        int arr[] = {7,96,38};//комент
        try {
            System.out.println(arr[3]);//комент
            int x = 100/  0;

        }catch(ArithmeticException e) {
            System.out.println("Error" + e);
        }catch(Exception e) {
            System.out.println("Error" + e);

        }
    }
}





// В блоке try мы пытаемся выполнить какой-либо код
// В нашем случае выполняем деление,
// хотя также можно прописать открытие файлов, создание объекта на основе класса и так далее
// Указываем класс с ошибкой
// Поскольку мы выполняли математические действия, то класс с ошибкой ArithmeticException

// Выводим текст с ошибкой