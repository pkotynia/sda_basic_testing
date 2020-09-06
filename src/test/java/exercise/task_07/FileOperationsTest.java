package exercise.task_07;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

class FileOperationsTest {

    @Test
    void shouldCreateFile() {
        //given
        FileRepository fileRepositoryMock = Mockito.mock(FileRepository.class);
        Path path = Paths.get("test");
        FileOperations fileOperations = new FileOperations(fileRepositoryMock, path);

        //when
        fileOperations.createFile();

        //then
        Mockito.verify(fileRepositoryMock, Mockito.times(1))
                .createFile(path);
    }

    @Test
    void shouldWriteToFile() {
        //given
        FileRepository fileRepositoryMock = Mockito.mock(FileRepository.class);
        Path path = Paths.get("test");
        FileOperations fileOperations = new FileOperations(fileRepositoryMock, path);
        String content = "test string";

        //when
        fileOperations.writeToFile(content);

        //then
        Mockito.verify(fileRepositoryMock).write(path, content);
    }

    @Test
    void shouldReadFromFile() {
        //given
        FileRepository fileRepositoryMock = Mockito.mock(FileRepository.class);
        Path path = Paths.get("test");
        FileOperations fileOperations = new FileOperations(fileRepositoryMock, path);
        String content = "test string";
        //record Behavior of tests
        Mockito.when(fileRepositoryMock.read(path)).thenReturn(content);

        //when
        String result = fileOperations.readFromFile();

        //then
        assertThat(result).isEqualTo(content);
    }

}