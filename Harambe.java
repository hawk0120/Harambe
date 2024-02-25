import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Harambe {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Harambe <app_name>");
            System.exit(1);
        }

        String appName = args[0];
        createMonkeyCApp(appName);
    }
    
    public static void createMonkeyCApp(String appName) {
        // Define the directory structure
        File appDir = new File(appName);
        File monkeyCDir = new File(appDir, "src" + File.separator + "c");
        File resourcesDir = new File(appDir, "resources");

        // Create directories
        appDir.mkdirs();
        monkeyCDir.mkdirs();
        resourcesDir.mkdirs();

        // Create basic files
        File monkeyCFile = new File(monkeyCDir, appName + "_app.c");
        File appinfoJsonFile = new File(appDir, "appinfo.json");

        // Write content to files
        String monkeyCContent = "#include <pebble.h>\n\nint main() {\n    // Your Monkey C code here\n}\n";
        String appinfoJsonContent = "{\n    \"appKeys\": {},\n    \"resources\": {}\n}\n";

        try {
            FileWriter monkeyCWriter = new FileWriter(monkeyCFile);
            monkeyCWriter.write(monkeyCContent);
            monkeyCWriter.close();

            FileWriter appinfoJsonWriter = new FileWriter(appinfoJsonFile);
            appinfoJsonWriter.write(appinfoJsonContent);
            appinfoJsonWriter.close();

            System.out.println("Monkey C app '" + appName + "' has been created successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

