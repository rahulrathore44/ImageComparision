/**
 * 
 */
package com.java.utility;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;



public class FileHelper {
	
	public static BufferedImage getImageFile(String path) {
		try {
			return ImageIO.read(new File(path));
		} catch (IOException e) {
			//e.printStackTrace();
			return null;
		}
	}
	
	public static BufferedImage getImageFile(URL path) {
		try {
			return ImageIO.read(path);
		} catch (IOException e) {
			//e.printStackTrace();
			return null;
		}
	}
	
}
