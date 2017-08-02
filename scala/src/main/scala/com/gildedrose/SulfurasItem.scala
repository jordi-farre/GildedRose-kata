package com.gildedrose

class SulfurasItem(item: Item) extends BaseItem(item) {

  override protected def updateSellIn: Unit = {
    // don't update sellin
  }

  override protected def updateQuality: Unit = {
    // don't update quality
  }

}
