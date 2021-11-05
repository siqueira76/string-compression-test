package com.string.compression.core;

public class StringCompressor {

	public String compressString(String originalString) {
		
		String newStr="";
		int count = 0;
				
		for(int i = 0; i < originalString.length(); i++) {
			count++;
			if(i + 1 >= originalString.length() || originalString.charAt(i) != originalString.charAt(i+ 1)) {				
				newStr = newStr + originalString.charAt(i);
				if (count > 1) {	
					newStr = newStr + count + "";
				}
				count = 0;
			}
			if (newStr.length() == originalString.length()) {	
				return originalString;
			}
		}
		return newStr;
	}
}
