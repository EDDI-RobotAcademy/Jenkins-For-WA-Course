package com.example.demo;

import com.example.demo.fortest.ScoreCollection;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
class DemoApplicationTests {

	@Test public void airthmeticMeanOfTwoNumberTest () {
		ScoreCollection collection = new ScoreCollection();
		collection.add(() -> 5);
		collection.add(() -> 7);
		int result = collection.arithmeticMean();
		assertThat(result, equalTo(6));
	}
	@Test
	void contextLoads() {
	}

}
