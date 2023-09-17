pub fn particion(arr: &mut Vec<i32>,start: usize,fin: usize) -> usize{
    let key=arr[fin];
    let mut idx=start;
    for i in start..fin{
        if arr[i]<key {
            arr.swap(i, idx);
            idx+=1;
        }
    }
    arr.swap(fin, idx);
    idx
}
pub fn quicksort(arr: &mut Vec<i32>,start: usize,fin: usize){
    if start>=fin {
        return;
    }
    let n:usize = particion(arr,start,fin);
    if n>0{
        quicksort(arr, start, n-1);
    }
    quicksort(arr, n+1 , fin);
    return;
}