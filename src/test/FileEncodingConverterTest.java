package test;

import org.junit.Test;
import task.FileEncodingConverter;
import task.exception.NoArgumentsWithNameFile;

import java.io.*;

import static org.junit.Assert.*;

public class FileEncodingConverterTest {

    @Test
    public void mainTest() throws IOException, NoArgumentsWithNameFile {
        String[] args = new String[2];
        args[0] = "src/resources/source-test.txt";
        args[1] = "src/resources/result-test.txt";
        String expectationName = "src/resources/expectation-test.txt";
        FileEncodingConverter.main(args);

        BufferedReader result = new BufferedReader(new InputStreamReader(new FileInputStream(args[1]), "cp1251"));
        BufferedReader expectation = new BufferedReader(new InputStreamReader(new FileInputStream(expectationName), "cp1251"));

        String lineResult;
        String lineExpectation;

        while (((lineResult = result.readLine()) != null) && ((lineExpectation = expectation.readLine()) != null)) {
            assertEquals(lineResult, lineExpectation);
        }
    }
}