package task.utils;

import java.io.*;

public class FileUtils {
    private FileUtils() {
    }

    public static void convertEncoding(InputStream in, OutputStream out, String oldEncoding, String newEncoding)
            throws UnsupportedEncodingException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(in, oldEncoding));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out, newEncoding));

        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line);
            writer.newLine();
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}