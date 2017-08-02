package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case "Aged Brie":
                    item.sellIn--;
                    increaseQuality(item);
                    if (item.sellIn < 0) {
                        increaseQuality(item);
                    }
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    item.sellIn--;
                    increaseQuality(item);
                    if (item.sellIn < 10) {
                        increaseQuality(item);
                    }

                    if (item.sellIn < 5) {
                        increaseQuality(item);
                    }
                    if (item.sellIn < 0) {
                        item.quality = 0;
                    }
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    break;
                default:
                    item.sellIn--;
                    if (item.quality > 0) {
                        item.quality--;
                    }
                    if (item.quality > 0 && item.sellIn < 0) {
                        item.quality--;
                    }
                    break;
            }
        }
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }
}