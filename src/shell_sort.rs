pub fn shell_sort(arr: &mut Vec<i32>){
    let mut gap=arr.len();
    while gap>0{
        for i in gap..arr.len(){
            let temp=arr[i];
            let mut it=i;
            //this loop do the insertion
            while it>=gap && arr[it-gap]>arr[it]{
                arr.swap(it-gap, it);
                it-=gap;
            }
            //change the last element
            arr[it]=temp;
        }
        gap/=2;
    }
}