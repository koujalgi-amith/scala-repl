package com.amithkoujalgi.scala

import scala.tools.nsc.Settings

object Main {

  def main(args: Array[String]) {
    val settings = new Settings()
    settings.usejavacp.value = true
    val l = new MyInterpreterLoop
    l.init()
    l.process(settings)
  }
}