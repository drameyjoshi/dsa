use rand::Rng;
use std::collections::HashMap;
use std::io;

fn main() {
    let mut v = Vec::<i32>::new();

    let n = get_size();
    populate(&mut v, n);

    println!("The original vector is:");
    print(&v);
    println!("Median is {}.", median(&mut v));
    println!("The sorted vector is:");
    print(&v);
    println!("Mode is {}.", mode(&v));
}

fn get_size() -> u32 {
    println!("Enter size of the vector: ");
    let mut size = String::new();
    io::stdin()
        .read_line(&mut size)
        .expect("Failed to read input.");
    let n: u32 = match size.trim().parse() {
        Ok(num) => num,
        Err(_) => 10,
    };
    print!("\n");

    n
}

fn populate(v: &mut Vec<i32>, n: u32) {
    for _ in 0..n {
        v.push(rand::thread_rng().gen_range(1..=20));
    }
}

fn median(v: &mut Vec<i32>) -> f32 {
    v.sort();
    let l = v.len();
    if l % 2 == 0 {
        (v[l / 2] + v[l / 2 - 1]) as f32 / 2.0
    } else {
        v[(l - 1) / 2] as f32 * 1.0
    }
}

fn mode(v: &Vec<i32>) -> i32 {
    let mut freq = HashMap::<i32, i32>::new();

    for n in v {
        let count = freq.entry(*n).or_insert(0);
        *count += 1;
    }

    let mut maxf = -1;
    let mut maxv = 0;
    for (key, value) in freq {
        if value > maxf {
            maxf = value;
            maxv = key;
        }
    }

    maxv
}

fn print(v: &Vec<i32>) {
    let mut first = true;
    for n in v {
        if first {
            print!("{:?}", n);
            first = false;
        } else {
            print!(", {:?}", n);
        }
    }
    print!("\n");
}
