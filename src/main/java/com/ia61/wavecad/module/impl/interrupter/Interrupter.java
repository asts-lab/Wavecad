package com.ia61.wavecad.module.impl.interrupter;

import com.ia61.wavecad.module.Module;

public interface Interrupter extends Module {

  void interruptAll(Long timestamp);

}
