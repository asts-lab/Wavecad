package com.ia61.wavecad.module.impl.interrupter.impl;

import com.ia61.wavecad.module.impl.correlator.impl.CorrelatorModule;
import com.ia61.wavecad.module.impl.interrupter.AbstractInterrupter;

public class CorrelatorInterrupterModule extends AbstractInterrupter<CorrelatorModule> {

  @Override
  public String getModuleName() {
    return "Correlator Interrupter";
  }

}
