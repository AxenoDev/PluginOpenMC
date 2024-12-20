package fr.communaywen.core.guideline.advancements.dream.helldivers;

import com.fren_gor.ultimateAdvancementAPI.advancement.Advancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.BaseAdvancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import com.fren_gor.ultimateAdvancementAPI.visibilities.VanillaVisibility;
import fr.communaywen.core.AywenCraftPlugin;
import fr.communaywen.core.economy.EconomyManager;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Helldivers3 extends BaseAdvancement implements VanillaVisibility {
    public Helldivers3(@NotNull Advancement parent) {
        super(
                "helldivers/3",
                new AdvancementDisplay(
                        Material.IRON_SWORD,
                        "Helldivers III",
                        AdvancementFrameType.TASK,
                        true,
                        false,
                        3F,10,
                        "Pour la démocratie!!"
                ),
                parent
        );
    }

    @Override
    public void giveReward(@NotNull Player player) {
        EconomyManager.getInstance().addBalance(player.getUniqueId(), 100, "Advancement "+this.display.getTitle());
    }
}
