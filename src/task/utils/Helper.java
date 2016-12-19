package task.utils;

public class Helper {
    public static String getHelp() {
        return "Нужно указать имя файла источника и имя файла для конвертации." +
                "\nИмена файлов записывать через пробел в порядке:" +
                "\nИмя файла источника" +
                "\nИмя файла для конвертации\n" +
                "\nПример:" +
                "\njava -jar FileEncodingConverter.jar resources/encoding.txt resources/converted-test.txt";
    }
}
