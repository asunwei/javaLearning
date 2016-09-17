package method;

import income.Position;
/**
 * 工资计算方法的简单实现
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
