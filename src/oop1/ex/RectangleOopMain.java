package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 8;
        rectangle.height = 8;

        int area = rectangle.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter =  rectangle.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean isSquare = rectangle.isSquare();
        if(isSquare){
            System.out.println("정사각형 여부: 참");
        } else {
            System.out.println("정사각형 여부: 거짓");
        }
    }

}
