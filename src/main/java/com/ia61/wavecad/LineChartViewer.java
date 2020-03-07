package com.ia61.wavecad;

import com.ia61.wavecad.service.LineChartService;
import com.ia61.wavecad.service.impl.LineChartServiceImpl;
import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.layout.BorderPane;

/**
 * @author Dmytro Vovk
 */

public class LineChartViewer extends BorderPane {

  @FXML
  BorderPane rootViewerPane;

  @FXML
  private LineChart<?, ?> lineChart;

  @FXML
  private CategoryAxis x;

  @FXML
  private NumberAxis y;

  private final LineChartService lineChartService;

  public LineChartViewer() {
    this.lineChartService = new LineChartServiceImpl();
  }

  @FXML
  public void initialize() {
    lineChartService.buildChart(lineChart);
  }
}
