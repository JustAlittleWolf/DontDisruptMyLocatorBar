package me.wolfii.dontdisruptmylocatorbar.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.gui.hud.InGameHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(InGameHud.class)
public class InGameHudMixin {
	@WrapOperation(method = "getCurrentBarType", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/hud/InGameHud;shouldShowExperienceBar()Z"))
	private boolean dontDisruptMyLocatorBar(InGameHud instance, Operation<Boolean> original) {
		return false;
	}
}
