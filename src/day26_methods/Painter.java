package day26_methods;

public class Painter {

    public static void main(String[] args) {
        Picture.draw();
        Picture.draw(25);
        Picture.draw("black","white");

        int num = 6;
        String str = "Test";
        Picture.draw(str,num);// another way to use value

    }
}
