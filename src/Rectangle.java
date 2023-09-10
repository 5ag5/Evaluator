public class Rectangle implements Shape {


    public Rectangle(){
        draw();
    }
    @Override
    public void draw() {
        System.out.println("The shape rectangle is being drawn.");
    }
}
