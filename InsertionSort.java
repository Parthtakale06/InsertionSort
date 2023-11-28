public class InsertionSort {
    public static void main(String[] args) {

        int arr[] = { 20, 40, 11, 19, 27, 45 };
        // for sorting the given array

        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j> 0 && (arr[j] < arr[j - 1])) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        // Printing Sorted Array
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t " +arr[i]);
        }
    }

}
