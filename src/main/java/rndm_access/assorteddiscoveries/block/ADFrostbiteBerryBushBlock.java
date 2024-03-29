package rndm_access.assorteddiscoveries.block;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import rndm_access.assorteddiscoveries.core.ADEntityTypeTags;
import rndm_access.assorteddiscoveries.core.ADItems;
import rndm_access.assorteddiscoveries.core.ADParticleTypes;
import rndm_access.assorteddiscoveries.core.CBlockTags;

public class ADFrostbiteBerryBushBlock extends ADAbstractBerryBushBlock {
    public ADFrostbiteBerryBushBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected TagKey<EntityType<?>> mobsImmune() {
        return ADEntityTypeTags.FROSTBITE_BERRY_BUSH_IMMUNE_ENTITY_TYPES;
    }

    @Override
    protected boolean bushDamages() {
        return true;
    }

    @Override
    protected boolean needsLightToGrow() {
        return false;
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        double x = pos.getX() + random.nextDouble();
        double y = pos.getY() + random.nextDouble();
        double z = pos.getZ() + random.nextDouble();
        double randNum = random.nextDouble();

        if(randNum < 0.2) {
            world.addParticle(ADParticleTypes.SOUL_EMBER, x, y, z, 0.0D, 0.0D, 0.0D);
        }
    }

    @Override
    protected Item berryItem() {
        return ADItems.FROSTBITE_BERRIES;
    }

    @Override
    public boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(CBlockTags.FROSTBITE_BERRY_BUSH_PLANTABLE_ON);
    }
}
