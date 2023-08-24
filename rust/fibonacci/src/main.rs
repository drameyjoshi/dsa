use std::io;

fn main() {
   let n = get_response("Enter a small non-negative integer.");
   println!("fib({n}) = {}.", fib(n));
}

fn get_response(question: &str) -> i16 {
    println!("{}", question);
    let mut ans = String::new();
    io::stdin().read_line(&mut ans).expect("Failed to read input.");
    let n: i16 = match ans.trim().parse() {
        Ok(num) => num,
        Err(_) => 0,
    };

    n
}

fn fib(n: i16) -> i64 {
    if n == 0 || n == 1 {
        1
    } else {
        fib(n - 1) + fib(n - 2)
    }
}

