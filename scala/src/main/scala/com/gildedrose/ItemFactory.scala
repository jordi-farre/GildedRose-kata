package com.gildedrose

object ItemFactory {

  def create(item: Item): BaseItem = {
    item.name match {
      case "Aged Brie" => new AgedBrieItem(item)
      case "Backstage passes to a TAFKAL80ETC concert" => new BackstageItem(item)
      case "Sulfuras, Hand of Ragnaros" => new SulfurasItem(item)
      case _ => new BaseItem(item)
    }
  }

}
