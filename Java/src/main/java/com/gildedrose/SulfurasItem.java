package com.gildedrose;

public class SulfurasItem extends BaseItem {

    protected SulfurasItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        // never change quality
    }

    @Override
    public void updateSellIn() {
        // never change sellin
    }

}
