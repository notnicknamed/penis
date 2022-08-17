
package net.mcreator.plannittwo.fluid;

public abstract class PeeFluid extends ForgeFlowingFluid {

	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(PlannittwoModFluids.PEE,
			PlannittwoModFluids.FLOWING_PEE,
			FluidAttributes.builder(new ResourceLocation("plannittwo:blocks/piss"), new ResourceLocation("plannittwo:blocks/piss"))

					.viscosity(5000)

	).explosionResistance(100f)

			.tickRate(20)

			.bucket(PlannittwoModItems.PEE_BUCKET).block(() -> (LiquidBlock) PlannittwoModBlocks.PEE.get());

	private PeeFluid() {
		super(PROPERTIES);
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(4);
	}

	public static class Source extends PeeFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PeeFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}

}
