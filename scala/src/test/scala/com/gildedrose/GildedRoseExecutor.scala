package com.gildedrose

import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}

import scala.collection.mutable

class GildedRoseExecutor {

  def execute(days: Int): String = {
    val stringBuilder = new mutable.StringBuilder("OMGHAI!\n")
    val items = Array[Item](
      new Item("+5 Dexterity Vest", 10, 20),
      new Item("Aged Brie", 2, 0),
      new Item("Elixir of the Mongoose", 5, 7),
      new Item("Sulfuras, Hand of Ragnaros", 0, 80),
      new Item("Sulfuras, Hand of Ragnaros", -1, 80),
      new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
      new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
      new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
      new Item("Conjured Mana Cake", 3, 6))

    val gildedRose = new GildedRose(items)

    val rangeDays = (0 to days);

    rangeDays.foreach(day => {
      stringBuilder.append(f"-------- day $day --------\n")
      stringBuilder.append("name, sellIn, quality\n")
      items.foreach(item => stringBuilder.append(s"${item.name}, ${item.sellIn}, ${item.quality}\n"))
      gildedRose.updateQuality()
    })

    stringBuilder.toString()
  }

}
