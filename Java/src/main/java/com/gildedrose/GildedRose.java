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
                    decreaseSellIn(item);
                    increaseQuality(item);
                    if (item.sellIn < 0) {
                        increaseQuality(item);
                    }
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    decreaseSellIn(item);
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
                    decreaseSellIn(item);
                    if (item.quality > 0) {
                        decreaseQuality(item);
                    }
                    if (item.quality > 0 && item.sellIn < 0) {
                        decreaseQuality(item);
                    }
                    break;
            }
        }
    }

    private void decreaseSellIn(Item item) {
        item.sellIn--;
    }

    private void decreaseQuality(Item item) {
        item.quality--;
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }
}