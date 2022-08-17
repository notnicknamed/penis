
package net.mcreator.plannittwo.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class PeeBlock extends LiquidBlock {
	public PeeBlock() {
		super(() -> (FlowingFluid) PlannittwoModFluids.PEE.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

}