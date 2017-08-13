package com.hyunji.learning.command.theory;

public class ConcreteCommand implements Command {
	private Receiver receive = null;

	//private String status;

	public ConcreteCommand(final Receiver receive) {
		this.receive = receive;
	}

	@Override
	public void execute() {
		this.receive.action();
	}

}
