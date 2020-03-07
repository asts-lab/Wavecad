package com.ia61.wavecad.module;

import com.ia61.wavecad.model.input.Input;
import com.ia61.wavecad.model.output.Output;

public interface Module extends Input, Output {

  String getModuleName();

}
