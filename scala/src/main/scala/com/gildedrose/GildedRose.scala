package com.gildedrose

class GildedRose(val items: Array[Item]) {


  def updateQuality() {
    items.foreach { item =>
      decreaseSellIn(item)
      if (item.name.equals("Aged Brie")) {
        increaseQuality(item)
      } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        increaseQuality(item)
        if (item.sellIn < 10) {
          increaseQuality(item)
        }
        if (item.sellIn < 5) {
          increaseQuality(item)
        }
      } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
      } else {
        if (item.quality > 0) {
          item.quality = item.quality - 1
        }
      }


      if (item.sellIn < 0) {
        if (item.name.equals("Aged Brie")) {
          increaseQuality(item)
        } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
          item.quality = 0
        } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
        } else {
          if (item.quality > 0) {
            item.quality = item.quality - 1
          }
        }
      }
    }
  }

  private def decreaseSellIn(item: Item) = {
    if (item.name.equals("Sulfuras, Hand of Ragnaros")) {

    } else {
      item.sellIn -= 1
    }
  }

  private def increaseQuality(item: Item) = {
    if (item.quality < 50) {
      item.quality += 1
    }
  }

}