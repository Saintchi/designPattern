package com.hyunji.learning.command.theory;

public class Client {
	public static void assemble() {
		final Receiver receiver = new Receiver();
		final Command command = new ConcreteCommand(receiver);
		final Invoker invoker = new Invoker();
		invoker.setCommand(command);
		invoker.runCommand();
	}

	public static void main(final String[] args) {
		assemble();
	}
}
