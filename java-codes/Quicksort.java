public class Quicksort{
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int particion(int[] arr,int ini,int fin){
        int key=arr[fin],idx=ini;
        for(int i=ini;i<fin;i++){
            if(key>arr[i]){
                swap(arr, i, idx);
                idx++;
            }
        }
        swap(arr,fin,idx);
        return idx;
    }
    public static void quicksort(int[] arr,int ini,int fin){
        if(ini<fin){
            int mid=particion(arr,ini,fin);
            quicksort(arr,ini,mid-1);
            quicksort(arr,mid+1,fin);
        }
    }
    public static void main(String[] args) {
        int[] array={7,5,4,1,8,2,3,10,3,21,5,54,71,103,-1,-98,-54};
        int n=array.length;
        quicksort(array,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}