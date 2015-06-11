/**
 * 
 */
package com.java.reader;

import java.awt.image.BufferedImage;
import java.net.URL;

import com.java.utility.ArrayHelper;
import com.java.utility.FileHelper;

/**
 * @author - rahul.rathore
 * @date - 11-Jun-2015
 * @project - ImageCompare
 * @package - com.java.reader
 * @file name - ImageHelper.java
 */
public class ImageHelper {
	
	private static int srcImgArr[] = null;
	private static int trgImgArr[] = null;
	private static BufferedImage srcImg = null;
	private static BufferedImage trgImg = null;
	
	public static boolean areImgSame(Object aImg,Object bImg) {
		
		if(!(aImg instanceof URL))
			throw new IllegalArgumentException("Argument One is not of type java.net.URL");
		if(!(bImg instanceof String))
			throw new IllegalArgumentException("Argument Two is not of type java.lang.String");
		
		srcImg = FileHelper.getImageFile((URL)aImg);
		trgImg = FileHelper.getImageFile((String)bImg);
		
		if(srcImg == null || trgImg == null )
			return false;
		
		srcImgArr = new int[srcImg.getWidth()*srcImg.getHeight()];
		trgImgArr = new int[trgImg.getWidth()*trgImg.getHeight()];
		
		srcImgArr = srcImg.getRGB(0, 0, srcImg.getWidth(), srcImg.getHeight(), srcImgArr, 0, srcImg.getWidth());
		trgImgArr = trgImg.getRGB(0, 0, trgImg.getWidth(), trgImg.getHeight(), trgImgArr, 0, trgImg.getWidth());
		
		return ArrayHelper.areSame(srcImgArr, trgImgArr);
	}
	
	
}
