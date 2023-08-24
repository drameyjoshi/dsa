use std::io;

fn main() {
    let src_unit = get_response("What is the unit you have? [C/F/K]");
    let dest_unit = get_response("What is the unit you want? [C/F/K]");
    let init_temp = get_response("Enter the temperature:");
    let init_temp: f32 = match init_temp.trim().parse() {
        Ok(num) => num,
        Err(_) => 0.0,
    };

    let conv_temp = convert(src_unit.trim(), dest_unit.trim(), init_temp);

    println!(
        "{init_temp} {} = {conv_temp} {}",
        src_unit,
        dest_unit.trim()
    );
}

fn get_response(question: &str) -> String {
    println!("{}", question);
    let mut ans = String::new();
    io::stdin()
        .read_line(&mut ans)
        .expect("Failed to read input.");

    ans.trim().to_string()
}

fn convert(src_unit: &str, dest_unit: &str, value: f32) -> f32 {
    match src_unit {
        "C" => match dest_unit {
            "F" => convert_c2f(value),
            "K" => convert_c2k(value),
            _ => value,
        },
        "F" => match dest_unit {
            "C" => convert_f2c(value),
            "K" => convert_f2k(value),
            _ => value,
        },
        "K" => match dest_unit {
            "C" => convert_k2c(value),
            "F" => convert_k2f(value),
            _ => value,
        },
        _ => value,
    }
}

fn convert_f2c(value: f32) -> f32 {
    (value - 32.0) * 5.0 / 9.0
}

fn convert_c2f(value: f32) -> f32 {
    9.0 * value / 5.0 + 32.0
}

fn convert_f2k(value: f32) -> f32 {
    convert_c2k(value) + 273.0
}

fn convert_c2k(value: f32) -> f32 {
    value + 273.0
}

fn convert_k2c(value: f32) -> f32 {
    value - 273.0
}

fn convert_k2f(value: f32) -> f32 {
    convert_c2f(value - 273.0)
}
