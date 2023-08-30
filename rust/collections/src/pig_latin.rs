use std::io;

fn main() {
    let mut buffer = String::new();
    let mut proceed = true;
    while proceed {
        println!("Enter a string. Enter q to quit.");
        io::stdin()
            .read_line(&mut buffer)
            .expect("Failed to read input");
        let trimmed = buffer.trim_end();
        if trimmed == "q" {
            proceed = false;
        } else {
            let pl = convert(trimmed);
            println!("{}", pl);
        }

        buffer.clear();
    }
}

fn convert(word: &str) -> String {
    let s = &word[0..1];
    if s == "a" || s == "e" || s == "i" || s == "o" || s == "u" {
        return format!("{}{}", word, "hay").to_string();
    } else {
        return format!("{}{}{}", &word[1..], s, "ay").to_string();
    }
}
