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

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Bean representing user input into the maximum protected output page
 * (with additional security related attributes).
 *
 * @author Dominik Schadow
 */
@ManagedBean(name = "maximum")
@SessionScoped
public class MaximumBean implements Serializable {
    private static final long serialVersionUID = 600561947836364528L;

    private String input = "<script>alert('XSS with JSF')</script>";

    private Map<String, String> maximumMap = null;
    private Status[] maximumArray = null;

    public Map<String, String> getMaximumMap() {
        return maximumMap;
    }

    public Status[] getMaximumArray() {
        return maximumArray;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;

        maximumMap = new LinkedHashMap<String, String>();
        maximumMap.put(input, input);

        maximumArray = new Status[1];
        maximumArray[0] = new Status(input);
    }
}