package com.gildedrose

import java.nio.file.{Files, Paths}

import org.scalatest._

class GildedRoseTest  extends FlatSpec with Matchers {
      it should "foo" in {
        val expected = new String(Files.readAllBytes(Paths.get(this.getClass.getResource("golden-master.txt").toURI)))
        val result = new GildedRoseExecutor().execute(50)
        (expected) should equal (result)
      }
}