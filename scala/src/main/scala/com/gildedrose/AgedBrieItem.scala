package com.gildedrose

class AgedBrieItem(item: Item) extends BaseItem(item) {

  override def updateQuality: Unit = {
    if (item.quality < 50) {
      item.quality += 1
    }
    if (item.sellIn < 0) {
      if (item.quality < 50) {
        item.quality += 1
      }
    }
  }


}
