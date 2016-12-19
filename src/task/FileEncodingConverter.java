package task;

import task.exception.NoArgumentsWithNameFile;
import task.utils.FileUtils;

import java.io.*;

import static task.utils.Helper.getHelp;

public class FileEncodingConverter {

    public static void main(String[] args) throws IOException, NoArgumentsWithNameFile {
        if (args == null || args.length < 2) {
            System.out.println(getHelp());
            throw new NoArgumentsWithNameFile("Не указаны имена файлов.");
        }
        String sourceFileName = args[0];
        String convertedFileName = args[1];

        InputStream in = null;
        OutputStream out = null;

        try {
            in = new FileInputStream(sourceFileName);
            out = new FileOutputStream(convertedFileName);

            FileUtils.convertEncoding(in, out, "UTF16", "cp1251");
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
            System.out.println(getHelp());
        }
        catch (UnsupportedEncodingException e) {
            System.out.println("Не поддерживаемая кодировка.");
            System.out.println(getHelp());
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println(getHelp());
        }
        finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.flush();
                out.close();
            }
        }

    }
}