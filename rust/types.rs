use std::any::type_name;

fn type_of<T>(_: T) -> &'static str {
    type_name::<T>()
}

fn main() {
    let s1 = "hello";
    let s2 = String::new();
    let s3 = String::from("oof");

    println!("Type of &s1 is {}", type_of(&s1));
    println!("Type of s1 is {}", type_of(s1));
    println!("Type of &s2 is {}", type_of(&s2));
    println!("Type of s2 is {}", type_of(s2));
    println!("Type of s3 is {}", type_of(s3));
}

