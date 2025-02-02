package com.kqp.inventorytabs.tabs.provider;

import java.util.List;

import com.kqp.inventorytabs.tabs.tab.PlayerInventoryTab;
import com.kqp.inventorytabs.tabs.tab.Tab;

import net.minecraft.client.network.ClientPlayerEntity;

public class PlayerInventoryTabProvider implements TabProvider {
    @Override
    public void addAvailableTabs(ClientPlayerEntity player, List<Tab> tabs) {
        for (int i = 0; i < tabs.size(); i++) {
            if (tabs.get(i) instanceof PlayerInventoryTab) {
                return;
            }
        }

        tabs.add(new PlayerInventoryTab());
    }
}
