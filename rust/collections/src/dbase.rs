use std::collections::HashMap;
use std::io;

fn main() {
    let mut dbase: HashMap<String, Vec<String>> = HashMap::new();
    read_input(&mut dbase);
    show(dbase);
}

fn show(dbase: HashMap<String, Vec<String>>) {
    for (dept, value) in &dbase {
        let people = value
            .iter()
            .map(|p| p.to_string() + ",")
            .collect::<String>();
        println!("{}: {}", dept, people);
    }
}

fn read_input(dbase: &mut HashMap<String, Vec<String>>) {
    let mut proceed = true;

    println!("Enter data, type quit to stop.");
    let mut buffer = Default::default();
    while proceed == true {
        io::stdin().read_line(&mut buffer).expect("Input error.");
        let line = buffer.trim_end();
        if line == "quit" {
            proceed = false
        } else {
            let result = parse(&line.to_string());
            if dbase.get(&result.1).is_none() {
                let mut p = Vec::<String>::new();
                p.push(result.0);
                dbase.insert(result.1, p);
            } else {
                let p: &mut Vec<String> = dbase.get_mut(&result.1).unwrap();
                p.push(result.0);
            }
        }
        buffer.clear();
    }
}

fn parse(line: &String) -> (String, String) {
    let tokens: Vec<&str> = line.split(" ").collect();
    let mut result: (String, String) = ("".to_string(), "".to_string());

    if tokens.len() > 3 {
        result = (tokens[1].to_string(), tokens[3].to_string());
    }

    return result;
}
