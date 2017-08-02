package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            BaseItem baseItem = BaseItem.from(item);
            baseItem.update();
            item.quality = baseItem.quality;
            item.sellIn = baseItem.sellIn;
        }
    }

}