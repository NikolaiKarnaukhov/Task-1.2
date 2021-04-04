package com.company;

public class Main {

    public static void main(String[] args) {

        //Инициализируем первый стэк
        Stack stackOne = new Stack(10, "First");

        //Добавляем значения в стэк; метод push()
        stackOne.addValues(19);
        stackOne.addValues(29);
        stackOne.addValues(39);

        //Удаляем значение; метод pop()
        stackOne.deleteValue();

        // Метод вывода стэка
        stackOne.showStack();

        //Читаем элемент стэка, без удаления; метод peek()
        System.out.print(stackOne.readHead() + "\n");

        //Инициализируем второй стэк
        Stack stackTwo = new Stack(10, "Second");

        stackTwo.addValues(17);
        stackTwo.addValues(27);
        stackTwo.addValues(37);
        stackTwo.addValues(47);

        stackTwo.showStack();
    }

}
