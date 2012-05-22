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

import org.kitteh.vanish.api.group.Group;
import org.kitteh.vanish.api.timing.Tockable;

public abstract class VPlayer implements Tockable {

    private PermHandler perms;
    private Group group;

    /**
     * Check if I can see another player
     * 
     * @param other
     *            That other guy we're checking out (or not)
     * @return true if I can see other guy
     */
    public boolean canSee(VPlayer other) {
        return this.group.canSee(other.getGroup());
    }

    @Override
    public boolean equals(Object object) {
        if ((object instanceof VPlayer) && ((VPlayer) object).getName().equals(this.getName())) {
            return true;
        }
        return false;
    }

    public abstract String getDisplayName();

    public Group getGroup() {
        return this.group;
    }

    public abstract String getName();

    @Override
    public int hashCode() {
        return (this.getName().hashCode() / 2) + 17;
    }

    /**
     * Check if I have permission for something
     * 
     * @param perm
     *            The permission I'm curious about
     * @return true if I have that permission
     */
    public boolean permissionGet(Perm perm) {
        return this.perms.get(perm);
    }

    /**
     * Set my ability to do/have/see/observe/hat something
     * 
     * @param perm
     *            Permission node in question
     * @param state
     *            Truth or Dare! Wait, no, the other thing.
     */
    public void permissionSet(Perm perm, boolean state) {
        this.perms.put(perm, state);
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    /**
     * Update the player's visibility to all players
     * Called when the player changes visibility status.
     */
    public abstract void updateVisibility();

}
