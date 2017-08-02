package com.gildedrose;

public class BaseItem extends Item {

    protected BaseItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public static BaseItem from(Item item) {
        switch (item.name) {
            case "Aged Brie":
                return new AgedBrieItem(item.name, item.sellIn, item.quality);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstageItem(item.name, item.sellIn, item.quality);
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasItem(item.name, item.sellIn, item.quality);
            default:
                return new BaseItem(item.name, item.sellIn, item.quality);
        }
    }

    public void update() {
        this.updateSellIn();
        this.updateQuality();
    }

    protected void updateSellIn() {
        this.sellIn--;
    }

    protected void updateQuality() {
        if (this.quality > 0) {
            this.quality--;
        }
        if (this.quality > 0 && this.sellIn < 0) {
            this.quality--;
        }
    }

}
