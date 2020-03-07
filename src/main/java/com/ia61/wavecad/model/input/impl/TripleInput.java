package com.ia61.wavecad.model.input.impl;

import com.ia61.wavecad.model.input.Input;
import com.ia61.wavecad.model.input.InputConnection;
import com.ia61.wavecad.model.output.impl.SingleOutput;
import lombok.Getter;

@Getter
public abstract class TripleInput implements Input {

  private InputConnection firstInput;
  private InputConnection secondInput;
  private InputConnection thirdInput;

  public void connectFirstInput(SingleOutput singleOutput){
    firstInput = getConnection(singleOutput);
  }

  public void connectSecondInput(SingleOutput singleOutput){
    secondInput = getConnection(singleOutput);
  }

  public void connectThirdInput(SingleOutput singleOutput){
    thirdInput = getConnection(singleOutput);
  }

  @Override
  public int getInputCount() {
    return 3;
  }

}
