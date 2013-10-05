package ml.core.gui.controls.inventory;

import ml.core.gui.controls.GuiControl;
import ml.core.gui.core.GuiElement;
import ml.core.gui.event.EventMouseClicked;
import ml.core.gui.event.GuiEvent;
import ml.core.vec.Vector2i;
import net.minecraft.inventory.Slot;

public class ControlSlot extends GuiControl {
	
	protected Slot slot;
	
	public ControlSlot(GuiElement par, Slot slt, Vector2i pos, Vector2i size) {
		super(par, pos, size);
		slot = slt;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void handleEvent(GuiEvent evt) {
		if (slot != null && evt instanceof EventMouseClicked && evt.origin == this) {
			EventMouseClicked evmc = (EventMouseClicked)evt;
			
			// TODO Full click options
			
		}
		super.handleEvent(evt);
	}
	
}