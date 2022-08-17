
package net.mcreator.plannittwo.item;

import net.minecraft.network.chat.Component;

public class PeeItem extends BucketItem {

	public PeeItem() {
		super(PlannittwoModFluids.PEE,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}

}
