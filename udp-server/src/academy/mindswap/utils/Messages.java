package academy.mindswap.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Messages {

    public static String readFile() throws IOException {

        List<String> inspirationalQuotes = Files.readAllLines(Paths.get("resources/inspirationalDB.txt"));

        return inspirationalQuotes.get(RandomGenerator.generateRandom(inspirationalQuotes.size()-1));
    }
}
