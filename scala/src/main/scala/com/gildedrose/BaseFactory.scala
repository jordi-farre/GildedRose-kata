package com.gildedrose

trait BaseFactory {

  def create(item: Item): Option[BaseItem]

}
