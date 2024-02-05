public class ImageProxy implements IImage {
    private String fileName;
    private Image img;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (img == null) {
            img = new Image(fileName);
        }
        img.display();
    }
}
