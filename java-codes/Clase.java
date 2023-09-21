public class Clase {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    public static void shellSort(int[] arr) {
        int n = arr.length;
        // Start with a large gap and reduce it
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Perform insertion sort on elements gapped by 'gap'
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }
        public static void main(String[] args) {
            int[] arr = {12, 34, 54, 2, 3};
            shellSort(arr);
            System.out.println("Sorted array after Shell Sort:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            int[] x = {12, 9, 4, 99, 120, 1, 3, 10};
            int n = x.length;
            quickSort(x, 0, n - 1);
            System.out.println("\nSorted array after Quicksort:");
            for (int num : x) {
                System.out.print(num + " ");
            }
        }
    }

