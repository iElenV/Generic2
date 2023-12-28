import java.io.FileOutputStream;

public class FileLogger {
    private final String PATH = "C:\\Users\\student\\Desktop\\Vavilova\\iElenV\\logs.txt";

    public void Log(String msg) {
        try (FileOutputStream fos = new FileOutputStream(PATH)) {
            byte[] buffer = msg.getBytes();
            fos.write (buffer, 0,buffer.length);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }



}
