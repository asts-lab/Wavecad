package com.ia61.wavecad.model.output.impl;

import com.ia61.wavecad.model.output.Output;

public interface NoOutput extends Output {

  default int getOutputCount() {
    return 0;
  }

}
