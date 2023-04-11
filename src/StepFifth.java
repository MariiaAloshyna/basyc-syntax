import java.util.Arrays;
public class StepFifth {
    public static void main(String[] args) {

        //Task1  (calculate average value of given array)
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 0;
        for (int i : array1) {
            sum = sum + i;
        };
        int average = sum / array1.length;
        System.out.println(average);


        //Task2 (merge 2 given arrays)
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {3, 5, 6, 8, 9, 10};
        int[] mergedArr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            mergedArr[i] = arr1[i];
        };
        for (int i = 0; i < arr2.length; i++) {
            mergedArr[arr1.length + i] = arr2[i];
        };
        System.out.println(Arrays.toString(mergedArr));


        //Task3
        int[] array3 = {1, 3, 5, 7, 23, 78, 3, 5, 66};
        int biggestNumber = array3[0];
        for (int i : array3) {
            if (i > biggestNumber) {
                biggestNumber = i;
            } ;
        };
        System.out.println(biggestNumber);

        //Task4 (sorting array from task2 in asc way)
        int l = mergedArr.length;

        // Perform bubble sort
        for (int i = 0; i < l-1; i++) {
            for (int k = 0; k < l-i-1; k++) {
                if (mergedArr[k] > mergedArr[k+1]) {
                    int temp = mergedArr[k];
                    mergedArr[k] = mergedArr[k+1];
                    mergedArr[k+1] = temp;
                }
            }
        };
        System.out.println(Arrays.toString(mergedArr));
    }
}

