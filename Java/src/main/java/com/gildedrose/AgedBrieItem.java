package com.gildedrose;

public class AgedBrieItem extends BaseItem {

    protected AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
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
