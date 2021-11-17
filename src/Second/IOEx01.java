package Second;

import java.io.*;
import java.util.Arrays;

public class IOEx01 {
    public static void main(String[] args) {
        byte[] inputSrc = new byte[10];
        for (int i = 0; i < 10; i++) {
            inputSrc[i] = (byte) i;
        }
        byte[] outputSrc;
        byte[] temp = new byte[4];

        ByteArrayInputStream input;
        ByteArrayOutputStream output;

        input = new ByteArrayInputStream(inputSrc);
        output = new ByteArrayOutputStream();

        try {
            while (input.available() > 0) {
                int len = input.read(temp);
                output.write(temp, 0, len);
            }
        } catch (IOException ioException) {
            System.out.println("IOException Detected");
        }

        outputSrc = output.toByteArray();

        System.out.println("Input Source : " + Arrays.toString(inputSrc));
        System.out.println("Output Source : " + Arrays.toString(outputSrc));
        System.out.println("Temp : " + Arrays.toString(temp));
    }
}
