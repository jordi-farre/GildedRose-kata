package com.gildedrose;

public class AgedBrieItem extends BaseItem {

    protected AgedBrieItem(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        if (this.quality < 50) {
            this.quality++;
        }
        if (this.sellIn < 0) {
            if (this.quality < 50) {
                this.quality++;
            }
        }
    }

}
