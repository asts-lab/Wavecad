package com.ia61.wavecad.module.impl.signal_generator.impl;

import com.ia61.wavecad.module.impl.signal_generator.AbstractSignalGeneratorModule;
import com.ia61.wavecad.util.NumberUtil;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoiseSignalGeneratorModule extends AbstractSignalGeneratorModule {

  public Float upperBound = 1f;
  public Float lowerBound = 0f;

  @Override
  public Float getDataToFirstOutput(Long timestamp) {
    return NumberUtil.random(lowerBound, upperBound);
  }

  @Override
  public String getModuleName() {
    return "Noise Signal Generator";
  }
}
