package com.ia61.wavecad.model.output.impl;

import com.ia61.wavecad.model.output.Output;
import com.ia61.wavecad.model.output.OutputConnection;

public interface SingleOutput extends Output {

  Float getDataToFirstOutput(Long timestamp);

  default int getOutputCount() {
    return 1;
  }

  default OutputConnection getFirstOutput() {
    return this::getDataToFirstOutput;
  }

}
