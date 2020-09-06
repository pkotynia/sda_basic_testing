package exercise.task_07;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileRepository {

    void createFile(Path filePatch) {
        try {
            Files.createFile(filePatch);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void write(Path filePath, String content) {
        try {
            Files.write(filePath, content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String read(Path path) {
        try {
            return new String(Files.readAllBytes(path));
        } catch (IOException e) {
            e.printStackTrace();
            return " ";
        }
    }
}
