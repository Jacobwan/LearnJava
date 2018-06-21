package com.wzl.filee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
	  public static void main(String args[]) throws IOException
	  {
	    char c;
	    // 使用 System.in 创建 BufferedReader 
//	    把 System.in 包装在一个 BufferedReader 对象中来创建一个字符流
	    BufferedReader br = new BufferedReader(new 
	                       InputStreamReader(System.in));
	    System.out.println("输入字符, 按下 'q' 键退出。");
	    // 读取字符
	    do {
	       c = (char) br.read();
	       System.out.println(c);
	    } while(c != 'q');
	  }
}
