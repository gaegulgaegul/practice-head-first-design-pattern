package io.gaegul.utils

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import java.io.ByteArrayOutputStream
import java.io.PrintStream

/**
 * 콘솔 출력 문자열 테스트 헬퍼 클래스
 */
abstract class ConsoleIOTest {
    lateinit var outputStreamCaptor: ByteArrayOutputStream
    lateinit var standardOut: PrintStream // 표준 스트림 초기화

    @BeforeEach
    fun setUp() {
        /* 표준 스트림 초기화 */
        standardOut = System.out
        outputStreamCaptor = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStreamCaptor))
    }

    @AfterEach
    fun tearDown() {
        /* 표준 스트림 할당 */
        System.setOut(standardOut)
        /* 원하는 내용이 잘 나왔는지 문자열 디코딩 바이트를 가져와 출력 */
        println(output())
    }

    fun output(): String {
        return outputStreamCaptor.toString().trim()
    }
}