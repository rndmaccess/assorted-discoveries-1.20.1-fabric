package rndm_access.assorteddiscoveries.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.registry.tag.TagKey;
import rndm_access.assorteddiscoveries.core.ADEntityTypeTags;
import rndm_access.assorteddiscoveries.core.ADItems;

public class ADBlueberryBushBlock extends ADAbstractBerryBushBlock {
    public ADBlueberryBushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected Item berryItem() {
        return ADItems.BLUEBERRIES;
    }

    @Override
    protected TagKey<EntityType<?>> mobsImmune() {
        return ADEntityTypeTags.BLUEBERRY_BUSH_IMMUNE_ENTITY_TYPES;
    }

    @Override
    protected boolean bushDamages() {
        return false;
    }

    @Override
    protected boolean needsLightToGrow() {
        return true;
    }
}
