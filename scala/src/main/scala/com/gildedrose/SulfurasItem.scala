package com.gildedrose

class SulfurasItem(item: Item) extends BaseItem(item) {

  override protected def updateSellIn: Unit = {
    // don't update sellin
  }

  override protected def updateQuality: Unit = {
    // don't update quality
  }

}

object SulfurasItem extends BaseFactory {

  def create(item: Item): Option[BaseItem] = if ("Sulfuras, Hand of Ragnaros".equals(item.name)) Option(new SulfurasItem(item)) else None;

}
