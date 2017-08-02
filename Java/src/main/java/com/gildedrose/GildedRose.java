package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            decreaseSellIn(item);
            if (item.name.equals("Aged Brie")
                    || item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                increaseQuality(item);

                if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (item.sellIn < 10) {
                        increaseQuality(item);
                    }

                    if (item.sellIn < 5) {
                        increaseQuality(item);
                    }
                }
            } else {
                if (item.quality > 0) {
                    decreaseQuality(item);
                }
            }


            if (item.name.equals("Aged Brie")) {
                if (item.sellIn < 0) {
                    increaseQuality(item);
                }
            } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.sellIn < 0) {
                    item.quality = 0;
                }
            } else {
                if (item.quality > 0 && item.sellIn < 0) {
                    decreaseQuality(item);
                }
            }
        }
    }

    private void decreaseSellIn(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn--;
        }
    }

    private void decreaseQuality(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.quality--;
        }
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }
}