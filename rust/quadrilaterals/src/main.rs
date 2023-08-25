#[derive(Debug)]
struct Quadrilateral {
    width: u32,
    height: u32,
    perpendicular: bool, // Are the two sides perpendicular?
    small_angle: u32 // Acute or right angle between sides.
}

impl Quadrilateral {
    fn area(&self) -> u32 {
        self.width * self.height
    }

    fn square(size: u32) -> Self {
        Self {
            width: size,
            height: size,
            perpendicular: true,
            small_angle: 90,
        }
    }

    fn rectangle(height: u32, width: u32) -> Self {
        Self {
            height,
            width,
            perpendicular: true,
            small_angle: 90,
        }
    }

    fn quad(height: u32, width: u32, small_angle: u32) -> Self {
        Self {
            height,
            width,
            perpendicular: false,
            small_angle,
        }
    }

    fn to_string(&self) -> String {
        if self.perpendicular {
            if self.width == self.height {
                let s = format!("Sq [side {0}]", self.width);
                s.to_string()
            } else {
                let s = format!("Rect [height {0} width {1}]", 
                                self.height, 
                                self.width);
                s.to_string()
            }
        } else {
            let s = format!("Quad [side1 {0} side2 {1} angle {2}]", 
                            self.height, 
                            self.width,
                            self.small_angle);
            s.to_string()
        }
    }
}

fn main() {
    let square = Quadrilateral::square(2);
    let rect = Quadrilateral::rectangle(2, 3);
    let quad = Quadrilateral::quad(3, 4, 45);

    println!("Area of {} is {}.", square.to_string(), square.area());
    println!("Area of {} is {}.", rect.to_string(), rect.area());
    println!("Area of {} is {}.", quad.to_string(), quad.area());
}

