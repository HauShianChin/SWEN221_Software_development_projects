// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a SWEN221 assignment.
// You may not distribute it in any other way without permission.
package swen221.widgets;

/**
 * A very simple widget which provides a simple background colour on which other
 * widgets live.
 *
 * @author David J. Pearce
 *
 */
public class Counter {
	/**
	 * <p>
	 * The following array defines a sequence of bytes which can be converted
	 * into a class. In fact, this class implements the Widget interface. But,
	 * what does it do?
	 * </p>
	 * <p>
	 * The purpose of hiding a class in an array of bytes like this is to ensure
	 * that you must really use reflection to solve this lab. Otherwise, you
	 * could just modify the widget interface and implementations accordingly.
	 * </p>
	 */
	public final static byte[] COUNTER_BYTES = new byte[] { -54, -2, -70, -66, 0, 0, 0, 52, 0, 85, 7, 0, 2, 1, 0, 23,
			115, 119, 101, 110, 50, 50, 49, 47, 119, 105, 100, 103, 101, 116, 115, 47, 67, 111, 117, 110, 116, 101, 114,
			7, 0, 4, 1, 0, 27, 115, 119, 101, 110, 50, 50, 49, 47, 117, 116, 105, 108, 47, 65, 98, 115, 116, 114, 97,
			99, 116, 87, 105, 100, 103, 101, 116, 1, 0, 10, 67, 79, 76, 79, 82, 95, 68, 73, 65, 76, 1, 0, 17, 91, 76,
			106, 97, 118, 97, 47, 97, 119, 116, 47, 67, 111, 108, 111, 114, 59, 1, 0, 5, 118, 97, 108, 117, 101, 1, 0,
			1, 73, 1, 0, 8, 60, 99, 108, 105, 110, 105, 116, 62, 1, 0, 3, 40, 41, 86, 1, 0, 4, 67, 111, 100, 101, 7, 0,
			13, 1, 0, 14, 106, 97, 118, 97, 47, 97, 119, 116, 47, 67, 111, 108, 111, 114, 9, 0, 12, 0, 15, 12, 0, 16, 0,
			17, 1, 0, 5, 87, 72, 73, 84, 69, 1, 0, 16, 76, 106, 97, 118, 97, 47, 97, 119, 116, 47, 67, 111, 108, 111,
			114, 59, 9, 0, 12, 0, 19, 12, 0, 20, 0, 17, 1, 0, 10, 76, 73, 71, 72, 84, 95, 71, 82, 65, 89, 9, 0, 12, 0,
			22, 12, 0, 23, 0, 17, 1, 0, 4, 67, 89, 65, 78, 9, 0, 12, 0, 25, 12, 0, 26, 0, 17, 1, 0, 4, 66, 76, 85, 69,
			9, 0, 12, 0, 28, 12, 0, 29, 0, 17, 1, 0, 5, 71, 82, 69, 69, 78, 9, 0, 12, 0, 31, 12, 0, 32, 0, 17, 1, 0, 6,
			89, 69, 76, 76, 79, 87, 9, 0, 12, 0, 34, 12, 0, 35, 0, 17, 1, 0, 3, 82, 69, 68, 9, 0, 12, 0, 37, 12, 0, 38,
			0, 17, 1, 0, 9, 68, 65, 82, 75, 95, 71, 82, 65, 89, 9, 0, 12, 0, 40, 12, 0, 41, 0, 17, 1, 0, 5, 66, 76, 65,
			67, 75, 9, 0, 1, 0, 43, 12, 0, 5, 0, 6, 1, 0, 15, 76, 105, 110, 101, 78, 117, 109, 98, 101, 114, 84, 97, 98,
			108, 101, 1, 0, 18, 76, 111, 99, 97, 108, 86, 97, 114, 105, 97, 98, 108, 101, 84, 97, 98, 108, 101, 1, 0, 6,
			60, 105, 110, 105, 116, 62, 1, 0, 27, 40, 76, 115, 119, 101, 110, 50, 50, 49, 47, 117, 116, 105, 108, 47,
			82, 101, 99, 116, 97, 110, 103, 108, 101, 59, 41, 86, 10, 0, 3, 0, 49, 12, 0, 46, 0, 47, 1, 0, 4, 116, 104,
			105, 115, 1, 0, 25, 76, 115, 119, 101, 110, 50, 50, 49, 47, 119, 105, 100, 103, 101, 116, 115, 47, 67, 111,
			117, 110, 116, 101, 114, 59, 1, 0, 10, 100, 105, 109, 101, 110, 115, 105, 111, 110, 115, 1, 0, 24, 76, 115,
			119, 101, 110, 50, 50, 49, 47, 117, 116, 105, 108, 47, 82, 101, 99, 116, 97, 110, 103, 108, 101, 59, 1, 0,
			8, 103, 101, 116, 86, 97, 108, 117, 101, 1, 0, 3, 40, 41, 73, 9, 0, 1, 0, 57, 12, 0, 7, 0, 8, 1, 0, 8, 115,
			101, 116, 86, 97, 108, 117, 101, 1, 0, 4, 40, 73, 41, 86, 1, 0, 1, 105, 1, 0, 5, 112, 97, 105, 110, 116, 1,
			0, 24, 40, 76, 115, 119, 101, 110, 50, 50, 49, 47, 99, 111, 114, 101, 47, 67, 97, 110, 118, 97, 115, 59, 41,
			86, 10, 0, 1, 0, 64, 12, 0, 65, 0, 66, 1, 0, 13, 103, 101, 116, 68, 105, 109, 101, 110, 115, 105, 111, 110,
			115, 1, 0, 26, 40, 41, 76, 115, 119, 101, 110, 50, 50, 49, 47, 117, 116, 105, 108, 47, 82, 101, 99, 116, 97,
			110, 103, 108, 101, 59, 11, 0, 68, 0, 70, 7, 0, 69, 1, 0, 19, 115, 119, 101, 110, 50, 50, 49, 47, 99, 111,
			114, 101, 47, 67, 97, 110, 118, 97, 115, 12, 0, 71, 0, 72, 1, 0, 13, 102, 105, 108, 108, 82, 101, 99, 116,
			97, 110, 103, 108, 101, 1, 0, 43, 40, 76, 115, 119, 101, 110, 50, 50, 49, 47, 117, 116, 105, 108, 47, 82,
			101, 99, 116, 97, 110, 103, 108, 101, 59, 76, 106, 97, 118, 97, 47, 97, 119, 116, 47, 67, 111, 108, 111,
			114, 59, 41, 86, 11, 0, 68, 0, 74, 12, 0, 75, 0, 72, 1, 0, 13, 100, 114, 97, 119, 82, 101, 99, 116, 97, 110,
			103, 108, 101, 1, 0, 6, 99, 97, 110, 118, 97, 115, 1, 0, 21, 76, 115, 119, 101, 110, 50, 50, 49, 47, 99,
			111, 114, 101, 47, 67, 97, 110, 118, 97, 115, 59, 1, 0, 3, 98, 111, 120, 1, 0, 10, 109, 111, 117, 115, 101,
			67, 108, 105, 99, 107, 1, 0, 23, 40, 76, 115, 119, 101, 110, 50, 50, 49, 47, 117, 116, 105, 108, 47, 80,
			111, 105, 110, 116, 59, 41, 86, 1, 0, 1, 112, 1, 0, 20, 76, 115, 119, 101, 110, 50, 50, 49, 47, 117, 116,
			105, 108, 47, 80, 111, 105, 110, 116, 59, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 12,
			67, 111, 117, 110, 116, 101, 114, 46, 106, 97, 118, 97, 0, 33, 0, 1, 0, 3, 0, 0, 0, 2, 0, 10, 0, 5, 0, 6, 0,
			0, 0, 2, 0, 7, 0, 8, 0, 0, 0, 6, 0, 8, 0, 9, 0, 10, 0, 1, 0, 11, 0, 0, 0, -114, 0, 4, 0, 0, 0, 0, 0, 66, 16,
			9, -67, 0, 12, 89, 3, -78, 0, 14, 83, 89, 4, -78, 0, 18, 83, 89, 5, -78, 0, 21, 83, 89, 6, -78, 0, 24, 83,
			89, 7, -78, 0, 27, 83, 89, 8, -78, 0, 30, 83, 89, 16, 6, -78, 0, 33, 83, 89, 16, 7, -78, 0, 36, 83, 89, 16,
			8, -78, 0, 39, 83, -77, 0, 42, -79, 0, 0, 0, 2, 0, 44, 0, 0, 0, 50, 0, 12, 0, 0, 0, 19, 0, 7, 0, 20, 0, 13,
			0, 21, 0, 19, 0, 22, 0, 25, 0, 23, 0, 31, 0, 24, 0, 37, 0, 25, 0, 44, 0, 26, 0, 51, 0, 27, 0, 58, 0, 28, 0,
			62, 0, 19, 0, 65, 0, 29, 0, 45, 0, 0, 0, 2, 0, 0, 0, 1, 0, 46, 0, 47, 0, 1, 0, 11, 0, 0, 0, 62, 0, 2, 0, 2,
			0, 0, 0, 6, 42, 43, -73, 0, 48, -79, 0, 0, 0, 2, 0, 44, 0, 0, 0, 10, 0, 2, 0, 0, 0, 34, 0, 5, 0, 35, 0, 45,
			0, 0, 0, 22, 0, 2, 0, 0, 0, 6, 0, 50, 0, 51, 0, 0, 0, 0, 0, 6, 0, 52, 0, 53, 0, 1, 0, 1, 0, 54, 0, 55, 0, 1,
			0, 11, 0, 0, 0, 47, 0, 1, 0, 1, 0, 0, 0, 5, 42, -76, 0, 56, -84, 0, 0, 0, 2, 0, 44, 0, 0, 0, 6, 0, 1, 0, 0,
			0, 38, 0, 45, 0, 0, 0, 12, 0, 1, 0, 0, 0, 5, 0, 50, 0, 51, 0, 0, 0, 1, 0, 58, 0, 59, 0, 1, 0, 11, 0, 0, 0,
			62, 0, 2, 0, 2, 0, 0, 0, 6, 42, 27, -75, 0, 56, -79, 0, 0, 0, 2, 0, 44, 0, 0, 0, 10, 0, 2, 0, 0, 0, 42, 0,
			5, 0, 43, 0, 45, 0, 0, 0, 22, 0, 2, 0, 0, 0, 6, 0, 50, 0, 51, 0, 0, 0, 0, 0, 6, 0, 60, 0, 8, 0, 1, 0, 1, 0,
			61, 0, 62, 0, 1, 0, 11, 0, 0, 0, 119, 0, 4, 0, 3, 0, 0, 0, 41, 42, -74, 0, 63, 77, 43, 44, -78, 0, 42, 42,
			-76, 0, 56, 50, -71, 0, 67, 3, 0, 43, 44, -78, 0, 39, -71, 0, 73, 3, 0, 43, 44, -78, 0, 39, -71, 0, 73, 3,
			0, -79, 0, 0, 0, 2, 0, 44, 0, 0, 0, 22, 0, 5, 0, 0, 0, 47, 0, 5, 0, 48, 0, 20, 0, 49, 0, 30, 0, 50, 0, 40,
			0, 51, 0, 45, 0, 0, 0, 32, 0, 3, 0, 0, 0, 41, 0, 50, 0, 51, 0, 0, 0, 0, 0, 41, 0, 76, 0, 77, 0, 1, 0, 5, 0,
			36, 0, 78, 0, 53, 0, 2, 0, 1, 0, 79, 0, 80, 0, 1, 0, 11, 0, 0, 0, 70, 0, 3, 0, 2, 0, 0, 0, 14, 42, 42, -76,
			0, 56, 4, 96, 16, 10, 112, -75, 0, 56, -79, 0, 0, 0, 2, 0, 44, 0, 0, 0, 10, 0, 2, 0, 0, 0, 55, 0, 13, 0, 56,
			0, 45, 0, 0, 0, 22, 0, 2, 0, 0, 0, 14, 0, 50, 0, 51, 0, 0, 0, 0, 0, 14, 0, 81, 0, 82, 0, 1, 0, 1, 0, 83, 0,
			0, 0, 2, 0, 84 };
}
