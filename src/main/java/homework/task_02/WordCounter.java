package homework.task_02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * Dla podanego programu liczącego wystąpienia każdego słowa w pliku tekstowym napisz testy jednostkowe.
 *
 * Zmodyfikuj kod tak aby testy jednostkowe nie wykonywały operacji na plikach.
 */

public class WordCounter {

    public void saveWordStatistic(Path inputPath, Path outputFile) throws IOException {
        writeWordsFrequencyToFile(outputFile, collectWordFrequency(inputPath));
    }

    private void writeWordsFrequencyToFile(Path outputFile, Map<String, Long> wordFrequency) throws IOException {
        Files.write(outputFile, () -> wordFrequency.entrySet()
                .stream()
                .map(entrySet -> (CharSequence) (entrySet.getKey() + " " + entrySet.getValue()))
                .iterator());
    }

    private Map<String, Long> collectWordFrequency(Path inputPath) throws IOException {
        return Files.readAllLines(inputPath).stream()
                .map(line -> Arrays.asList(line.split("\\s+")))
                .flatMap(Collection::stream)
                .collect(groupingBy(identity(), counting()));
    }

    public static void main(String[] args) {
        System.out.println("Working directory " + System.getProperty("user.dir"));

        WordCounter wordCounter = new WordCounter();
        Path inputPath = Paths.get("src\\main\\java\\homework\\task_02\\words");
        Path outputFile = Paths.get("src\\main\\java\\homework\\task_02\\output");
        try {
            wordCounter.saveWordStatistic(inputPath, outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
