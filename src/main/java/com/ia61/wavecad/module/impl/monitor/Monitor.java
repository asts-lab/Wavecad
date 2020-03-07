package com.ia61.wavecad.module.impl.monitor;

import com.ia61.wavecad.module.Module;

public interface Monitor extends Module {

  void gatherAllInputs(Long timestamp);

  void resetResult();

}
