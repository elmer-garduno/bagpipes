package edu.cmu.lti.oaqa.bagpipes.executor

import edu.cmu.lti.oaqa.bagpipes.configuration.Descriptors.AtomicExecutableConf

//case class Input(inputNum: Int, input: I)
case class Trace(inputNum: Int, componentTrace: Stream[AtomicExecutableConf]) {
  def ++(execDesc: AtomicExecutableConf): Trace = Trace(inputNum, componentTrace #::: Stream(execDesc))
  def getInputNum: Int = inputNum
  def getTraceList: List[AtomicExecutableConf] = componentTrace.toList
  override def toString: String = "Input #: " + inputNum + "\nTrace: " + componentTrace.toList
}
