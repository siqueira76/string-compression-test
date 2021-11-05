package com.string.compression.core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCompressorTest {

	@Test
	public void compressSimpleString() {
		String originalString = "aaaabbbccdjhgjjlllll";
		
		StringCompressor compressor = new StringCompressor();
		assertEquals("a4b3c2djhgj2l5", compressor.compressString(originalString));
	}

	@Test
	public void compressStringWithUpperCaseLetters() {
		String originalString = "RRRaaaabbbMMccdjhgjjlllll";
		
		StringCompressor compressor = new StringCompressor();
		assertEquals("R3a4b3M2c2djhgj2l5", compressor.compressString(originalString));
	}

	@Test
	public void compressMinimalStringAndReturnOriginal() {
		String originalString = "aabccdjhgjjllUOO"; // a2bc2djhgj2l2UO2, same size
		
		StringCompressor compressor = new StringCompressor();
		assertEquals("aabccdjhgjjllUOO", compressor.compressString(originalString));
	}
}
