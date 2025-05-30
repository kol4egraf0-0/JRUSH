/*
 * public class zd {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
        System.out.println(reader);
    }
}
 * public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes type) {
        if(type == null){
            throw new IllegalArgumentException("тип картинки говна");
        }
        ImageReader reader = switch (type) {
            case BMP -> new BmpReader();
            case PNG -> new PngReader();
            case JPG -> new JpgReader();
        };
        return reader;
    }
}
public class JpgReader implements ImageReader{
}
public class PngReader implements ImageReader{
}
public class PngReader implements ImageReader{
}
public interface ImageReader {
}
public enum ImageTypes {
    BMP,
    JPG,
    PNG
}

 */