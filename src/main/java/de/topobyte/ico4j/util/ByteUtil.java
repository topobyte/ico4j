package de.topobyte.ico4j.util;

public class ByteUtil
{

	public static void print(byte[] bytes)
	{
		System.out.println(bytes.length);
		for (int i = 0; i < bytes.length; i++) {
			System.out.printf("%02x", bytes[i]);
			if (((i + 1) % 2) == 0) {
				System.out.printf(" ");
			}
			if (((i + 1) % 16) == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

}
