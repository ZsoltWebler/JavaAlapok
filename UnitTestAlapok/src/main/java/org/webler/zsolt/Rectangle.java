package org.webler.zsolt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Rectangle {

    private double length = 0;
    private double width = 0;


    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public boolean isSquare() {
        return length == width;
    }

    public static Rectangle greater(Rectangle rec1, Rectangle rec2) {
        if (rec1.area() >= rec2.area())
            return rec1;
        else return rec2;
    }
}
