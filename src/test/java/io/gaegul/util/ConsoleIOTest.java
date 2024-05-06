package io.gaegul.util;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

/**
 * 콘솔 출력 문자열 테스트 헬퍼 클래스
 */
public abstract class ConsoleIOTest {

	private ByteArrayOutputStream outputStreamCaptor;
	private PrintStream standardOut; // 표준 스트림

	@BeforeEach
	void setUp() {
		standardOut = System.out; // 표준 스트림 초기화
		outputStreamCaptor = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@AfterEach
	protected void printResult() {
		System.setOut(standardOut); // 표준 스트림 할당
		System.out.println(output()); // 원하는 내용이 잘 나왔는지 문자열 디코딩 바이트를 가져와 출력
	}

	protected String output() {
		return outputStreamCaptor.toString().trim();
	}
}
