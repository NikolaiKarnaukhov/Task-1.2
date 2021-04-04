package com.company;

public class Stack {

    private int arraySize;

    private int[] stackArray;

    public String arrayName;

    private int head;


    public Stack(int size, String name){
        this.arrayName = name;
        this.arraySize = size;
        stackArray = new int[size];
        head = -1;
    }

    //Реализация метода push()
    public void addValues(int value){
        head++;
        stackArray[head] = value;
    }

    //Реализация метода pop()
    public int deleteValue(){
        head--;
        return stackArray[head];
    }

    //Реализация метода peek()
    public int readHead(){
        return stackArray[head];
    }

    public boolean isEmpty(){
        return(head == -1);
    }

    public boolean isFull(){
        return (head == arraySize - 1);
    }

    public void showStack(){
        int i = head;

        System.out.print("Стэк " + arrayName + " : ");

        while(i != -1){
            System.out.print(stackArray[i]);
            System.out.print(" ");
            i--;
        }
        System.out.print("\n");
    }
}
