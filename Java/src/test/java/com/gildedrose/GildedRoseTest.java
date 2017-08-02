package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GildedRoseTest {

    @Test
    public void testGoldenMaster() throws URISyntaxException, IOException {
        String expected = new String(Files.readAllBytes(Paths.get(this.getClass().getResource("golden-master.txt").toURI())));
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             PrintStream printStream = new PrintStream(byteArrayOutputStream)) {
            System.setOut(printStream);
            TexttestFixture.main(new String[]{"50"});
            String result = byteArrayOutputStream.toString();
            assertEquals(expected, result);
        }
    }

}
