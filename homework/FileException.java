public class FileException extends FileNotFoundException{
    public FileException() {
        super();
    }
    
    public FileException(String msg) {
        super(msg);
    }
}