package exercise.task_07;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Napisz program imitujący operacje na pliku.
 *
 * Następnie napisz testy sprawdzające:
 * tworzenie pliku,
 * zapis,
 * odczyt,
 * czyszczenie pliku.
 * Wykorzystaj metody cyklu życia.
 */

public class FileOperations {

    private FileRepository fileRepository;
    private Path path;

    public FileOperations(FileRepository fileRepository, Path path) {
        this.fileRepository = fileRepository;
        this.path = path;
    }

    public void createFile() {
        fileRepository.createFile(path);
    }

    public void writeToFile(String newContent) {
        fileRepository.write(path, newContent);
    }

    public String readFromFile(){
        return fileRepository.read(path);
    }

    public static void main(String[] args) {
        FileRepository fileRepo = new FileRepository();
        Path path = Paths.get("src\\main\\java\\exercise\\task_07\\file");
        FileOperations fileOperations = new FileOperations(fileRepo, path);

        fileOperations.createFile();
    }
}
