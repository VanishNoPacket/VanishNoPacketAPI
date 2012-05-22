/**
 *   VanishNoPacket API
 *   Copyright 2012 Matt Baxter
 * 
 * ******************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kitteh.vanish.api.player;

import java.util.HashMap;
import java.util.HashSet;

public class PlayerHandler {
    private HashMap<String, VPlayer> players;

    /**
     * Add a player to internal tracking
     * Call me when a player joins
     * 
     * @param player
     *            VPlayer for the player
     */
    public final void addPlayer(VPlayer player) {
        this.players.put(player.getName(), player);
    }

    /**
     * Get a player by their name
     * 
     * @param name
     *            Name of the player
     * @return VPlayer of the player
     */
    public final VPlayer getPlayer(String name) {
        return this.players.get(name);
    }

    /**
     * Get a set of all tracked players
     * 
     * @return Set of all VPlayers tracked
     */
    public final HashSet<VPlayer> getPlayers() {
        return new HashSet<VPlayer>(this.players.values());
    }

    /**
     * Remove a player from internal tracking.
     * Call me when a player quits
     * 
     * @param name
     *            Name of the player
     */
    public final void removePlayer(String name) {
        this.players.remove(name);
    }
}
