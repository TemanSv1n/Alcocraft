package net.hadrus.alcocraft.blocks.drinks.beer;

import net.hadrus.alcocraft.blocks.drinks.MugBlock;
import net.hadrus.alcocraft.particles.AlcoParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

public class BeaweedMugBlock extends MugBlock {

    public BeaweedMugBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void animateTick(BlockState pState, Level pLevel, BlockPos pPos, Random pRand) {
        if (pRand.nextFloat() < 0.4f){
            for(int i = 0; i < 3; ++i) {
                int j = pRand.nextInt(2) * 2 - 1;
                int k = pRand.nextInt(2) * 2 - 1;
                double d0 = (double)pPos.getX() + 0.5D + 0.25D * (double)j;
                double d1 = (double)((float)pPos.getY() + pRand.nextFloat());
                double d2 = (double)pPos.getZ() + 0.5D + 0.25D * (double)k;
                double d3 = (double)(pRand.nextFloat() * (float)j);
                double d4 = ((double)pRand.nextFloat() - 0.5D) * 0.125D;
                double d5 = (double)(pRand.nextFloat() * (float)k);
                pLevel.addParticle(AlcoParticles.YELLOW_BUBBLES.get(), d0, d1, d2, 0.0D, pRand.nextDouble() * 0.1D, 0.0D);
            }
        }

    }
}
