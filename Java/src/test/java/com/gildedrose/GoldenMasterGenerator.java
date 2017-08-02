package com.gildedrose;

import java.io.*;

public class GoldenMasterGenerator {

    public static void main(String[] args) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/test/resources/com/gildedrose/golden-master.txt", true);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
             PrintStream printStream = new PrintStream(bufferedOutputStream)) {
             System.setOut(printStream);
             TexttestFixture.main(new String[]{"50"});
        }
    }

}
