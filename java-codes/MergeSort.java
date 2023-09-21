public class MergeSort {
    public static void merge_sort(int[] arr,int start,int end){
        if(start < end){
            int mid=start+(end-start)/2;
            merge_sort(arr, start, mid);
            merge_sort(arr, mid+1, end);
            merge(arr,start,end);
        }
    }
    public static void merge(int[] arr,int start,int end){
        int mid=start+(end-start)/2;
        int left[]=new int[mid-start+1];
        int rigth[]=new int[end-mid];
        for(int i=start;i<=mid;i++){
            left[i-start]=arr[i];
        }
        for(int j=mid;j<end;j++){
            rigth[j-mid]=arr[j+1];
        }
        int i=0,j=0; 
        while(i<left.length && j<rigth.length){
            if(left[i]<rigth[j]){
                arr[start]=left[i];
                i++;
            }else{
                arr[start]=rigth[j];
                j++;
            }
            start++;
        }
        while(i<left.length){
            arr[start++]=left[i++];
        }
        while(j<rigth.length){
            arr[start++]=rigth[j++];
        }
    }
    public static void main(String[] args) {
        int[] array={7,5,4,1,8,2,3,10,3,21,5,54,71,103,-1,-98,-54};
        int n=array.length;
        merge_sort(array,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}
