package xyz.vsngamer.elevator.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xyz.vsngamer.elevator.blocks.BlockElevator;
import xyz.vsngamer.elevator.blocks.BlockElevatorBlack;
import xyz.vsngamer.elevator.blocks.BlockElevatorBlue;
import xyz.vsngamer.elevator.blocks.BlockElevatorBrown;
import xyz.vsngamer.elevator.blocks.BlockElevatorCyan;
import xyz.vsngamer.elevator.blocks.BlockElevatorGray;
import xyz.vsngamer.elevator.blocks.BlockElevatorGreen;
import xyz.vsngamer.elevator.blocks.BlockElevatorLightBlue;
import xyz.vsngamer.elevator.blocks.BlockElevatorLime;
import xyz.vsngamer.elevator.blocks.BlockElevatorMagenta;
import xyz.vsngamer.elevator.blocks.BlockElevatorOrange;
import xyz.vsngamer.elevator.blocks.BlockElevatorPink;
import xyz.vsngamer.elevator.blocks.BlockElevatorPurple;
import xyz.vsngamer.elevator.blocks.BlockElevatorRed;
import xyz.vsngamer.elevator.blocks.BlockElevatorSilver;
import xyz.vsngamer.elevator.blocks.BlockElevatorYellow;

public class ModBlocks {

	public static Block elevator;
	public static Block elevator_black;
	public static Block elevator_blue;
	public static Block elevator_brown;
	public static Block elevator_cyan;
	public static Block elevator_gray;
	public static Block elevator_green;
	public static Block elevator_light_blue;
	public static Block elevator_lime;
	public static Block elevator_magenta;
	public static Block elevator_orange;
	public static Block elevator_pink;
	public static Block elevator_purple;
	public static Block elevator_red;
	public static Block elevator_silver;
	public static Block elevator_yellow;

	public static void init() {
		elevator = new BlockElevator();
		elevator_black = new BlockElevatorBlack();
		elevator_blue = new BlockElevatorBlue();
		elevator_brown = new BlockElevatorBrown();
		elevator_cyan = new BlockElevatorCyan();
		elevator_gray = new BlockElevatorGray();
		elevator_green = new BlockElevatorGreen();
		elevator_light_blue = new BlockElevatorLightBlue();
		elevator_lime = new BlockElevatorLime();
		elevator_magenta = new BlockElevatorMagenta();
		elevator_orange = new BlockElevatorOrange();
		elevator_pink = new BlockElevatorPink();
		elevator_purple = new BlockElevatorPurple();
		elevator_red = new BlockElevatorRed();
		elevator_silver = new BlockElevatorSilver();
		elevator_yellow = new BlockElevatorYellow();
	}

	public static void register() {

		registerBlock(elevator);
		registerBlock(elevator_black);
		registerBlock(elevator_blue);
		registerBlock(elevator_brown);
		registerBlock(elevator_cyan);
		registerBlock(elevator_gray);
		registerBlock(elevator_green);
		registerBlock(elevator_light_blue);
		registerBlock(elevator_lime);
		registerBlock(elevator_magenta);
		registerBlock(elevator_orange);
		registerBlock(elevator_pink);
		registerBlock(elevator_purple);
		registerBlock(elevator_red);
		registerBlock(elevator_silver);
		registerBlock(elevator_yellow);
	}

	private static void registerBlock(Block block) {
		GameRegistry.registerBlock(block);
	}

	public static void registerRenders() {
		registerRender(elevator);
		registerRender(elevator_black);
		registerRender(elevator_blue);
		registerRender(elevator_brown);
		registerRender(elevator_cyan);
		registerRender(elevator_gray);
		registerRender(elevator_green);
		registerRender(elevator_light_blue);
		registerRender(elevator_lime);
		registerRender(elevator_magenta);
		registerRender(elevator_orange);
		registerRender(elevator_pink);
		registerRender(elevator_purple);
		registerRender(elevator_red);
		registerRender(elevator_silver);
		registerRender(elevator_yellow);
	}

	private static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new net.minecraft.client.resources.model.ModelResourceLocation(block.getRegistryName(), "inventory")); // NOT
																														// SURE
																														// IF
																														// THIS
																														// WORKS
																														// update:
																														// works
																														// :D
	}
}
