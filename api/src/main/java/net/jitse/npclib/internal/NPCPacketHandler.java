/*
 * Copyright (c) 2018 Jitse Boonstra
 */

package net.jitse.npclib.internal;

import net.jitse.npclib.api.state.NPCSlot;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * @author Jitse Boonstra
 */
interface NPCPacketHandler {

    void createPackets();

    void sendShowPackets(Player player);

    void sendHidePackets(Player player);

    void sendMetadataPacket(Player player);

    void sendEquipmentPacket(Player player, NPCSlot slot, boolean auto);

    void sendMovementPacket(Player player, Location from, Location to);

    void sendLookPacket(Player player, Location loc);

    default void sendEquipmentPackets(Player player) {
        for (NPCSlot slot : NPCSlot.values())
            sendEquipmentPacket(player, slot, true);
    }
}
