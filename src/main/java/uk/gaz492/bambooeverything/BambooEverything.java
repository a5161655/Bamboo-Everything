package uk.gaz492.bamboofences;

import net.fabricmc.api.ModInitializer;

public class BambooEverything implements ModInitializer {

	public BERegistry registry;

	@Override
	public void onInitialize() {
		this.registry = new BERegistry(this);
	}
}
