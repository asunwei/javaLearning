package method;

import income.Position;
/**
 * ���ʼ��㷽���ļ�ʵ��
 * @author Administrator
 *
 */

public class CalcMethod implements ICalcMethod {

	public double calc(Position position) {
		double d = 0;
		switch (position) {
		case BOSS:
			d = 70000.0;
		case MANAGER:
			d = 50000.0;
		case PROGRAMMER:
			d = 30000.0;
			break;
		}
		return d;
	}

}
