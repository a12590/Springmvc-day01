package cn.itcast.javaee.springmvc.app02;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 工具类 
 * @author AdminTC
 */
public class JdbcUtil {
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
	public static ComboPooledDataSource getDataSource() {
		return dataSource;
	}
}
