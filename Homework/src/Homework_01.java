
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Homework_01 {

    public static void main(String[] args)
            throws IOException, FileNotFoundException {
        if (args.length != 2) {
            usage();
        }
        FileReader reader = null;
        FileWriter writer = null;

        try {

            reader = new FileReader(args[0]);

            // open the output text file
            writer = new FileWriter(args[1]);

            while (true) {
                // read each input char from input file
                int next = reader.read();
                char c;
                if (next == -1) {
                    break;
                }
                c = (char) next;

                // encrypt the char
                char encryptedC;
                if (c >= 'A' && c <= 'z') {
                    encryptedC = (char) ('z' - (c - 'A'));
                } else if (c >= '0' && c <= '9') {
                    encryptedC = (char) ('9' - (c - '0'));
                } else // other character
                {
                    encryptedC = c;
                }

                // write the encrypted character to output file
                writer.write(encryptedC);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }

    public static void usage() {
        System.out.println("Usage:java Encrypt InputTextFile OutputTextFile");
        System.exit(1);
    }
}
