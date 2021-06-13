package Do_it_yourself.Exercise_1;

//Do it yourself - Bài 1
public class Rectangle {
    private int with;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int with, int height) {
        this.with = with;
        this.height = height;
    }

    public int getWith() {
        return with;
    }

    public void setWith(int with) {
        this.with = with;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void display(){
        System.out.printf("Rectangle have with = %d ,height = %d", with,height);
    }

    public int calculatePerimeter(){
        int Perimeter = (with + height) *2;
        return Perimeter;
    }

    public static void main(String[] args) {
        //Do it yourself - Bài 1
        Rectangle test = new Rectangle(7,3);
        test.display();
        System.out.printf("\nPerimeter = %d ", test.calculatePerimeter());

    }
}
