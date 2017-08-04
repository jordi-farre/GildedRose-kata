package com.gildedrose

object ItemFactory {

  val itemFactories = Array[BaseFactory](AgedBrieItem, BackstageItem, SulfurasItem)

  def create(item: Item): BaseItem = {
    itemFactories
        .map(factory => factory.create(item))
        .flatten
        .headOption
        .getOrElse(new BaseItem(item))
  }

}
