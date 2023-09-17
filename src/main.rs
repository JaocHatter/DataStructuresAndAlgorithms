mod bubble_sort;
mod quicksort;
mod insertion_sort;
mod binary_insertion_sort;
mod shell_sort;
mod merge_sort;
fn print_it(cpy: &mut Vec<i32>){
    for i in cpy{
        print!("{} ",i);
    }
}
fn main(){
    println!("Hello there\n");
    let numbers:Vec<i32> = vec![9,2,1,6,4,3,5,6];
    println!("Before Sort");
    for i in 0..8{
        print!("{} ",numbers[i]);
    }
    println!();
    let mut cpy1=numbers.clone();
    println!("After bubblesort");
    bubble_sort::bubble_sort(&mut cpy1);
    print_it(&mut cpy1);
    let mut cpy2: Vec<i32>=numbers.clone();
    println!("\nAfter Quicksort");
    quicksort::quicksort(&mut cpy2,0,7);
    print_it(&mut cpy2);
    println!("\nAfter Insertionsort");
    let mut cpy3=numbers.clone();
    insertion_sort::insertion_sort(&mut cpy3);
    print_it(&mut cpy3);
    println!("\nAfter Binary InsertionSort");
    let mut cpy4=numbers.clone();
    binary_insertion_sort::binary_insertion_sort(&mut cpy4);
    print_it(&mut cpy4);
    println!("\nAfter ShellSort");
    let mut cpy5=numbers.clone();
    shell_sort::shell_sort(&mut cpy5);
    print_it(&mut cpy5);
    println!("\nAfter MergeSort");
    let mut cpy6=numbers.clone();
    merge_sort::merge_sort(&mut cpy6);
    print_it(&mut cpy6);
}