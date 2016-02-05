package com.amithkoujalgi.scala.test;

import scala.tools.nsc.Settings;
import scala.tools.nsc.interpreter.ILoop;

public class Main {
	public static void main(String[] args) throws Exception {
		MyInterpreterLoop l = new MyInterpreterLoop();
		Settings s = new Settings();
		s.BooleanSetting("settings.usejavacp.value", "true");
		l.process(s);
	}

}

class MyInterpreterLoop extends ILoop {
	@Override
	public LoopCommand$ LoopCommand() {
		return super.LoopCommand();
	}
}