public class Heapsort {
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void heap_sort(int[] arr){
        int n=arr.length;
        if(n<=1) return;
        for(int i=n/2-1;i>=0;i--) heapify(arr, n, i);
        for(int i=n-1;i>=0;i--){
            swap(arr,0,i);
            //change i per n , the reason?
            //we dont want evaluate a sorted number
            heapify(arr, i, 0);
        }
    }
    public static void heapify(int[] arr,int len,int idx){
        int largest=idx;
        //their sons
        int left=2*idx+1,right=2*idx+2;
        if(left<len && arr[left]>arr[largest]) largest=left;
        if(right<len && arr[right]>arr[largest]) largest=right;
        if(largest!=idx){
            swap(arr,idx,largest);
            heapify(arr, len, largest);
        }
    }
}
