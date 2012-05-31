/*
 * Copyright 2011 Alexander V. Zinin
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

package ru.zinin.redis.session.event;

import java.io.Serializable;

/**
 * Date: 01.11.11 20:35
 *
 * @author Alexander V. Zinin (mail@zinin.ru)
 */
public abstract class RedisSessionEvent implements Serializable {
    private String id;

    public RedisSessionEvent(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getCanonicalName());
        sb.append("{id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
