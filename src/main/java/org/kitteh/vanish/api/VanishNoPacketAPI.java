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
package org.kitteh.vanish.api;

import org.kitteh.vanish.api.player.PlayerHandler;

public abstract class VanishNoPacketAPI {
    private final PlayerHandler playerHandler;

    public VanishNoPacketAPI() {
        this.playerHandler = new PlayerHandler();
    }

    public final PlayerHandler getPlayerHandler() {
        return this.playerHandler;
    }

}
