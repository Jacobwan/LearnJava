package com.wzl.filee;

import java.io.File;

public class DirList {
	  public static void main(String args[]) {
		    String dirname = "src";
		    File f1 = new File(dirname);
		    
		   // 如果创建一个 File 对象并且它是一个目录，那么调用 isDirectory() 方法会返回 true
		    if (f1.isDirectory()) {
						      System.out.println( "目录 " + dirname);
						      //通过调用该对象上的 list() 方法，来提取它包含的文件和文件夹的列表
						      String s[] = f1.list();
						      for (int i=0; i < s.length; i++) {
									        File f = new File(dirname + "/" + s[i]);
									        if (f.isDirectory()) {
									        			System.out.println(s[i] + " 是一个目录");
									        } else {
									        			System.out.println(s[i] + " 是一个文件");
									        }
							 }
			    } 
		  else {
					      System.out.println(dirname + " 不是一个目录");
					    }
		  }
}