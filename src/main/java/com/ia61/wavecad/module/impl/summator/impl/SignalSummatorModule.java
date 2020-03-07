package com.ia61.wavecad.module.impl.summator.impl;

import com.ia61.wavecad.model.input.impl.MultiInput;
import com.ia61.wavecad.model.output.impl.SingleOutput;
import com.ia61.wavecad.module.impl.summator.Summator;

public class SignalSummatorModule extends MultiInput implements Summator, SingleOutput {

  @Override
  public Float getDataToFirstOutput(Long timestamp) {
    return (float) getInputList().stream()
        .mapToDouble(input -> input.requestData(timestamp))
        .sum();
  }

  @Override
  public String getModuleName() {
    return "Signal Summator";
  }
}
