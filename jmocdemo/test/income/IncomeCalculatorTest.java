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
		//����ICalcMethod�ӿڴ���һ��ģ�����
		calcMerhodMock = EasyMock.createMock(ICalcMethod.class);
		//new����������
		incomeCalc =  new IncomeCaculator();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalc1() {
		/**
		 * ��¼+�طŵĹ���  ����+���
		 * 
		 * ��¼
		 * expect��������ϣ�����Ե���ģ������calc���������Ҳ���ʱ
		 * ����ΪBOSS
		 * andRuturn ���ҷ��ص�ֵ��70000.0
		 * times ����ִ�еĴ���
		 * 
		 */
		EasyMock.expect(calcMerhodMock.calc(Position.BOSS)).andReturn(70000.0).times(2);
		EasyMock.expect(calcMerhodMock.calc(Position.PROGRAMMER)).andReturn(50000.0);
		
		//��ģ�������лط�
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
		//�ж����ģ������е����з����ǲ��Ƕ�ִ����
		EasyMock.verify(calcMerhodMock);
		
		
	}
	
	

}
