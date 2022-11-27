package com.ninni.barnyard;

import com.google.common.reflect.Reflection;
import com.ninni.barnyard.init.BarnyardBlocks;
import com.ninni.barnyard.init.BarnyardEntityTypes;
import com.ninni.barnyard.init.BarnyardItems;
import com.ninni.barnyard.init.BarnyardSensorTypes;
import com.ninni.barnyard.init.BarnyardSounds;
import net.fabricmc.api.ModInitializer;

public class Barnyard implements ModInitializer {
	public static final String MOD_ID = "barnyard";

	@Override
	@SuppressWarnings("UnstableApiUsage")
	public void onInitialize() {
		Reflection.initialize(
				BarnyardSounds.class,
				BarnyardItems.class,
				BarnyardBlocks.class,
				BarnyardEntityTypes.class,
				BarnyardSensorTypes.class
		);
	}
}
