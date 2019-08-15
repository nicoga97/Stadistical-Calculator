package edu.escuelaing.arep.Utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWrapper {

    /**
     * Read a file and parse a float for each line and return it on a linkedList.
     *
     * @param pathFile path of the file that contains the data from the root directory of this project
     * @return linkedList of real numbers read from the file
     * @throws IOException
     */
    public static LinkedList getDataFromFile(String pathFile) throws IOException {
        LinkedList data = new LinkedList();
        final Path path = Paths.get(Paths.get("").toAbsolutePath().toString(), pathFile);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toFile()))) {
            String val = "";
            while ((val = bufferedReader.readLine()) != null) {
                data.insert(Float.parseFloat(val));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }


}
