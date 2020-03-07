package com.ia61.wavecad.model.input;

import com.ia61.wavecad.model.output.impl.SingleOutput;

import java.util.Objects;

public interface Input {

  default InputConnection getConnection(SingleOutput singleOutput) {
    if (Objects.nonNull(singleOutput)) {
      return new InputConnection(singleOutput.getFirstOutput());
    }
    return null;
  }

  int getInputCount();

}
