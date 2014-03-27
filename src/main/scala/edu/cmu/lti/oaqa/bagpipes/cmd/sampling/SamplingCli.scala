package edu.cmu.lti.oaqa.bagpipes.cmd.sampling

import edu.cmu.lti.oaqa.bagpipes.configuration.YAMLParser
import edu.cmu.lti.oaqa.bagpipes.configuration.Descriptors._
import edu.cmu.lti.oaqa.bagpipes.space.ConfigurationSpace

object SamplingCli {

  def main(args: Array[String]): Unit = {
    val parser = YAMLParser(Some(args(0)))
    val configuration = parser.parse(args(1), true)
    val pipeline = configuration.pipeline
    println(pipeline)
    val space = ConfigurationSpace(configuration)
    println(s"Space: ${space.getSpace}")
    println(s"Children: ${space.getSpace.getChildren}")
  }

}