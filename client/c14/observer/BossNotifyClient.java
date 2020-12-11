package c14.observer;

import c14.observer.Boss;
import c14.observer.NBAObserver;
import c14.observer.Observer;
import c14.observer.Secretary;
import c14.observer.StockObserver;
import c14.observer.Subject;

/**
 * 老闆回來通知-客戶端(觀察者模式)
 * @author Yan
 *
 */
public class BossNotifyClient {
	public static void main(String[] args) {
		Subject boss = new Boss();
		
		
		Subject xiaoMei = new Secretary();
		
		Observer sob = new StockObserver("小股民", xiaoMei);
		Observer loser = new NBAObserver("NBA魯什", xiaoMei);
		// 沒人通知的情況下，小員工直接被老闆抓包
		System.out.println("小股民看股票中，NBA魯什看NBA中---老闆突然回來了");
		boss.attach(sob);
		boss.attach(loser);
		boss.notifyObserver("上班不上班，等等來辦公室找我");
		
		System.out.println("=============拜託櫃台小姐通知老闆回來了=============");
		xiaoMei.attach(sob);
		xiaoMei.attach(loser);
		// 報明牌失準，小美表示不想通知小股民了
		xiaoMei.detach(sob);
		xiaoMei.notifyObserver("老闆回來拉!!!");
	}
}
