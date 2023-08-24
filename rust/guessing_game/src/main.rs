use rand::Rng;
use std::cmp::Ordering;
use std::io;

fn main() {
    println!("Guess the number!");

    let secret_number = rand::thread_rng().gen_range(1..=100);

    println!("Please input your guess.");

    let expected = 100_f32.log2().ceil() as u32;
    let mut round = 0;

    loop {
        let mut guess_str = String::new();
        io::stdin()
            .read_line(&mut guess_str)
            .expect("Failed to read line.");
        println!("You entered {guess_str}.");

        let guess: u32 = match guess_str.trim().parse() {
            Ok(num) => num,
            Err(_) => continue,
        };

        match guess.cmp(&secret_number) {
            Ordering::Less => println!("Too small!"),
            Ordering::Greater => println!("Too big!"),
            Ordering::Equal => {
                println!("You win!");
                break;
            }
        }

        round += 1
    };

    println!("You took {round} rounds.");

    if round < expected {
        println!("You guessed well.");
    } else {
        println!("You could have done better.");
    }
}
