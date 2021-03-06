package com.ia61.wavecad;

import com.ia61.wavecad.service.LineChartService;
import com.ia61.wavecad.service.NodeService;
import com.ia61.wavecad.service.WindowService;
import com.ia61.wavecad.service.impl.LineChartServiceImpl;
import com.ia61.wavecad.service.impl.NodeServiceImpl;
import com.ia61.wavecad.service.impl.WindowServiceImpl;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    AnchorPane elements;

    @FXML
    AnchorPane workingPane;

    @FXML
    Button monitorButton;

    private NodeService nodeService;
    private LineChartService lineChartService;
    private WindowService windowService;

    public Controller() {
        this.windowService = new WindowServiceImpl();
        this.lineChartService = new LineChartServiceImpl();
        this.nodeService = new NodeServiceImpl();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        handleMonitorButton();
        //elementsTree.setRoot((TreeItem<String>) nodeService.getNativeNodes());
        final StackPane sp1 = new StackPane();
        //Circle circle = new Circle(150.0f, 150.0f, 80.f);
//        sp1.getChildren().add(nodeService.getNativeNodes());
        //workingPane.getChildren().add(nodeService.getNativeNodes());
//        elementsPane.(nodeService.getNativeNodes());

        elements.addEventFilter(MouseEvent.MOUSE_PRESSED, mouseEvent
                -> workingPane.getChildren().add(nodeService.getNativeNodes()));


    }

    private void handleMonitorButton() {
        monitorButton.setOnMouseClicked((event) -> {
//            windowService.buildWindow("LineChart.fxml");

            FXMLLoader fxmlLoader = new FXMLLoader(
                Objects.requireNonNull(ClassLoader.getSystemClassLoader().getResource("LineChart.fxml")));
            Stage stage = new Stage();
            try {
                stage.setScene(new Scene(fxmlLoader.load(), 500, 500));
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage.show();
        });
    }
}
