package com.gildedrose

object ItemFactory {

  def create(item: Item): BaseItem = {
    val factoryArray = Array[BaseFactory](AgedBrieItem, BackstageItem, SulfurasItem)
    var baseItem:Option[BaseItem] = None
    factoryArray.foreach(factory => {
      val createdItem:Option[BaseItem] = factory.create(item)
      if (createdItem.isDefined) baseItem = createdItem
    })
    baseItem.getOrElse(new BaseItem(item))
  }

}
