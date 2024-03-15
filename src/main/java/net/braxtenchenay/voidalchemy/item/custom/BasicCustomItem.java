package net.braxtenchenay.voidalchemy.item.custom;

import net.braxtenchenay.voidalchemy.item.ModItems;
import net.minecraft.data.client.Model;
import net.minecraft.item.Item;

public class BasicCustomItem extends Item {
    public BasicCustomItem(Settings settings, Model model) {
        super(settings);

        ModItems.itemMap.put(this.asItem(), model);
    }
}
