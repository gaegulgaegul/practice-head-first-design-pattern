package io.gaegul.ch05;

import java.util.concurrent.CompletableFuture;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayName("싱글턴 패턴 테스트")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ChocolateBoilerTest {

	@Test
	void 멀티스레딩_동기화_테스트() {
		CompletableFuture<Void> future1 = CompletableFuture.runAsync(ChocolateBoilerTest::executeChocolateBoiler);
		CompletableFuture<Void> future2 = CompletableFuture.runAsync(ChocolateBoilerTest::executeChocolateBoiler);
		CompletableFuture.allOf(future1, future2);
	}

	private static void executeChocolateBoiler() {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();
	}
}