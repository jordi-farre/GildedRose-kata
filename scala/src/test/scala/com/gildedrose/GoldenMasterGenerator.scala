package com.gildedrose

import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}

object GoldenMasterGenerator {

  def main(args: Array[String]): Unit = {
    Files.write(Paths.get("src/test/resources/com/gildedrose/golden-master.txt"), new GildedRoseExecutor().execute(50).getBytes(StandardCharsets.UTF_8))
  }

}
