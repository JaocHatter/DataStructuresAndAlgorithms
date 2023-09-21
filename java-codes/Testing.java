import java.util.Random;
public class Testing {
    public static void main(String[] args) {
        Random rand=new Random();
        int[] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=rand.nextInt(20);
        }
        System.out.println("Antes del ordenamiento:");
        print_arr(arr);
        int[] cpy1=new int[10];
        int[] cpy2=new int[10];
        int[] cpy3=new int[10];
        System.arraycopy(arr, 0,cpy1, 0,arr.length);
        System.arraycopy(arr, 0,cpy2, 0,arr.length);
        System.arraycopy(arr, 0, cpy3, 0, arr.length);
        System.out.println("\nOrdenamiento QUICKSORT");
        Quicksort.quicksort(cpy1,0,arr.length-1);
        print_arr(cpy1);
        System.out.println("\nOrdenamiento MERGESORT");
        MergeSort.merge_sort(cpy2,0,arr.length-1);
        print_arr(cpy2);
        System.out.println("\nOrdenamiento Heapsort");
        Heapsort.heap_sort(cpy3);
        print_arr(cpy3);
    }
    public static void print_arr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.printf("%d ",arr[i]);
        }
    }   
}
