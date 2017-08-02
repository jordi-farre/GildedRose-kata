package com.gildedrose;

public class BaseItem extends Item {

    protected Item item;

    protected BaseItem(Item item) {
        super(item.name, item.sellIn, item.quality);
        this.item = item;
    }

    public static BaseItem from(Item item) {
        switch (item.name) {
            case "Aged Brie":
                return new AgedBrieItem(item);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstageItem(item);
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasItem(item);
            default:
                return new BaseItem(item);
        }
    }

    public void update() {
        this.updateSellIn();
        this.updateQuality();
        this.item.sellIn = this.sellIn;
        this.item.quality = this.quality;
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
