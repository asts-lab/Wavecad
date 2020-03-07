package com.ia61.wavecad.model.input;

import com.ia61.wavecad.model.output.OutputConnection;

public class InputConnection {

  private OutputConnection connectedOutput;

  public InputConnection(OutputConnection connectedOutput) {
    this.connectedOutput = connectedOutput;
  }

  public Float requestData(Long timestamp) {
    return connectedOutput.gatherData(timestamp);
  }

}
