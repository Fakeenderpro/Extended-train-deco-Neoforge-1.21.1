
package net.kconlac.extraindeco.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IronpoleItem extends Item {
	public IronpoleItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
