pub fn bubble_sort(arr: &mut Vec<i32>){
    let len=arr.len();
    let mut swapped;
    for i in 0..len{
        swapped=false;
        for j in 0..len-i-1{
            if arr[j+1]<arr[j]{
                arr.swap(j, j+1);
                swapped=true;
            }
        }
        if !swapped { //is in order
            break;
        }
    }
}
/*pub fn input_i32() -> i32 {
    let mut input = String::new();
    
    io::stdin().read_line(&mut input).expect("Failed to read line");
    
    match input.trim().parse::<i32>() {
        Ok(number) => number,
        Err(_) => {
            println!("Invalid input, please enter a valid integer.");
            input_i32() // Recursive call to try again
        }
    }
}*/

