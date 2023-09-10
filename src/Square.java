public class Square implements Shape{

    public Square(){
        draw();
    }
    @Override
    public void draw() {
        System.out.println("The shape square is being drawn.");
    }
}
