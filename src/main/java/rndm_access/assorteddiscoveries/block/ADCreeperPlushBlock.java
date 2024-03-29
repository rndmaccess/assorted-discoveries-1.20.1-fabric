package rndm_access.assorteddiscoveries.block;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;

public class ADCreeperPlushBlock extends ADAbstractDirectionalPlushBlock {
    private static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(4.0D, 0.0D, 2.0D, 12.0D,
            12.0D, 14.0D);

    public ADCreeperPlushBlock(Settings settings) {
        super(settings, NORTH_SHAPE);
    }
}
