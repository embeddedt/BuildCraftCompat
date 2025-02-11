package buildcraft.compat.datagen;

import buildcraft.compat.BCCompat;
import buildcraft.compat.BCCompatBlocks;
import buildcraft.datagen.base.BCBaseItemModelGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CompatItemModelGenerator extends BCBaseItemModelGenerator {
    public CompatItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BCCompat.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // power_convertor
        withExistingParent(BCCompatBlocks.powerConvertor.get().getRegistryName().toString(), new ResourceLocation("buildcraftcompat:block/power_convertor"));
    }
}
