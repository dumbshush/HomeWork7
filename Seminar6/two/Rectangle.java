/*
 * В этом примере, чтобы добавить поддержку других фигур, придется изменять класс AreaCalculator. 
 * Это нарушает OCP, так как класс не открыт для расширения и закрыт для изменения.
 */

package Seminar6.two;

interface AreaCalculator {
    public double calculateArea();
}

class Rectangle implements AreaCalculator {
    public double width;
    public double height;
    
    public double calculateArea() {
        return width + height;
    }
}
