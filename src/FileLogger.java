import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLogger {
    private final String PATH = "C:\\Users\\student\\Desktop\\Vavilova\\iElenV\\logs.txt";

    public void Log(String msg) {
        try (FileWriter writer = new FileWriter(PATH,true)) {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/d HH:mm:ss");
            Date date = new Date();
            var currentDate = dateFormat.format(date);
            String message = String.format("[%s] %s", currentDate, msg);
            writer.write(message);
            writer.append('\n');
            writer.flush();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }



}
