package com.ia61.wavecad.module.impl.signal_generator;

import com.ia61.wavecad.model.input.impl.NoInput;
import com.ia61.wavecad.model.output.impl.SingleOutput;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractSignalGeneratorModule extends NoInput implements SignalGenerator, SingleOutput {

}
