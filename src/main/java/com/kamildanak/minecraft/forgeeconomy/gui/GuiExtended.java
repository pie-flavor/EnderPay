package com.kamildanak.minecraft.forgeeconomy.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;

import java.util.HashMap;

public class GuiExtended extends Gui {
    private static HashMap<String, ResourceLocation> resources = new HashMap<String, ResourceLocation>();
    private Minecraft mc;

    public GuiExtended(Minecraft mc)
    {
        this.mc = mc;
    }
    void bind(String textureName) {
        ResourceLocation res = resources.get(textureName);

        if (res == null) {
            res = new ResourceLocation(textureName);
            resources.put(textureName, res);
        }

        mc.getTextureManager().bindTexture(res);
    }
}