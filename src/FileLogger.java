import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLogger {
    private final String PATH = "C:\\Users\\student\\Desktop\\Vavilova\\iElenV\\logs_{date}.txt";


    public void Log(String msg) {
        try (FileWriter writer = new FileWriter(PATH,true)) {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/d");
            Date date = new Date();
            var currentDate = dateFormat.format(date);
            String message = String.format("[%s] %s", currentDate, msg);
           // String filename = String.format("%s_{%s}.txt", "logs",currentDate);
          //  String PATH1 = PATH + filename;
          //  File file = new File(PATH1);
            writer.write(message);
            writer.append('\n');
            writer.flush();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }



}
