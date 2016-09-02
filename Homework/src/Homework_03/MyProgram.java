package Homework_03;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MyProgram {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File(args[0]);

        RandomAccessFile rw = null;
        try {
            if (file.exists()) {
                rw = new RandomAccessFile(file, "rw");
                int byteSize = 4;
                for (int i = 0; i < rw.length() / byteSize; i++) {
                    float in = rw.readFloat();
                    rw.seek(rw.getFilePointer() - 4);
                    rw.writeInt((int) in);
                }

            } else {
                throw new ClassNotFoundException("File Not Found");
            }
        } finally {
            if (rw != null) {
                rw.close();
            }
        }

    }
}
