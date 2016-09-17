package income;

import income.exceptions.CalcMethodException;
import income.exceptions.PositionException;
import method.ICalcMethod;

/**
 * 计算器
 * @author Administrator
 *
 */

public class IncomeCaculator {
	/**
	 * 计算方法
	 */
	private ICalcMethod calcMethod;
	/**
	 * 当前计算人的角色
	 */
	private Position position;
	
	public void setCalcMethod(ICalcMethod calcMethod) {
		this.calcMethod = calcMethod;
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}

	public double calc() {
		if(calcMethod == null) {
			throw new CalcMethodException("calcMethod is not yet maintained");
		}
		if(position == null) {
			throw new PositionException("position is not yet maintained");
		}
		return calcMethod.calc(position);
	}
}
