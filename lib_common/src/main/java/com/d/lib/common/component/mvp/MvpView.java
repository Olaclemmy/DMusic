/*
 * Copyright 2015 Hannes Dorfmann.
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

package com.d.lib.common.component.mvp;

/**
 * The root view interface for every mvp view
 *
 * @author Hannes Dorfmann
 * @since 1.0.0
 */
public interface MvpView {

    /**
     * Set the default state.
     * When the network request error occurs, you can get the display status by getState(Throwable e).
     *
     * @param state: DSLayout.STATE_LOADING、DSLayout.STATE_EMPTY、
     *               DSLayout.STATE_NET_ERROR、DSLayout.GONE
     */
    void setState(int state);
}
