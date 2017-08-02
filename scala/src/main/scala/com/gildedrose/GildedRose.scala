package com.gildedrose

class GildedRose(val items: Array[Item]) {


  def updateQuality() {
    items
      .map(ItemFactory.create _)
      .foreach(_.update)
  }

}