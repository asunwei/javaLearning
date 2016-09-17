package income;

import static org.junit.Assert.*;
import income.exceptions.PositionException;
import method.ICalcMethod;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

public class IncomeCalculatorTest {
	private ICalcMethod calcMerhodMock;
	private IncomeCaculator incomeCalc;
	
	@Before
	public void setup() throws Exception {
		//根据ICalcMethod接口创建一个模拟对象
		calcMerhodMock = EasyMock.createMock(ICalcMethod.class);
		//new计算器对象
		incomeCalc =  new IncomeCaculator();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalc1() {
		/**
		 * 记录+回放的过程  测试+检查
		 * 
		 * 记录
		 * expect表明我们希望测试的是模拟对象的calc方法，而且测试时
		 * 参数为BOSS
		 * andRuturn 并且返回的值是70000.0
		 * times 方法执行的次数
		 * 
		 */
		EasyMock.expect(calcMerhodMock.calc(Position.BOSS)).andReturn(70000.0).times(2);
		EasyMock.expect(calcMerhodMock.calc(Position.PROGRAMMER)).andReturn(50000.0);
		
		//对模拟对象进行回放
		EasyMock.replay(calcMerhodMock);
		incomeCalc.setCalcMethod(calcMerhodMock);
		try {
			incomeCalc.calc();
			fail("Exception did not occur");
		} catch(PositionException e) {
			
		}
		incomeCalc.setPosition(Position.BOSS);
		System.out.println(incomeCalc.calc());
		assertEquals(70000.0, incomeCalc.calc());
		assertEquals(70000.0,incomeCalc.calc());
		incomeCalc.setPosition(Position.PROGRAMMER);
		assertEquals(50000.0,incomeCalc.calc());
		incomeCalc.setPosition(Position.MANAGER);
		//判断这个模拟对象中的所有方法是不是都执行了
		EasyMock.verify(calcMerhodMock);
		
		
	}
	
	

}
