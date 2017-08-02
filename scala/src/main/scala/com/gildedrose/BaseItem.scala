package com.gildedrose

class BaseItem(val item: Item) extends Item(item.name, item.sellIn, item.quality) {

  def update: Unit = {
    updateSellIn
    updateQuality
  }

  protected def updateSellIn: Unit = {
    item.sellIn -= 1
  }

  protected def updateQuality: Unit = {
    if (item.quality > 0) {
      item.quality = item.quality - 1
    }
    if (item.quality > 0 && item.sellIn < 0) {
      item.quality = item.quality - 1
    }
  }

}
