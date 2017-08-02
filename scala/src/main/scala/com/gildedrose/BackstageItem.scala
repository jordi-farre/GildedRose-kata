package com.gildedrose

class BackstageItem(item: Item) extends BaseItem(item) {

  override protected def updateQuality: Unit = {
    if (item.quality < 50) {
      item.quality += 1
    }
    if (item.sellIn < 10) {
      if (item.quality < 50) {
        item.quality += 1
      }
    }
    if (item.sellIn < 5) {
      if (item.quality < 50) {
        item.quality += 1
      }
    }
    if (item.sellIn < 0) {
      item.quality = 0
    }
  }

}
