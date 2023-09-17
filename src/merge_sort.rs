//fix
pub fn  merge(arr: &mut Vec<i32>,ini: usize,mitad: usize,fin: usize){
    //create copies (left and right)
    let mut left: Vec<i32>=Vec::new();
    let mut right: Vec<i32>=Vec::new();
    for i in ini..mitad{left.push(arr[i]);}
    for j in mitad..fin{right.push(arr[j]);}
    let (mut a,mut b,mut k)=(0,0,ini);
    while a<left.len() && b<right.len(){
        if left[a]<right[b]{
            arr[k]=left[a];
            a+=1;
        }else if left[a]>=right[b]{
            arr[k]=left[b];
            b+=1; 
        }
        k+=1;
    }
    while a<left.len(){
        arr[k]=left[a];
        k+=1;
        a+=1;
    }
    while b<right.len(){
        arr[k]=right[b];
        k+=1;
        b+=1;
    }
}
pub fn merge_sort_algorithm(arr: &mut Vec<i32>,start: usize,end: usize){
    if start+1<end{
        let mid =start+(end-start)/2;
        merge_sort_algorithm(arr,start,mid);
        merge_sort_algorithm(arr,mid+1,end);            
        merge(arr,start,mid,end); //last task for every recursion!
    }
}
pub fn merge_sort(arr: &mut Vec<i32>){
    merge_sort_algorithm(arr, 0, arr.len());
}