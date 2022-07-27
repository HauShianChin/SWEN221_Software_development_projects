package simplechess.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import simplechess.Game;
import simplechess.util.Round;

public class SimplifiedChessTests {
	// ==============================================================
	// Part 1 --- Getting Started
	// ==============================================================

	public @Test void test_01() {
		// This is a valid test
		String input = "e2-e3";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|P|_|_|_|\n"+
				"2|P|P|P|P|_|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
		//
	}

	public @Test void test_02() {
		// This is a valid test
		String input = "e2-e3 e6-e5; Bf1-d3";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|_|p|p|p|\n"+
				"5|_|_|_|_|p|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|B|P|_|_|_|\n"+
				"2|P|P|P|P|_|P|P|P|\n"+
				"1|R|N|B|Q|K|_|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_03() {
		// This is a valid test
		String input = "d2-d3 d6-d5; Bc1-e3";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|_|p|p|p|p|\n"+
				"5|_|_|_|p|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|P|B|_|_|_|\n"+
				"2|P|P|P|_|P|P|P|P|\n"+
				"1|R|N|_|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_04() {
		// This is a valid test
		String input = "e2-e3 e6-e5; Bf1-d3 Bf7-d5";
		// Define the expected output
		String expected =
				 "7|r|n|b|q|k|_|n|r|\n"+
				 "6|p|p|p|p|_|p|p|p|\n"+
				 "5|_|_|_|b|p|_|_|_|\n"+
				 "4|_|_|_|_|_|_|_|_|\n"+
				 "3|_|_|_|B|P|_|_|_|\n"+
				 "2|P|P|P|P|_|P|P|P|\n"+
				 "1|R|N|B|Q|K|_|N|R|\n"+
				 "  a b c d e f g h";

		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_05() {
		// This is a valid test
		String input = "d2-d3 d6-d5; Bc1-e3 Bc7-e5";
		// Define the expected output
		String expected =
				"7|r|n|_|q|k|b|n|r|\n"+
				"6|p|p|p|_|p|p|p|p|\n"+
				"5|_|_|_|p|b|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|P|B|_|_|_|\n"+
				"2|P|P|P|_|P|P|P|P|\n"+
				"1|R|N|_|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_06() {
		// This is a valid test
		String input = "e2-e3 f6-f5; Bf1-d3 g6-g5; Bd3xf5";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|_|_|p|\n"+
				"5|_|_|_|_|_|B|p|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|P|_|_|_|\n"+
				"2|P|P|P|P|_|P|P|P|\n"+
				"1|R|N|B|Q|K|_|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_07() {
		// This is a valid test
		String input = "c2-c3 e6-e5; c3-c4 Bf7xc4";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|_|n|r|\n"+
				"6|p|p|p|p|_|p|p|p|\n"+
				"5|_|_|_|_|p|_|_|_|\n"+
				"4|_|_|b|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|_|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_08() {
		// This is a valid test
		String input = "f2-f3 e6-e5; g2-g3 Bf7-c4; Nb1-c3 Bc4xe2";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|_|n|r|\n"+
				"6|p|p|p|p|_|p|p|p|\n"+
				"5|_|_|_|_|p|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|N|_|_|P|P|_|\n"+
				"2|P|P|P|P|b|_|_|P|\n"+
				"1|R|_|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_09() {
		// This is a valid test
		String input = "e2-e3 e6-e5; Bf1-b5 Bf7-b3; Bb5xa6 Bb3xa2";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|_|n|r|\n"+
				"6|B|p|p|p|_|p|p|p|\n"+
				"5|_|_|_|_|p|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|P|_|_|_|\n"+
				"2|b|P|P|P|_|P|P|P|\n"+
				"1|R|N|B|Q|K|_|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_10() {
		// This is a valid test
		String input = "Nb1-c3";
		// Define the expected output
		String expected =
			"7|r|n|b|q|k|b|n|r|\n"+
			"6|p|p|p|p|p|p|p|p|\n"+
			"5|_|_|_|_|_|_|_|_|\n"+
			"4|_|_|_|_|_|_|_|_|\n"+
			"3|_|_|N|_|_|_|_|_|\n"+
			"2|P|P|P|P|P|P|P|P|\n"+
			"1|R|_|B|Q|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_11() {
		// This is a valid test
		String input = "Nb1-c3 Ng7-f5";
		// Define the expected output
		String expected =
			"7|r|n|b|q|k|b|_|r|\n"+
			"6|p|p|p|p|p|p|p|p|\n"+
			"5|_|_|_|_|_|n|_|_|\n"+
			"4|_|_|_|_|_|_|_|_|\n"+
			"3|_|_|N|_|_|_|_|_|\n"+
			"2|P|P|P|P|P|P|P|P|\n"+
			"1|R|_|B|Q|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_12() {
		// This is a valid test
		String input = "Ng1-f3 Ng7-f5; Nf3-d4";
		// Define the expected output
		String expected =
			"7|r|n|b|q|k|b|_|r|\n"+
			"6|p|p|p|p|p|p|p|p|\n"+
			"5|_|_|_|_|_|n|_|_|\n"+
			"4|_|_|_|N|_|_|_|_|\n"+
			"3|_|_|_|_|_|_|_|_|\n"+
			"2|P|P|P|P|P|P|P|P|\n"+
			"1|R|N|B|Q|K|B|_|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_13() {
		// This is a valid test
		String input = "Ng1-f3 Ng7-f5; c2-c3 Nf5-e3";
		// Define the expected output
		String expected =
			"7|r|n|b|q|k|b|_|r|\n"+
			"6|p|p|p|p|p|p|p|p|\n"+
			"5|_|_|_|_|_|_|_|_|\n"+
			"4|_|_|_|_|_|_|_|_|\n"+
			"3|_|_|P|_|n|N|_|_|\n"+
			"2|P|P|_|P|P|P|P|P|\n"+
			"1|R|N|B|Q|K|B|_|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_14() {
		// This is a valid test
		String input = "Nb1-c3 d6-d5; Nc3xd5";
		// Define the expected output
		String expected =
			"7|r|n|b|q|k|b|n|r|\n"+
			"6|p|p|p|_|p|p|p|p|\n"+
			"5|_|_|_|N|_|_|_|_|\n"+
			"4|_|_|_|_|_|_|_|_|\n"+
			"3|_|_|_|_|_|_|_|_|\n"+
			"2|P|P|P|P|P|P|P|P|\n"+
			"1|R|_|B|Q|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_15() {
		// This is a valid test
		String input = "d2-d3 Nb7-c5; Ng1-f3 Nc5xd3";
		// Define the expected output
		String expected =
			"7|r|_|b|q|k|b|n|r|\n"+
			"6|p|p|p|p|p|p|p|p|\n"+
			"5|_|_|_|_|_|_|_|_|\n"+
			"4|_|_|_|_|_|_|_|_|\n"+
			"3|_|_|_|n|_|N|_|_|\n"+
			"2|P|P|P|_|P|P|P|P|\n"+
			"1|R|N|B|Q|K|B|_|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_16() {
		// This is a valid test
		String input = "d2-d3 Nb7-c5; Nb1-c3 Nc5-e4; Nc3xe4";
		// Define the expected output
		String expected =
			"7|r|_|b|q|k|b|n|r|\n"+
			"6|p|p|p|p|p|p|p|p|\n"+
			"5|_|_|_|_|_|_|_|_|\n"+
			"4|_|_|_|_|N|_|_|_|\n"+
			"3|_|_|_|P|_|_|_|_|\n"+
			"2|P|P|P|_|P|P|P|P|\n"+
			"1|R|_|B|Q|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_17() {
		// This is a valid test
		String input = "Nb1-c3 a6-a5; Nc3-d5 a5-a4; Nd5xf6";
		// Define the expected output
		String expected =
			"7|r|n|b|q|k|b|n|r|\n"+
			"6|_|p|p|p|p|N|p|p|\n"+
			"5|_|_|_|_|_|_|_|_|\n"+
			"4|p|_|_|_|_|_|_|_|\n"+
			"3|_|_|_|_|_|_|_|_|\n"+
			"2|P|P|P|P|P|P|P|P|\n"+
			"1|R|_|B|Q|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_18() {
		// This is a valid test
		String input = "e2-e3 d6-d5; Ke1-e2";
		// Define the expected output
		String expected =
			"7|r|n|b|q|k|b|n|r|\n"+
			"6|p|p|p|_|p|p|p|p|\n"+
			"5|_|_|_|p|_|_|_|_|\n"+
			"4|_|_|_|_|_|_|_|_|\n"+
			"3|_|_|_|_|P|_|_|_|\n"+
			"2|P|P|P|P|K|P|P|P|\n"+
			"1|R|N|B|Q|_|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_19() {
		// This is a valid test
		String input = "e2-e3 d6-d5; e3-e4 d5xe4; Ke1-e2";
		// Define the expected output
		String expected =
			"7|r|n|b|q|k|b|n|r|\n"+
			"6|p|p|p|_|p|p|p|p|\n"+
			"5|_|_|_|_|_|_|_|_|\n"+
			"4|_|_|_|_|p|_|_|_|\n"+
			"3|_|_|_|_|_|_|_|_|\n"+
			"2|P|P|P|P|K|P|P|P|\n"+
			"1|R|N|B|Q|_|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_20() {
		// This is a valid test
		String input = "e2-e3 d6-d5; Bf1-d3 Ke7-d6";
		// Define the expected output
		String expected =
			"7|r|n|b|q|_|b|n|r|\n"+
			"6|p|p|p|k|p|p|p|p|\n"+
			"5|_|_|_|p|_|_|_|_|\n"+
			"4|_|_|_|_|_|_|_|_|\n"+
			"3|_|_|_|B|P|_|_|_|\n"+
			"2|P|P|P|P|_|P|P|P|\n"+
			"1|R|N|B|Q|K|_|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_21() {
		// This is a valid test
		String input = "e2-e3 d6-d5; e3-e4 Qd7-d6; e4xd5 Ke7-d7";
		// Define the expected output
		String expected =
			"7|r|n|b|k|_|b|n|r|\n"+
			"6|p|p|p|q|p|p|p|p|\n"+
			"5|_|_|_|P|_|_|_|_|\n"+
			"4|_|_|_|_|_|_|_|_|\n"+
			"3|_|_|_|_|_|_|_|_|\n"+
			"2|P|P|P|P|_|P|P|P|\n"+
			"1|R|N|B|Q|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_22() {
		// This is a valid test
		String input = "a2-a3";
		// Define the expected output
		String expected =
			"7|r|n|b|q|k|b|n|r|\n"+
			"6|p|p|p|p|p|p|p|p|\n"+
			"5|_|_|_|_|_|_|_|_|\n"+
			"4|_|_|_|_|_|_|_|_|\n"+
			"3|P|_|_|_|_|_|_|_|\n"+
			"2|_|P|P|P|P|P|P|P|\n"+
			"1|R|N|B|Q|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_23() {
		// This is a valid test
		String input = "h2-h3 e6-e5";
		// Define the expected output
		String expected =
			"7|r|n|b|q|k|b|n|r|\n"+
			"6|p|p|p|p|_|p|p|p|\n"+
			"5|_|_|_|_|p|_|_|_|\n"+
			"4|_|_|_|_|_|_|_|_|\n"+
			"3|_|_|_|_|_|_|_|P|\n"+
			"2|P|P|P|P|P|P|P|_|\n"+
			"1|R|N|B|Q|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_24() {
		// This is a valid test
		String input = "h2-h3 e6-e5; h3-h4 e5-e4";
		// Define the expected output
		String expected =
			"7|r|n|b|q|k|b|n|r|\n"+
			"6|p|p|p|p|_|p|p|p|\n"+
			"5|_|_|_|_|_|_|_|_|\n"+
			"4|_|_|_|_|p|_|_|P|\n"+
			"3|_|_|_|_|_|_|_|_|\n"+
			"2|P|P|P|P|P|P|P|_|\n"+
			"1|R|N|B|Q|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_25() {
		// This is a valid test
		String input = "d2-d3 e6-e5; e2-e3 d6-d5; c2-c3";
		// Define the expected output
		String expected =
			"7|r|n|b|q|k|b|n|r|\n"+
			"6|p|p|p|_|_|p|p|p|\n"+
			"5|_|_|_|p|p|_|_|_|\n"+
			"4|_|_|_|_|_|_|_|_|\n"+
			"3|_|_|P|P|P|_|_|_|\n"+
			"2|P|P|_|_|_|P|P|P|\n"+
			"1|R|N|B|Q|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_26() {
		// This is a valid test
		String input = "d2-d3 e6-e5; d3-d4 e5xd4";
		// Define the expected output
		String expected =
			"7|r|n|b|q|k|b|n|r|\n"+
			"6|p|p|p|p|_|p|p|p|\n"+
			"5|_|_|_|_|_|_|_|_|\n"+
			"4|_|_|_|p|_|_|_|_|\n"+
			"3|_|_|_|_|_|_|_|_|\n"+
			"2|P|P|P|_|P|P|P|P|\n"+
			"1|R|N|B|Q|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_27() {
		// This is a valid test
		String input = "d2-d3 c6-c5; e2-e3 c5-c4; d3xc4";
		// Define the expected output
		String expected =
			"7|r|n|b|q|k|b|n|r|\n"+
			"6|p|p|_|p|p|p|p|p|\n"+
			"5|_|_|_|_|_|_|_|_|\n"+
			"4|_|_|P|_|_|_|_|_|\n"+
			"3|_|_|_|_|P|_|_|_|\n"+
			"2|P|P|P|_|_|P|P|P|\n"+
			"1|R|N|B|Q|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_28() {
		// This is a valid test
		String input = "d2-d3 e6-e5; d3-d4 e5xd4";
		// Define the expected output
		String expected =
			"7|r|n|b|q|k|b|n|r|\n"+
			"6|p|p|p|p|_|p|p|p|\n"+
			"5|_|_|_|_|_|_|_|_|\n"+
			"4|_|_|_|p|_|_|_|_|\n"+
			"3|_|_|_|_|_|_|_|_|\n"+
			"2|P|P|P|_|P|P|P|P|\n"+
			"1|R|N|B|Q|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_29() {
		// This is a valid test
		String input = "d2-d3 c6-c5; d3-d4 c5xd4";
		// Define the expected output
		String expected =
			"7|r|n|b|q|k|b|n|r|\n"+
			"6|p|p|_|p|p|p|p|p|\n"+
			"5|_|_|_|_|_|_|_|_|\n"+
			"4|_|_|_|p|_|_|_|_|\n"+
			"3|_|_|_|_|_|_|_|_|\n"+
			"2|P|P|P|_|P|P|P|P|\n"+
			"1|R|N|B|Q|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_30() {
		// This is a valid test
		String input = "e2-e3 d6-d5; Qd1-g4";
		// Define the expected output
		String expected =
			"7|r|n|b|q|k|b|n|r|\n"+
			"6|p|p|p|_|p|p|p|p|\n"+
			"5|_|_|_|p|_|_|_|_|\n"+
			"4|_|_|_|_|_|_|Q|_|\n"+
			"3|_|_|_|_|P|_|_|_|\n"+
			"2|P|P|P|P|_|P|P|P|\n"+
			"1|R|N|B|_|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_31() {
		// This is a valid test
		String input = "e2-e3 d6-d5; Qd1-g4 Qd7-d6";
		// Define the expected output
		String expected =
			"7|r|n|b|_|k|b|n|r|\n"+
			"6|p|p|p|q|p|p|p|p|\n"+
			"5|_|_|_|p|_|_|_|_|\n"+
			"4|_|_|_|_|_|_|Q|_|\n"+
			"3|_|_|_|_|P|_|_|_|\n"+
			"2|P|P|P|P|_|P|P|P|\n"+
			"1|R|N|B|_|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_32() {
		// This is a valid test
		String input = "e2-e3 d6-d5; Qd1-g4 Qd7-d6; Qg4-f5";
		// Define the expected output
		String expected =
			"7|r|n|b|_|k|b|n|r|\n"+
			"6|p|p|p|q|p|p|p|p|\n"+
			"5|_|_|_|p|_|Q|_|_|\n"+
			"4|_|_|_|_|_|_|_|_|\n"+
			"3|_|_|_|_|P|_|_|_|\n"+
			"2|P|P|P|P|_|P|P|P|\n"+
			"1|R|N|B|_|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_33() {
		// This is a valid test
		String input = "d2-d3 e6-e5; Qd1-d2 Qd7-f5; Qd2-e3";
		// Define the expected output
		String expected =
			"7|r|n|b|_|k|b|n|r|\n"+
			"6|p|p|p|p|_|p|p|p|\n"+
			"5|_|_|_|_|p|q|_|_|\n"+
			"4|_|_|_|_|_|_|_|_|\n"+
			"3|_|_|_|P|Q|_|_|_|\n"+
			"2|P|P|P|_|P|P|P|P|\n"+
			"1|R|N|B|_|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_34() {
		// This is a valid test
		String input = "e2-e3 d6-d5; Qd1-g4 Qd7-d6; Qg4xg6";
		// Define the expected output
		String expected =
			"7|r|n|b|_|k|b|n|r|\n"+
			"6|p|p|p|q|p|p|Q|p|\n"+
			"5|_|_|_|p|_|_|_|_|\n"+
			"4|_|_|_|_|_|_|_|_|\n"+
			"3|_|_|_|_|P|_|_|_|\n"+
			"2|P|P|P|P|_|P|P|P|\n"+
			"1|R|N|B|_|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_35() {
		// This is a valid test
		String input = "e2-e3 d6-d5; Qd1-g4 Qd7-d6; Qg4xg6 Qd6-a3; Qg6xh7";
		// Define the expected output
		String expected =
			"7|r|n|b|_|k|b|n|Q|\n"+
			"6|p|p|p|_|p|p|_|p|\n"+
			"5|_|_|_|p|_|_|_|_|\n"+
			"4|_|_|_|_|_|_|_|_|\n"+
			"3|q|_|_|_|P|_|_|_|\n"+
			"2|P|P|P|P|_|P|P|P|\n"+
			"1|R|N|B|_|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_36() {
		// This is a valid test
		String input = "e2-e3 d6-d5; Qd1-g4 Qd7-d6; Qg4xg6 Qd6-a3; Qg6xh7 Qa3xa2";
		// Define the expected output
		String expected =
			"7|r|n|b|_|k|b|n|Q|\n"+
			"6|p|p|p|_|p|p|_|p|\n"+
			"5|_|_|_|p|_|_|_|_|\n"+
			"4|_|_|_|_|_|_|_|_|\n"+
			"3|_|_|_|_|P|_|_|_|\n"+
			"2|q|P|P|P|_|P|P|P|\n"+
			"1|R|N|B|_|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_37() {
		// This is a valid test
		String input = "e2-e3 d6-d5; Qd1-g4 Qd7-d6; Qg4xg6 Qd6-a3; Qg6xh7 Qa3xa2; Qh7xg7";
		// Define the expected output
		String expected =
			"7|r|n|b|_|k|b|Q|_|\n"+
			"6|p|p|p|_|p|p|_|p|\n"+
			"5|_|_|_|p|_|_|_|_|\n"+
			"4|_|_|_|_|_|_|_|_|\n"+
			"3|_|_|_|_|P|_|_|_|\n"+
			"2|q|P|P|P|_|P|P|P|\n"+
			"1|R|N|B|_|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_38() {
		// This is a valid test
		String input = "a2-a3 a6-a5; Ra1-a2";
		// Define the expected output
		String expected =
			"7|r|n|b|q|k|b|n|r|\n"+
			"6|_|p|p|p|p|p|p|p|\n"+
			"5|p|_|_|_|_|_|_|_|\n"+
			"4|_|_|_|_|_|_|_|_|\n"+
			"3|P|_|_|_|_|_|_|_|\n"+
			"2|R|P|P|P|P|P|P|P|\n"+
			"1|_|N|B|Q|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_39() {
		// This is a valid test
		String input = "a2-a3 h6-h5; a3-a4 h5-h4; Ra1-a3 Rh7-h5";
		// Define the expected output
		String expected =
			"7|r|n|b|q|k|b|n|_|\n"+
			"6|p|p|p|p|p|p|p|_|\n"+
			"5|_|_|_|_|_|_|_|r|\n"+
			"4|P|_|_|_|_|_|_|p|\n"+
			"3|R|_|_|_|_|_|_|_|\n"+
			"2|_|P|P|P|P|P|P|P|\n"+
			"1|_|N|B|Q|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_40() {
		// This is a valid test
		String input = "a2-a3 h6-h5; a3-a4 h5-h4; Ra1-a3 Rh7-h5; Ra3-h3 Rh5-e5";
		// Define the expected output
		String expected =
			"7|r|n|b|q|k|b|n|_|\n"+
			"6|p|p|p|p|p|p|p|_|\n"+
			"5|_|_|_|_|r|_|_|_|\n"+
			"4|P|_|_|_|_|_|_|p|\n"+
			"3|_|_|_|_|_|_|_|R|\n"+
			"2|_|P|P|P|P|P|P|P|\n"+
			"1|_|N|B|Q|K|B|N|R|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_41() {
		// This is a valid test
		String input = "h2-h3 a6-a5; h3-h4 a5-a4; Rh1-h3 Ra7-a5; Rh3-a3 Ra5-e5";
		// Define the expected output
		String expected =
			"7|_|n|b|q|k|b|n|r|\n"+
			"6|_|p|p|p|p|p|p|p|\n"+
			"5|_|_|_|_|r|_|_|_|\n"+
			"4|p|_|_|_|_|_|_|P|\n"+
			"3|R|_|_|_|_|_|_|_|\n"+
			"2|P|P|P|P|P|P|P|_|\n"+
			"1|R|N|B|Q|K|B|N|_|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_42() {
		// This is a valid test
		String input = "h2-h3 a6-a5; h3-h4 a5-a4; Rh1-h3 Ra7-a5; Rh3-a3 Ra5-e5; Ra3xa4";
		// Define the expected output
		String expected =
			"7|_|n|b|q|k|b|n|r|\n"+
			"6|_|p|p|p|p|p|p|p|\n"+
			"5|_|_|_|_|r|_|_|_|\n"+
			"4|R|_|_|_|_|_|_|P|\n"+
			"3|_|_|_|_|_|_|_|_|\n"+
			"2|P|P|P|P|P|P|P|_|\n"+
			"1|R|N|B|Q|K|B|N|_|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_43() {
		// This is a valid test
		String input = "h2-h3 a6-a5; h3-h4 a5-a4; Rh1-h3 Ra7-a5; Rh3-a3 Ra5-e5; Ra3xa4 Re5xe2";
		// Define the expected output
		String expected =
			"7|_|n|b|q|k|b|n|r|\n"+
			"6|_|p|p|p|p|p|p|p|\n"+
			"5|_|_|_|_|_|_|_|_|\n"+
			"4|R|_|_|_|_|_|_|P|\n"+
			"3|_|_|_|_|_|_|_|_|\n"+
			"2|P|P|P|P|r|P|P|_|\n"+
			"1|R|N|B|Q|K|B|N|_|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_44() {
		// This is a valid test
		String input = "h2-h3 g6-g5; h3-h4 g5xh4; Rh1-h3 h6-h5; Rh3-a3 Rh7-h6; Ra3xa6";
		// Define the expected output
		String expected =
			"7|r|n|b|q|k|b|n|_|\n"+
			"6|R|p|p|p|p|p|_|r|\n"+
			"5|_|_|_|_|_|_|_|p|\n"+
			"4|_|_|_|_|_|_|_|p|\n"+
			"3|_|_|_|_|_|_|_|_|\n"+
			"2|P|P|P|P|P|P|P|_|\n"+
			"1|R|N|B|Q|K|B|N|_|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_45() {
		// This is a valid test
		String input = "h2-h3 g6-g5; h3-h4 g5xh4; Rh1-h3 h6-h5; Rh3-a3 Rh7-h6; Ra3xa6 Ra7xa6";
		// Define the expected output
		String expected =
			"7|_|n|b|q|k|b|n|_|\n"+
			"6|r|p|p|p|p|p|_|r|\n"+
			"5|_|_|_|_|_|_|_|p|\n"+
			"4|_|_|_|_|_|_|_|p|\n"+
			"3|_|_|_|_|_|_|_|_|\n"+
			"2|P|P|P|P|P|P|P|_|\n"+
			"1|R|N|B|Q|K|B|N|_|\n"+
			"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	// ==============================================================
	// Part 2 --- Invalid Pawn, King and Knight Moves.
	// ==============================================================

	public @Test void test_46() {
		// This is an invalid test. Pawn cannot move two squares at a time.
		String input = "e2-e3 c6-c5; e3-e5";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|_|p|p|p|p|p|\n"+
				"5|_|_|p|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|P|_|_|_|\n"+
				"2|P|P|P|P|_|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_47() {
		// This is an invalid test. Pawn cannot move two squares at a time.
		String input = "e2-e4";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_48() {
		// This is an invalid test. Pawn cannot move in a diagonal direction.
		String input = "e2-e3 e6-e5; e3-d4";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|_|p|p|p|\n"+
				"5|_|_|_|_|p|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|P|_|_|_|\n"+
				"2|P|P|P|P|_|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_49() {
		// This is an invalid test.  Pawn cannot move backwards!
		String input = "e2-e3 e6-e5; e4-e2";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|_|p|p|p|\n"+
				"5|_|_|_|_|p|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|P|_|_|_|\n"+
				"2|P|P|P|P|_|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_50() {
		// This is an invalid test.  Pawn cannot move into occupied square.
		String input = "a2-a3 d6-d5; a3-a4 d5-d4; a4-a5 d4-d3; d2-d3";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|_|p|p|p|p|\n"+
				"5|P|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|p|_|_|_|_|\n"+
				"2|_|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_51() {
		// This is an invalid test.  Pawn cannot move into occupied square.
		String input = "a2-a3 d6-d5; d2-d3 d5-d4; d3-d4";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|_|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|p|_|_|_|_|\n"+
				"3|P|_|_|P|_|_|_|_|\n"+
				"2|_|P|P|_|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_52() {
		// This is an invalid test.  Pawn cannot take in a forwards direction.
		String input = "e2-e3 e6-e5; e3xe5";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|_|p|p|p|\n"+
				"5|_|_|_|_|p|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|P|_|_|_|\n"+
				"2|P|P|P|P|_|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_53() {
		// This is an invalid test. Pawn cannot take in a diagnol direction more than one
		// square away.
		String input = "c2-c3 e6-e5; c3xe5";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|_|p|p|p|\n"+
				"5|_|_|_|_|p|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|P|_|_|_|_|_|\n"+
				"2|P|P|_|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_54() {
		// This is an invalid test. Pawn cannot take arbitrary square on the board.
		String input = "c2-c3 d6-d5; c3xd5";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|_|p|p|p|p|\n"+
				"5|_|_|_|p|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|P|_|_|_|_|_|\n"+
				"2|P|P|_|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_55() {
		// This is an invalid test.  Pawn not in correct position for take.
		String input = "c2-c3 d6-d5; c4xd5";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|_|p|p|p|p|\n"+
				"5|_|_|_|p|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|P|_|_|_|_|_|\n"+
				"2|P|P|_|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_56() {
		// This is an invalid test. Pawn cannot take in horizontal direction.
		String input = "c2-c3 d6-d5; c3-c4 d5-d4; c4xd4";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|_|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|P|p|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|_|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_57() {
		// This is an invalid test. King cannot move through pawn.
		String input = "Ke1-e3";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_58() {
		// This is an invalid test. King cannot move into occupied square.
		String input = "Ke1-e2";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_59() {
		// This is an invalid test. King cannot diagonally into occupied square.
		String input = "Ke1-d2";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_60() {
		// This is an invalid test. King cannot move more than one square at a time (or into occupied square).
		String input = "e2-e3 e6-e5; Ke1-e3";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|_|p|p|p|\n"+
				"5|_|_|_|_|p|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|P|_|_|_|\n"+
				"2|P|P|P|P|_|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_61() {
		// This is an invalid test. King cannot move more than one square at a time.
		String input = "d2-d3 e6-e5; Ke1-c3";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|_|p|p|p|\n"+
				"5|_|_|_|_|p|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|P|_|_|_|_|\n"+
				"2|P|P|P|_|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_62() {
		// This is an invalid test. Attempting to move king from incorrect position.
		String input = "e2-e3 e6-e5; Ke1-e2 e5-e4; Ke1-e2";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|_|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|p|_|_|_|\n"+
				"3|_|_|_|_|P|_|_|_|\n"+
				"2|P|P|P|P|K|P|P|P|\n"+
				"1|R|N|B|Q|_|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_63() {
		// This is an invalid test. King cannot take pawn in arbitrary position.
		String input = "Ke1xe6";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_64() {
		// This is an invalid test. King cannot take own pawn!
		String input = "Ke1xe2";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_65() {
		// This is an invalid test. King cannot own pawn on diagonal!
		String input = "Ke1xd2";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_66() {
		// This is an invalid test. King cannot take empty square!
		String input = "e2-e3 e6-e5; Ke1xe2";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|_|p|p|p|\n"+
				"5|_|_|_|_|p|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|P|_|_|_|\n"+
				"2|P|P|P|P|_|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_67() {
		// This is an invalid test. King cannot take piece more than one square away.
		String input = "e2-e3 b6-b5; Ke1-e2 c6-c5; Ke2xb5";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|_|_|p|p|p|p|p|\n"+
				"5|_|p|p|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|P|_|_|_|\n"+
				"2|P|P|P|P|K|P|P|P|\n"+
				"1|R|N|B|Q|_|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_68() {
		// This is an invalid test.  Knight cannot move two squares forwards.
		String input = "Nb1-b3";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_69() {
		// This is an invalid test. Knight cannot move to arbitrary square on board.
		String input = "Nb1-c4";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_70() {
		// This is an invalid test. Knight cannot move to occupied square.
		String input = "Nb1-d2";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_71() {
		// This is an invalid test. Knight cannot move to occupied square.
		String input = "Nb1-c3 d6-d5; Nc3-d5";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|_|p|p|p|p|\n"+
				"5|_|_|_|p|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|N|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|_|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_72() {
		// This is an invalid test.  Knight cannot move in horizontal direction.
		String input = "Nb1-c3 e6-e5; Nc3-a3";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|_|p|p|p|\n"+
				"5|_|_|_|_|p|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|N|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|_|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_73() {
		// This is an invalid test.  Knight cannot take adjacent square.
		String input = "Nb1xd2";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_74() {
		// This is an invalid test. Knight cannot take square on same column.
		String input = "Nb1xb6";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_75() {
		// This is an invalid test. Knight cannot take in diagonal direction.
		String input = "Nb1-c3 e6-e5; Nc3xe5";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|_|p|p|p|\n"+
				"5|_|_|_|_|p|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|N|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|_|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_76() {
		// This is an invalid test. Knight cannot take in diagonal direction.
		String input = "e2-e3 Nb7-c5; e3-e4 Nc5xd4";
		// Define the expected output
		String expected =
				"7|r|_|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|n|_|_|_|_|_|\n"+
				"4|_|_|_|_|P|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|_|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_77() {
		// This is an invalid test. Knight cannot take own piece!
		String input = "c2-c3 Nb7-c5; Nb1xc3";
		// Define the expected output
		String expected =
				"7|r|_|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|n|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|P|_|_|_|_|_|\n"+
				"2|P|P|_|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	// ==============================================================
	// Part 3 --- Invalid Bishop, Rook and Queen Moves.
	// ==============================================================

	public @Test void test_78() {
		// This is an invalid test.  Bishop cannot move in vertical direction.
		String input = "Bc1-c3";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_79() {
		// This is an invalid test.  Bishop cannot move through other pieces.
		String input = "Bc1-e3";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_80() {
		// This is an invalid test.  Bishop cannot move like knight.
		String input = "Bc1-b3";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_81() {
		// This is an invalid test.  Bishop cannot move in vertical direction.
		String input = "c2-c3 e6-e5; Bc1-c2";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|_|p|p|p|\n"+
				"5|_|_|_|_|p|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|P|_|_|_|_|_|\n"+
				"2|P|P|_|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}


	public @Test void test_82() {
		// This is an invalid test. Black bishop cannot move in vertical direction.
		String input = "c2-c3 Bc7-c6";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|P|_|_|_|_|_|\n"+
				"2|P|P|_|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}


	public @Test void test_83() {
		// This is an invalid test.  Black bishop cannot to occupied square.
		String input = "c2-c3 Bc7-e6";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|P|_|_|_|_|_|\n"+
				"2|P|P|_|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}


	public @Test void test_84() {
		// This is an invalid test.  Black bishop cannot move through piece.
		String input = "c2-c3 e6-e5; d2-d3 Bf7-c4; e2-e3 Bc4-e2";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|_|n|r|\n"+
				"6|p|p|p|p|_|p|p|p|\n"+
				"5|_|_|_|_|p|_|_|_|\n"+
				"4|_|_|b|_|_|_|_|_|\n"+
				"3|_|_|P|P|P|_|_|_|\n"+
				"2|P|P|_|_|_|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_85() {
		// This is an invalid test. Bishop cannot take in vertical direction.
		String input = "Bc1xc6";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_86() {
		// This is an invalid test. Bishop cannot take through another piece.
		String input = "Bc1xh6";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_87() {
		// This is an invalid test. Bishop cannot take own piece!
		String input = "Bc1xd2";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_88() {
		// This is an invalid test. Bishop cannot take through other pieces.
		String input = "d2-d3 e6-e5; Bc1-f4 f6-f5; Bf4xc7";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|_|_|p|p|\n"+
				"5|_|_|_|_|p|p|_|_|\n"+
				"4|_|_|_|_|_|B|_|_|\n"+
				"3|_|_|_|P|_|_|_|_|\n"+
				"2|P|P|P|_|P|P|P|P|\n"+
				"1|R|N|_|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_89() {
		// This is an invalid test. Bishop cannot take through other pieces.
		String input = "c2-c3 e6-e5; d2-d3 Bf7-c4; Bc1-d2 Bc4xe2";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|_|n|r|\n"+
				"6|p|p|p|p|_|p|p|p|\n"+
				"5|_|_|_|_|p|_|_|_|\n"+
				"4|_|_|b|_|_|_|_|_|\n"+
				"3|_|_|P|P|_|_|_|_|\n"+
				"2|P|P|_|B|P|P|P|P|\n"+
				"1|R|N|_|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_90() {
		// This is an invalid test.  Rook cannot move into occupied square.
		String input = "Ra1-a2";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_91() {
		// This is an invalid test.  Rook cannot move through pawn.
		String input = "Ra1-a3";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_92() {
		// This is an invalid test.  Rook cannot take own piece!
		String input = "Ra1xa2";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}


	public @Test void test_93() {
		// This is an invalid test.  Rook cannot move into occupied square.
		String input = "a2-a3 h6-h5; Ra1-a3";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|_|\n"+
				"5|_|_|_|_|_|_|_|p|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|P|_|_|_|_|_|_|_|\n"+
				"2|_|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}


	public @Test void test_94() {
		// This is an invalid test.  Rook cannot move through piece.
		String input = "a2-a3 h6-h5; a3-a4 h5-h4; Ra1-a5";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|_|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|P|_|_|_|_|_|_|p|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|_|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_95() {
		// This is an invalid test. Rook cannot move in diagonal direction.
		String input = "a2-a3 h6-h5; a3-a4 h5-h4; Ra1-a3 Rh7-h5; Ra3-b4";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|_|\n"+
				"6|p|p|p|p|p|p|p|_|\n"+
				"5|_|_|_|_|_|_|_|r|\n"+
				"4|P|_|_|_|_|_|_|p|\n"+
				"3|R|_|_|_|_|_|_|_|\n"+
				"2|_|P|P|P|P|P|P|P|\n"+
				"1|_|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_96() {
		// This is an invalid test.  Rook cannot move into occupied square (or in diagonal direction).
		String input = "a2-a3 h6-h5; a3-a4 h5-h4; Ra1-a3 Rh7-h5; Ra3-b2";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|_|\n"+
				"6|p|p|p|p|p|p|p|_|\n"+
				"5|_|_|_|_|_|_|_|r|\n"+
				"4|P|_|_|_|_|_|_|p|\n"+
				"3|R|_|_|_|_|_|_|_|\n"+
				"2|_|P|P|P|P|P|P|P|\n"+
				"1|_|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_97() {
		// This is an invalid test.  Rook cannot take in diagonal direction (or one of own pieces)
		String input = "a2-a3 h6-h5; a3-a4 h5-h4; Ra1-a3 Rh7-h5; Ra3xb2";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|_|\n"+
				"6|p|p|p|p|p|p|p|_|\n"+
				"5|_|_|_|_|_|_|_|r|\n"+
				"4|P|_|_|_|_|_|_|p|\n"+
				"3|R|_|_|_|_|_|_|_|\n"+
				"2|_|P|P|P|P|P|P|P|\n"+
				"1|_|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_98() {
		// This is an invalid test.  Rook attempting to take pawn which doesn't exist!
		String input = "a2-a3 h6-h5; a3-a4 h5-h4; Ra1-a3 Rh7-h5; Ra3xh3";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|_|\n"+
				"6|p|p|p|p|p|p|p|_|\n"+
				"5|_|_|_|_|_|_|_|r|\n"+
				"4|P|_|_|_|_|_|_|p|\n"+
				"3|R|_|_|_|_|_|_|_|\n"+
				"2|_|P|P|P|P|P|P|P|\n"+
				"1|_|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_99() {
		// This is an invalid test.  Queen cannot move through pawn.
		String input = "Qd1-d4";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_100() {
		// This is an invalid test.  Queen cannot move diagonally through pawn.
		String input = "Qd1-f3";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_101() {
		// This is an invalid test.  Queen cannot move to arbitrary square (or through pawn).
		String input = "Qd1-e3";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_102() {
		// This is an invalid test.  Queen cannot move into occupied square.
		String input = "Qd1-e1";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_103() {
		// This is an invalid test. Queen cannot into occupied square.
		String input = "e2-e3 d6-d5; Qd1-e2 d5-d4; Qe2-e6";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|_|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|p|_|_|_|_|\n"+
				"3|_|_|_|_|P|_|_|_|\n"+
				"2|P|P|P|P|Q|P|P|P|\n"+
				"1|R|N|B|_|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_104() {
		// This is an invalid test.  Attempting to use queen at incorrect position.
		String input = "e2-e3 d6-d5; Qd1-e2 d5-d4; Qe3-e2";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|_|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|p|_|_|_|_|\n"+
				"3|_|_|_|_|P|_|_|_|\n"+
				"2|P|P|P|P|Q|P|P|P|\n"+
				"1|R|N|B|_|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_105() {
		// This is an invalid test.  Queen cannot move into occupied square.
		String input = "c2-c3 d6-d5; Qd1-b3 d5-d4; Qb3-e6";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|_|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|p|_|_|_|_|\n"+
				"3|_|Q|P|_|_|_|_|_|\n"+
				"2|P|P|_|P|P|P|P|P|\n"+
				"1|R|N|B|_|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_106() {
		// This is an invalid test.  Queen cannot take through other pieces.
		String input = "Qd1xd7";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_107() {
		// This is an invalid test.  Queen cannot take own piece!
		String input = "Qd1xc1";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_108() {
		// This is an invalid test. Queen attempting to take pawn which doesn't exist.
		String input = "e2-e3 d6-d5; Qd1-e2 d5-d4; Qe2xb5";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|_|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|p|_|_|_|_|\n"+
				"3|_|_|_|_|P|_|_|_|\n"+
				"2|P|P|P|P|Q|P|P|P|\n"+
				"1|R|N|B|_|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_109() {
		// This is an invalid test.  Attempting to use queen at incorrect position.
		String input = "e2-e3 d6-d5; Qd1-e2 d5-d4; Qe3xe2";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|_|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|p|_|_|_|_|\n"+
				"3|_|_|_|_|P|_|_|_|\n"+
				"2|P|P|P|P|Q|P|P|P|\n"+
				"1|R|N|B|_|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}
	public @Test void test_110() {
		// This is an invalid test. Queen attempting to take empty square!
		String input = "c2-c3 d6-d5; Qd1-b3 e6-e5; Qb3xe6";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|_|_|p|p|p|\n"+
				"5|_|_|_|p|p|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|Q|P|_|_|_|_|_|\n"+
				"2|P|P|_|P|P|P|P|P|\n"+
				"1|R|N|B|_|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	// ============================================================
	// Part 4 --- Pawn Promotion
	// ============================================================

	public @Test void test_111() {
		// This game is valid
		String input = "e2-e3 d6-d5; Nb1-c3 d5-d4; e3-e4 d4xc3; e4-e5 c3xb2; e5xf6 g6-g5; f6xg7=N";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|N|r|\n"+
				"6|p|p|p|_|p|_|_|p|\n"+
				"5|_|_|_|_|_|_|p|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|p|P|P|_|P|P|P|\n"+
				"1|R|_|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_112() {
		// This game is valid
		String input = "Nb1-c3 h6-h5; Nc3-b5 h5-h4; Nb5xa7 h4-h3; a2-a3 h3xg2; a3-a4 g2xh1=R";
		// Define the expected output
		String expected =
				"7|N|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|_|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|P|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|_|P|P|P|P|P|_|P|\n"+
				"1|R|_|B|Q|K|B|N|r|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_113() {
		// This game is valid
		String input = "Nb1-c3 h6-h5; Nc3-b5 h5-h4; Nb5xc7 h4-h3; a2-a3 h3xg2; a3-a4 g2xh1=B";
		// Define the expected output
		String expected =
				"7|r|n|N|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|_|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|P|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|_|P|P|P|P|P|_|P|\n"+
				"1|R|_|B|Q|K|B|N|b|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_114() {
		// This game is valid
		String input = "Nb1-c3 h6-h5; Nc3-b5 h5-h4; Nb5xc7 h4-h3; Nc7-b5 h3xg2; Nb5xa7 g2xh1=B";
		// Define the expected output
		String expected =
				"7|N|n|_|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|_|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|_|P|\n"+
				"1|R|_|B|Q|K|B|N|b|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_115() {
		// This game is valid
		String input = "Nb1-c3 h6-h5; Nc3-b5 h5-h4; Nb5xc7 h4-h3; Nc7-b5 h3xg2; Nb5xa7 g2xh1=R";
		// Define the expected output
		String expected =
				"7|N|n|_|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|_|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|_|P|\n"+
				"1|R|_|B|Q|K|B|N|r|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_116() {
		// This game is invalid.  Cannot promote pawn to piece not previously captured.
		String input = "Nb1-c3 h6-h5; Nc3-b5 h5-h4; Nb5xc7 h4-h3; Nc7-b5 h3xg2; Nb5xa7 g2xh1=Q";
		// Define the expected output
		String expected =
				"7|N|n|_|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|_|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|p|P|\n"+
				"1|R|_|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_117() {
		// This game is invalid.  Cannot move pawn onto last row due to not having
		// had a Queen,Rook,Bishop or kNight captured previously.
		String input = "a2-a3 b6-b5; a3-a4 b5xa4; Ra1-a3 a6-a5; Ra3-h3 a4-a3; Rh3-b3 a3-a2; Rb3-c3 a2-a1";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|_|_|p|p|p|p|p|p|\n"+
				"5|p|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|R|_|_|_|_|_|\n"+
				"2|p|P|P|P|P|P|P|P|\n"+
				"1|_|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_118() {
		// This game is valid.
		String input = "e2-e3 e6-e5; Qd1-f3 e5-e4; a2-a3 e4xf3; a3-a4 f3xg2; a4-a5 h6-h5; a5xb6 h5-h4; b6xa7=Q g2xh1=R; Qa7-d4 Rh1xg1; Qd4xh4";
		// Define the expected output
		String expected =
				"7|_|n|b|q|k|b|n|r|\n"+
				"6|p|_|p|p|_|p|p|_|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|Q|\n"+
				"3|_|_|_|_|P|_|_|_|\n"+
				"2|_|P|P|P|_|P|_|P|\n"+
				"1|R|N|B|_|K|B|r|_|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	// ============================================================
	// Part 5 --- End Game
	// ============================================================

	public @Test void test_119() {
		// This game is valid and indicates white won. The board is reset when the game
		// is finished.
		String input = "c2-c3 d6-d5; Qd1-a4 d5-d4; Qa4-a3 d4-d3; Qa3xe7 1-0";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_120() {
		// This game is invalid. White won, not black. Therefore, board not
		// reset.
		String input = "c2-c3 d6-d5; Qd1-a4 d5-d4; Qa4-a3 d4-d3; Qa3xe7 0-1";
		// Define the expected output
		String expected =
				"7|r|n|b|q|Q|b|n|r|\n"+
				"6|p|p|p|_|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|P|p|_|_|_|_|\n"+
				"2|P|P|_|P|P|P|P|P|\n"+
				"1|R|N|B|_|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_121() {
		// This game is invalid.  Game has ended and black cannot continue.
		String input = "c2-c3 d6-d5; Qd1-a4 d5-d4; Qa4-a3 d4-d3; Qa3xe7 Qd7xe7";
		// Define the expected output
		String expected =
				"7|r|n|b|q|Q|b|n|r|\n"+
				"6|p|p|p|_|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|P|p|_|_|_|_|\n"+
				"2|P|P|_|P|P|P|P|P|\n"+
				"1|R|N|B|_|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_122() {
		// This game is valid and indicates black won. The board is reset when the game
		// is finished.
		String input = "d2-d3 c6-c5; d3-d4 Qd7-b5; d4xc5 Qb5-a5; c5xb6 Qa5xe1; 0-1";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_123() {
		// This game is invalid. Black won, not white. Therefore, board not reset.
		String input = "d2-d3 c6-c5; d3-d4 Qd7-b5; d4xc5 Qb5-a5; c5xb6 Qa5xe1; 1-0";
		// Define the expected output
		String expected =
				"7|r|n|b|_|k|b|n|r|\n"+
				"6|p|P|_|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|_|P|P|P|P|\n"+
				"1|R|N|B|Q|q|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	public @Test void test_124() {
		// This game is valid because black cannot move piece other than king
		String input =
				// All pawns advance one
				"a2-a3 a6-a5; b2-b3 b6-b5; c2-c3 c6-c5; d2-d3 d6-d5; e2-e3 e6-e5; f2-f3 f6-f5; g2-g3 g6-g5; h2-h3 h6-h5;" +
				// Pawns advance in staggered formation and are taken
				"a3-a4 b5xa4; b3xa4 c5-c4; d3xc4 d5xc4; e3-e4 f5xe4; f3xe4 g5-g4; h3xg4 h5xg4;" +
				// Rooks and queens cause havoc
				"Rh1xh7 Qd7xd1; Rh7xg7 Qd1xc1; Rg7xf7 Qc1xb1; Ra1xb1 Ke7xf7; Rb1xb7 Ra7-a6; Rb7xc7 Ra6-c6;" +
		        // Finally, black loses because cannot move any other piece.  Therefore, board is reset.
				"Rc7xc6 1-0";
		// Define the expected output
		String expected =
				"7|r|n|b|q|k|b|n|r|\n"+
				"6|p|p|p|p|p|p|p|p|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
		// Execute the move sequence
		Game game = execute(input);
		// Check got expected output
		assertEquals(expected,game.toString());
	}

	/**
	 * Execute a game given in long algebraic notation.
	 *
	 * @param input
	 *            A simplified chess game given in long algebraic notation.
	 * @return
	 */
	private static Game execute(String input) {
		// Parse input
		Round[] rounds = Game.fromLongAlgebraicString(input);
		// Create empty game
		Game game = new Game();
		// Execute each move on the game, stopping at first invalid move.
		game.apply(rounds);
		// Done
		return game;
	}
}