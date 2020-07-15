package com.company;

public class Algorithm {
    /*
    * Write data to file
    * @param a: Input array float number
    * */
    public static void writeNumberToFile(float a[]) {

    }
    /*
    * Read data from file and return array number
    * @param a: Input array float number
    * @param size
    * */
    public static int[] readNumberInFile(float a[], int size) {

    }

    /*
    * Bubble Sort Algorithm
    * @param a: Input array float number
    * */
    public static void bubbleSort(float a[]) {
        // flag to check swapped between 2 item in array
        boolean swapped;

        for (int i = 0; i < a.length - 1 ; i++) {
            swapped = false;
            for (int j = 0; j < a.length - i - 1 ; j++) {
                if (a[j] > a[j+1]) {
                    // swap a[j] and a[j+1]
                    float tempNumber = a[j];
                    a[i] = a[j+1];
                    a[j+1] = tempNumber;
                    swapped = true;
                }
            }
            // Check flag swapped is false we will break the loop to save time
            if (swapped == false) {
                break;
            }
        }
    }
    /*
    * Selection Sort Algorithm
    * @param a: Input array float number
    * */
    public static void selectionSort(float a[]) {
        // One by one move index of item in unsorted array
        for (int i = 0; i < a.length -1; i++) {
            int minIndex = i;
            for (int j = i+1; j < a.length ; j++) {
                // Find minimum item in unsorted array
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }

                // Swap found minimum item with first item
                float tempNumber = a[minIndex];
                a[minIndex] = a[i];
                a[i] = tempNumber;
            }
        }

    }

    /*
    * Insertion Sort Algorithm
    * @param a: Input array float number
    * */
    public static void insertionSort(float a[]) {
        int holePosition;
        float valueToInsert;

        for (int i = 1; i < a.length; i++) {
            //select value to be inserted
            valueToInsert = a[i];
            holePosition = i;

            // locate hole position
            while (holePosition > 0 && a[holePosition - 1] > valueToInsert) {
                a[holePosition] = a[holePosition -1];
                holePosition = holePosition - 1;
            }

            a[holePosition] = valueToInsert;
        }
    }

    /*
    * Linear Search Algorithm
    * @param a: Input array float number
    * @param value:
    *  */
    public static void linearSearch(float a[], float value) {

    }

    public static void binarySearch(float a[], int l, int r, float x) {

    }


}
