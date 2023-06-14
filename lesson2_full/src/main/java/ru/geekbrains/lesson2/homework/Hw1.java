package ru.geekbrains.lesson2.homework;

import java.util.Random;
import java.util.Scanner;

public class Hw1 {

    private static final Random random = new Random();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] randArr = createArray(n);
        printArray(randArr);
        heapSort(randArr);
        System.out.println("HeapSort");
        printArray(randArr);
    }

    /**
     * @apiNote пирамидальная сортировка (сортировка кучей)
     * @param arr массив данных
     */
    private static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n/2 - 1; i >= 0 ; i--) {
            heapify(arr, i, n);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    /**
     * @apiNote преобразование массива в кучу
     * @param arr массив
     * @param rootIndex корневой индекс
     * @param heapSize размер кучи
     */
    private static void heapify(int[] arr, int rootIndex, int heapSize) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if(leftChild < heapSize && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        if(rightChild < heapSize && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        if(rootIndex != largest) {
            int temp = arr[rootIndex];
            arr[rootIndex] = arr[largest];
            arr[largest] = temp;

            heapify(arr, largest, heapSize);
        }

    }

    /**
     * @apiNote отображение массива на экране
     * @param arr массив
     */
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

    /**
     * @apiNote Создание массива из рандомных чисел до 100
     * @param n размер массива
     * @return массив чисел до 100
     */
    private static int[] createArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
