package rndm_access.assorteddiscoveries.core;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.AssortedDiscoveries;

public class ADParticleTypes {
    public static final DefaultParticleType WHITE_EMBER = register("white_ember");
    public static final DefaultParticleType ORANGE_EMBER = register("orange_ember");
    public static final DefaultParticleType MAGENTA_EMBER = register("magenta_ember");
    public static final DefaultParticleType LIGHT_BLUE_EMBER = register("light_blue_ember");
    public static final DefaultParticleType YELLOW_EMBER = register("yellow_ember");
    public static final DefaultParticleType LIME_EMBER = register("lime_ember");
    public static final DefaultParticleType PINK_EMBER = register("pink_ember");
    public static final DefaultParticleType GRAY_EMBER = register("gray_ember");
    public static final DefaultParticleType LIGHT_GRAY_EMBER = register("light_gray_ember");
    public static final DefaultParticleType CYAN_EMBER = register("cyan_ember");
    public static final DefaultParticleType PURPLE_EMBER = register("purple_ember");
    public static final DefaultParticleType BLUE_EMBER = register("blue_ember");
    public static final DefaultParticleType BROWN_EMBER = register("brown_ember");
    public static final DefaultParticleType GREEN_EMBER = register("green_ember");
    public static final DefaultParticleType RED_EMBER = register("red_ember");
    public static final DefaultParticleType BLACK_EMBER = register("black_ember");
    public static final DefaultParticleType MAROON_EMBER = register("maroon_ember");
    public static final DefaultParticleType WHITE_FLAME = register("white_flame");
    public static final DefaultParticleType ORANGE_FLAME = register("orange_flame");
    public static final DefaultParticleType MAGENTA_FLAME = register("magenta_flame");
    public static final DefaultParticleType LIGHT_BLUE_FLAME = register("light_blue_flame");
    public static final DefaultParticleType YELLOW_FLAME = register("yellow_flame");
    public static final DefaultParticleType LIME_FLAME = register("lime_flame");
    public static final DefaultParticleType PINK_FLAME = register("pink_flame");
    public static final DefaultParticleType GRAY_FLAME = register("gray_flame");
    public static final DefaultParticleType LIGHT_GRAY_FLAME = register("light_gray_flame");
    public static final DefaultParticleType CYAN_FLAME = register("cyan_flame");
    public static final DefaultParticleType PURPLE_FLAME = register("purple_flame");
    public static final DefaultParticleType BLUE_FLAME = register("blue_flame");
    public static final DefaultParticleType BROWN_FLAME = register("brown_flame");
    public static final DefaultParticleType GREEN_FLAME = register("green_flame");
    public static final DefaultParticleType RED_FLAME = register("red_flame");
    public static final DefaultParticleType BLACK_FLAME = register("black_flame");
    public static final DefaultParticleType MAROON_FLAME = register("maroon_flame");
    public static final DefaultParticleType BLOOD_KELP_SPORE = register("blood_kelp_spore");
    public static final DefaultParticleType WITCHS_CRADLE_SPORE = register("witchs_cradle_spore");
    public static final DefaultParticleType FALLING_WEEPING_HEART_NECTAR = register("falling_weeping_heart_nectar");
    public static final DefaultParticleType WEEPING_HEART_AIR_NECTAR = register("weeping_heart_air_nectar");
    public static final DefaultParticleType SOUL_EMBER = register("soul_ember");

    private static DefaultParticleType register(String path) {
        return Registry.register(Registries.PARTICLE_TYPE, ADReference.makeId(path), FabricParticleTypes.simple());
    }

    /**
     * Called during mod initialization to register every particle type.
     */
    public static void registerParticleTypes() {
        AssortedDiscoveries.LOGGER.info("Registered particle types");
    }
}