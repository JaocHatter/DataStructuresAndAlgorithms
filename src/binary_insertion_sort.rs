pub fn binary_insertion_sort(arr: &mut Vec<i32>) {
    for i in 1..arr.len() {
        let mut left = 0;
        let mut right = i;
        let mut j = i;
        //our task is find the firt number that greater than arr[i]
        while left<right {
            let mid=left+(right-left)/2;
            if arr[i]<arr[mid]{
                right=mid;
            }else{
                left=mid+1;
            }
        }
        //once we have found the number, we start insert
        while j>left{
            arr.swap(j,j-1);
            j-=1;
        }
    }
}


