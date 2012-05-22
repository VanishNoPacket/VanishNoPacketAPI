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
package org.kitteh.vanish.api.timing;

public interface Tockable {
    /**
     * Tock! This method is called once every 10 ticks.
     * Utilized for scenarios where you want something updating over time,
     *  such as checking up on a player.
     * Less laggy than firing every tick, because nothing in this plugin needs that
     */
    public void tock();
}
