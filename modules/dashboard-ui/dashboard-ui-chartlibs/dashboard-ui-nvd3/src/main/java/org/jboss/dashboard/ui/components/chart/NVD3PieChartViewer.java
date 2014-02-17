/**
 * Copyright (C) 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.dashboard.ui.components.chart;

import javax.inject.Named;

import org.jboss.dashboard.ui.annotation.panel.PanelScoped;

@PanelScoped
@Named("nvd3_piechart_viewer")
public class NVD3PieChartViewer extends NVD3ChartViewer {

    public String getBeanJSP() {
        return "/components/bam/displayer/chart/nvd3_piechart_viewer.jsp";
    }
}
