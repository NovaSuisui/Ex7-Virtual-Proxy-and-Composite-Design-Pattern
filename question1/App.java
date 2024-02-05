public class App {
    public static void main(String[] args) {
        IImage myImage = new ImageProxy("test.jpg");
        //do something
        myImage.display();        
    }
}
