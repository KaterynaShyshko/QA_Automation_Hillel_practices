package lesson10;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class FilesClass {
        //BufferedReader
        //Scanner
        //FileUtils
        //Files

        public static void main(String[] args) throws IOException {
            File file = new File("text.txt");

            File file1 = new File("src/main/java/lesson10/text.txt");
            System.out.println(readFileWithBufferReader(file1));
            System.out.println(readFileWithScanner(file));
            System.out.println(readFileWithFileUtils(file));
            System.out.println(readFileWithFiles(file));
        }

        public static String readFileWithBufferReader(File file) throws IOException {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            int ch;
            while ((ch = bufferedReader.read()) != -1){
                stringBuffer.append((char) ch);
            }
            return stringBuffer.toString();
        }


        public static String readFileWithScanner(File file) throws FileNotFoundException {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter(" ");
            StringBuilder stringBuilder = new StringBuilder();
            while (scanner.hasNext()){
                stringBuilder
                        .append(scanner.next())
                        .append(" ");
            }
            return stringBuilder.toString();
        }

        public static String readFileWithFileUtils(File file) throws IOException {
            return null;//FileUtils.readFileToString(file, Charset.defaultCharset());
        }

        public static String readFileWithFiles(File file) throws IOException {
            return Files.readString(file.toPath());
        }

    }
