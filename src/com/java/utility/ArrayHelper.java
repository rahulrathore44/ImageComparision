/**
 * 
 */
package com.java.utility;

/**
 * @author - rahul.rathore
 * @date - 11-Jun-2015
 * @project - ImageCompare
 * @package - com.java.main
 * @file name - ArrayHelper.java
 */
public class ArrayHelper {
	
	private static boolean flag = true;
	
	
	public static boolean areSame(int aOne[],int bTwo[]) {
		
		if(aOne.length != bTwo.length)
			return false;
		
		for(int i = 0; i < aOne.length; i++){
			if(aOne[i] != bTwo[i]){
				flag = false;
				break;
			}
		}
		
		return flag;
	}
}
