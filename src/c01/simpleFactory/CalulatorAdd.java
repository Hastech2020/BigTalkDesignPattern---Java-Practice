package c01.simpleFactory;

/**
 * 加法計算
 * @author Yan
 *
 */
public class CalulatorAdd extends Calculator {
	@Override
	public int getResult() {
		return numberA+numberB;
	}
}
