package com.gildedrose;

public class SulfurasItem extends BaseItem {

    protected SulfurasItem(Item item) {
        super(item);
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
