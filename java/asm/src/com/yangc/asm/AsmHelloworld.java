package com.yangc.asm;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

public class AsmHelloworld extends ClassLoader implements Opcodes {

	private static final String className = "com.yangc.asm.Example";

	@SuppressWarnings("unchecked")
	public static void main(final String args[]) throws IOException,
			IllegalArgumentException, SecurityException,
			IllegalAccessException, InvocationTargetException,
			InterruptedException {

		while (true) {
			ClassReader cr = new ClassReader(className);

			ClassWriter cw = new ClassWriter(0);
			cr.accept(cw, 0);

			byte[] code = cw.toByteArray();

			AsmHelloworld loader = new AsmHelloworld();
			Class<Example> exampleClass = (Class<Example>) loader.defineClass(
					className, code, 0, code.length);
			exampleClass.getMethods()[0].invoke(null, new Object[] { null });

			Thread.sleep(10000L);
		}
	}
}