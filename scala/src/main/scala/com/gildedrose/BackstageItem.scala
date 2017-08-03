package com.gildedrose

class BackstageItem(item: Item) extends BaseItem(item) {

  override protected def updateQuality: Unit = {
    increaseQuality
    if (item.sellIn < 10) {
      increaseQuality
    }
    if (item.sellIn < 5) {
      increaseQuality
    }
    if (item.sellIn < 0) {
      item.quality = 0
    }
  }

  private def increaseQuality = {
    if (item.quality < 50) {
      item.quality += 1
    }
  }
}
