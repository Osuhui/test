/**
 * Copyright (c) 2019 RECRUIT Co.,Ltd. All Rights Reserved.
 * システム名     : じゃらんnetシステム
 */
package test.api;

import org.junit.Test;

import base.api.MathGamenApi;

/**
 * 
 * @author huiweilong
 * @since 2019/05/24
 * 
 * 
 */
public class MathGameTest {

	MathGamenApi mathGamenApi = new MathGamenApi();

	@Test
	public void test01() {
		int num = 100;

		// 输出num以内的素数
		mathGamenApi.outPrime(num);

	}

	@Test
	public void test02() {

		// 结束外部循环标签使用
		mathGamenApi.outOddNumber();

	}

	@Test
	public void test03() {

		// 1-20之间相除最接近黄金分割点的两个整数
		mathGamenApi.goldPoint();

	}

	@Test
	public void test04() {

		// 所有的水仙花数
		mathGamenApi.Daffodil();

	}

	@Test
	public void test05() {

		// 求解一个4元一次方程
		mathGamenApi.resolveEquation();

	}

}
