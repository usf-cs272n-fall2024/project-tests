package edu.usfca.cs272.tests;

import static edu.usfca.cs272.tests.ThreadBuildTests.timeIndexOneMany;
import static edu.usfca.cs272.tests.ThreadBuildTests.timeIndexSingleMulti;
import static edu.usfca.cs272.tests.ThreadSearchTests.timeSearchOneMany;
import static edu.usfca.cs272.tests.ThreadSearchTests.timeSearchSingleMulti;

import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

import edu.usfca.cs272.tests.utils.ProjectBenchmarks;

/**
 * A benchmark suite for project v3. Meant to be run by GitHub Actions only.
 *
 * @author CS 272 Software Development (University of San Francisco)
 * @version Fall 2024
 */
@TestClassOrder(ClassOrderer.OrderAnnotation.class)
@EnabledIfSystemProperty(named = "GITHUB_ACTIONS", matches = "(?i)true")
public class ThreadTimedTests extends ProjectBenchmarks {
	/**
	 * Tests specific to multithreading.
	 *
	 * THESE ARE SLOW TESTS. AVOID RUNNING UNLESS REALLY NEEDED.
	 */
	@Nested
	@Order(1)
	@TestMethodOrder(OrderAnnotation.class)
	public class IndexBenchmarks {
		/**
		 * See the JUnit output for test details.
		 */
		@Test
		@Order(1)
		@Tag("time-v3.1")
		@Tag("time-v3.2")
		public void okayIndexOneMany() {
			timeIndexOneMany(MIN_SPEEDUP);
		}

		/**
		 * See the JUnit output for test details.
		 */
		@Test
		@Order(2)
		@Tag("time-v3.1")
		@Tag("time-v3.2")
		public void okayIndexSingleMulti() {
			timeIndexSingleMulti(MIN_SPEEDUP);
		}

		/**
		 * See the JUnit output for test details.
		 */
		@Test
		@Order(1)
		@Tag("time-v3.3")
		public void goodIndexOneMany() {
			timeIndexOneMany(MOD_SPEEDUP);
		}

		/**
		 * See the JUnit output for test details.
		 */
		@Test
		@Order(2)
		@Tag("time-v3.3")
		public void goodIndexSingleMulti() {
			timeIndexSingleMulti(MOD_SPEEDUP);
		}

		/**
		 * See the JUnit output for test details.
		 */
		@Test
		@Order(3)
		@Tag("time-v3.4")
		public void fastIndexOneMany() {
			timeIndexOneMany(MAX_SPEEDUP);
		}

		/**
		 * See the JUnit output for test details.
		 */
		@Test
		@Order(4)
		@Tag("time-v3.4")
		public void fastSingleMulti() {
			timeIndexSingleMulti(MAX_SPEEDUP);
		}
	}

	/**
	 * Tests specific to multithreading.
	 *
	 * THESE ARE SLOW TESTS. AVOID RUNNING UNLESS REALLY NEEDED.
	 */
	@Nested
	@Order(2)
	@TestMethodOrder(OrderAnnotation.class)
	public class SearchBenchmarks {
		/**
		 * See the JUnit output for test details.
		 */
		@Test
		@Order(1)
		@Tag("time-v3.1")
		@Tag("time-v3.2")
		public void okaySearchOneMany() {
			timeSearchOneMany(MIN_SPEEDUP);
		}

		/**
		 * See the JUnit output for test details.
		 */
		@Test
		@Order(2)
		@Tag("time-v3.1")
		@Tag("time-v3.2")
		public void okaySearchSingleMulti() {
			timeSearchSingleMulti(MIN_SPEEDUP);
		}

		/**
		 * See the JUnit output for test details.
		 */
		@Test
		@Order(1)
		@Tag("time-v3.3")
		public void goodSearchOneMany() {
			timeSearchOneMany(MOD_SPEEDUP);
		}

		/**
		 * See the JUnit output for test details.
		 */
		@Test
		@Order(2)
		@Tag("time-v3.3")
		public void goodSearchSingleMulti() {
			timeSearchSingleMulti(MOD_SPEEDUP);
		}

		/**
		 * See the JUnit output for test details.
		 */
		@Test
		@Order(3)
		@Tag("time-v3.4")
		public void fastSearchOneMany() {
			timeSearchOneMany(MAX_SPEEDUP);
		}

		/**
		 * See the JUnit output for test details.
		 */
		@Test
		@Order(4)
		@Tag("time-v3.4")
		@Tag("time-v4.0")
		@Tag("time-v4.1")
		@Tag("time-v4.2")
		@Tag("time-v5.0")
		@Tag("time-v5.1")
		public void fastSearchSingleMulti() {
			timeSearchSingleMulti(MAX_SPEEDUP);
		}
	}
}
