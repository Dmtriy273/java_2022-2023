package laba8.task1.example3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class File_ByteRead_SamBuff {
    //считывание по 5 символов в буфер
    public static void readAllByArray(InputStream in) throws IOException {
        byte[] buff = new byte[5];
        while (true) {
            int count = in.read(buff);
            if (count != -1) { //если не конец файла
                System.out.println("колличество = "+ count + ", buff = "+ Arrays.toString(buff) + ", str = "+ new String(buff, 0, count, "cp1251"));//"UTF8"
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String fileName = "src\\laba8\\task1\\example3\\text1.txt";
        InputStream inFile= null;
        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch (IOException e) {
            System.out.println("Ошибка открытия-закрытия файла"+fileName+e);
        } finally { //корректное закрытие потока
            if (inFile != null){
                try {
                    inFile.close();
                } catch (IOException ignore){
                    /*NOP*/
                }
            }
        }
    }
}
