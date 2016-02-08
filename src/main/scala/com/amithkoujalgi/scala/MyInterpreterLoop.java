package com.amithkoujalgi.scala;

import scala.tools.nsc.interpreter.ILoop;
import scala.tools.nsc.interpreter.InteractiveReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by dev on 06/02/16.
 */
public class MyInterpreterLoop extends ILoop {

	PrintWriter printWriter = null;

	public void init()
	{
		File file = new File("./out.txt");
		file.getParentFile().mkdirs();
		try
		{
			printWriter = new PrintWriter(file);
		}
		catch( FileNotFoundException e )
		{
			e.printStackTrace();
		}
	}

	@Override public LoopCommand$ LoopCommand()
	{
		return super.LoopCommand();
	}

	@Override public void printWelcome()
	{
		System.out.println("Hello. This is a custom Scala REPL\n");
	}

	@Override public PrintWriter out()
	{
		printWriter.flush();
		PrintWriter printWriter = new PrintWriter(System.err);
		return printWriter;
	}

	@Override public InteractiveReader in()
	{
		InteractiveReader i;
		return super.in();
	}

	@Override public boolean processLine( String line )
	{
		return super.processLine(line);
	}
}