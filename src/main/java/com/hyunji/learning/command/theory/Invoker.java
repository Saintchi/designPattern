package com.hyunji.learning.command.theory;

public class Invoker {
	private Command command = null;

	public Command getCommand() {
		return command;
	}

	public void setCommand(final Command command) {
		this.command = command;
	}

	public void runCommand() {
		this.command.execute();
	}
}
