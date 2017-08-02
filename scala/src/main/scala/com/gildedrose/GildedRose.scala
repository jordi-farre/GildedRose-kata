package com.gildedrose

class GildedRose(val items: Array[Item]) {


  def updateQuality() {
    items.foreach { item =>
      decreaseSellIn(item)
      if (!item.name.equals("Aged Brie")
      && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        if (item.quality > 0) {
          if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.quality = item.quality - 1
          }
        }
      } else {
        increaseQuality(item)

        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
          if (item.sellIn < 10) {
            increaseQuality(item)
          }

          if (item.sellIn < 5) {
            increaseQuality(item)
          }
        }
      }


      if (item.sellIn < 0) {
        if (!item.name.equals("Aged Brie")) {
          if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (item.quality > 0) {
              if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.quality = item.quality - 1
              }
            }
          } else {
            item.quality = item.quality - item.quality
          }
        } else {
          increaseQuality(item)
        }
      }
    }
  }

  private def decreaseSellIn(item: Item) = {
    if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
      item.sellIn = item.sellIn - 1
    }
  }

  private def increaseQuality(item: Item) = {
    if (item.quality < 50) {
      item.quality = item.quality + 1
    }
  }

}