/* blacken - a library for Roguelike games
 * Copyright © 2012 Steven Black <yam655@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package com.googlecode.blacken.dungeon.TIMTypes;

import com.googlecode.blacken.core.ListMap;
import com.googlecode.blacken.grid.Positionable;
import java.io.Serializable;

/**
 *
 * @author yam655
 */
public interface TimedMonsterlike extends Monsterlike {
    public void decreaseTime(int duration);
    @Override
    public TimedFlag getFlag(String name);

    @Override
    public ListMap<String, ? extends TimedFlag> getFlags();
}
