package com.ia61.wavecad.service;

import javafx.scene.chart.LineChart;

/**
 * @author Dmytro Vovk
 */

public interface ChartService {
    void buildChart(LineChart<?, ?> lineChart);
}
