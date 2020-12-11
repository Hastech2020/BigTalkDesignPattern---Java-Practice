package c13.builder;

import c13.builder.GundamBuilder;
import c13.builder.LinePersonBuilder;
import c13.builder.PersonDirector;

/**
 * 畫小人-客戶端(建造者模式)
 * builder pattern 與 factory pattern的差異處<br>
 * factory pattern 關注一個物件如何產生 <br>
 * builder pattern 關注一個由各種零組件組合的物件如何產生
 * @author Yan
 *
 */
public class PersonBuilderClient {
	public static void main(String[] args) {
		PersonDirector pd = new PersonDirector();
		
		// director 用 createPersonFromLeg 從腳到頭畫一個線條人
		LinePersonBuilder lpb = new LinePersonBuilder();
		pd.setPersonBuilder(lpb);
		pd.createPersonFromLeg();
		
		System.out.println();
		
		// director 用 createPersonFromHead 從頭到腳畫一個線鋼彈
		GundamBuilder gb = new GundamBuilder();
		pd.setPersonBuilder(gb);
		pd.createPersonFromHead();
		
		
		
	}
}
