package com.gildedrose

class AgedBrieItem(item: Item) extends BaseItem(item) {

  override def updateQuality: Unit = {
    increaseQuality
    if (item.sellIn < 0) {
      increaseQuality
    }
  }

  private def increaseQuality = {
    if (item.quality < 50) {
      item.quality += 1
    }
  }
}
