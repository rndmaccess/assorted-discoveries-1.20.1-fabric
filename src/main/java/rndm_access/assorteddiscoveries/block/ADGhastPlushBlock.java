package rndm_access.assorteddiscoveries.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;

public class ADGhastPlushBlock extends ADAbstractDirectionalPlushBlock {
    private static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(4.0D, 0.0D, 3.5D, 12.5D,
            10.0D, 12.5D);

    public ADGhastPlushBlock(AbstractBlock.Settings settings) {
        super(settings, NORTH_SHAPE);
    }
}
