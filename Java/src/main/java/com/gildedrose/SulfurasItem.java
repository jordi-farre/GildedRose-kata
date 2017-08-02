package com.gildedrose;

public class SulfurasItem extends BaseItem {

    protected SulfurasItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void updateQuality() {
        // never change quality
    }

    @Override
    protected void updateSellIn() {
        // never change sellin
    }

}
