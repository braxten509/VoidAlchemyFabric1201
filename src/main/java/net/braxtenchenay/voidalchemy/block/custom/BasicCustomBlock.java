package net.braxtenchenay.voidalchemy.block.custom;

import net.braxtenchenay.voidalchemy.block.ModBlocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.util.math.intprovider.IntProvider;

/**
* THIS IS A MODIFIED VERSION OF "BLOCK" FROM MINECRAFT
**/

public class BasicCustomBlock extends ExperienceDroppingBlock {

    public BasicCustomBlock(Settings settings, IntProvider experience) {
        super(settings, experience);

        ModBlocks.blockList.add(this.asBlock());
    }
}
