package com.string.compression.core;

import static org.junit.Assert.*;

import org.junit.Test;

import com.string.compression.core.StringCompressor;

public class StringCompressorTest {

	@Test
	public void compressSimpleString() {
		String originalString = "aaaabbbccdjhgjjlllll";
		
		StringCompressor compressor = new StringCompressor();
		assertEquals("4a3b2cjhg2j5l", compressor.compressString(originalString));
	}

	@Test
	public void compressStringWithUpperCaseLetters() {
		String originalString = "RRRaaaabbbMMccdjhgjjlllll";
		
		StringCompressor compressor = new StringCompressor();
		assertEquals("3R4a3b2M2cjhg2j5l", compressor.compressString(originalString));
	}

	@Test
	public void compressMinimalStringAndReturnOriginal() {
		String originalString = "aabccdjhgjjllUOO"; // 2ab2cdjhg2j2lU2O, same size
		
		StringCompressor compressor = new StringCompressor();
		assertEquals("aabccdjhgjjllUOO", compressor.compressString(originalString));
	}
}
