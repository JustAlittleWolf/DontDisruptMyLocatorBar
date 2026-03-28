package me.wolfii.dontdisruptmylocatorbar.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.gui.Gui;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(Gui.class)
public class InGameHudMixin {
	@WrapOperation(method = "nextContextualInfoState", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/Gui;willPrioritizeExperienceInfo()Z"))
	private boolean dontDisruptMyLocatorBar(Gui instance, Operation<Boolean> original) {
		return false;
	}
}
