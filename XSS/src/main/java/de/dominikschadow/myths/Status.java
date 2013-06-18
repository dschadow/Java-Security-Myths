/*
 * Copyright (C) 2013 Dominik Schadow, dominikschadow@gmail.com
 *
 * This file is part of the Java Security Myths project.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.dominikschadow.myths;

/**
 * Represents one Status array entry.
 * 
 * @author Dominik Schadow
 */
public class Status {
    private String label;
    private String value;

    public Status(String text) {
        this.label = text;
        this.value = text;
    }

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return value;
    }
}
