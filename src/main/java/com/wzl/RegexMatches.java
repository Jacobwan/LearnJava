package com.wzl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

	public RegexMatches() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	      // 按指定模式在字符串查找
	      String line = "This order was placed for QT3000! OK?";
	      String pattern = "(\\D*)(\\d+)(.*)";
//	      \d 数字字符匹配。等效于 [0-9]。
//	      \D 非数字字符匹配。等效于 [^0-9]。
	 
	      // 创建 Pattern 对象
	      Pattern r = Pattern.compile(pattern);
	 
	      // 现在创建 matcher 对象
//	      可以通过调用 matcher 对象的 groupCount 方法来查看表达式有多少个分组。groupCount 方法返回一个 int 值，表示matcher对象当前有多个捕获组。
//	      还有一个特殊的组（group(0)），它总是代表整个表达式。该组不包括在 groupCount 的返回值中
	      Matcher m = r.matcher(line);
	      if (m.find( )) {
	         System.out.println("Found value: " + m.group(0) );
	         System.out.println("Found value: " + m.group(1) );
	         System.out.println("Found value: " + m.group(2) );
	         System.out.println("Found value: " + m.group(3) ); 
	      } else {
	         System.out.println("NO MATCH");
	      }

	}

}
