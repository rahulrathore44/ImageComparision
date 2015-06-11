/**
 * 
 */
package com.java.main;

import java.net.MalformedURLException;
import java.net.URL;

import com.java.reader.ImageHelper;


public class MainClass {

	public static void main(String[] args) {
		try {
			
			System.out.println(ImageHelper.areImgSame(new URL("http://www.mkyong.com/image/mypic.jpg"), ""));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
