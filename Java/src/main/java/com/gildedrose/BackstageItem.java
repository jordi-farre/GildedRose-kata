package com.gildedrose;


public class BackstageItem extends BaseItem {

    protected BackstageItem(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        if (this.quality < 50) {
            this.quality++;
        }
        if (this.sellIn < 10) {
            if (this.quality < 50) {
                this.quality++;
            }
        }

        if (this.sellIn < 5) {
            if (this.quality < 50) {
                this.quality++;
            }
        }
        if (this.sellIn < 0) {
            this.quality = 0;
        }
    }

}
