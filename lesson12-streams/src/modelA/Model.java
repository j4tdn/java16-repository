package modelA;

import java.util.Arrays;
import java.util.List;
import predemo.Trader;
import predemo.Transactions;

public class Model {
	public Model() {
		// TODO Auto-generated constructor stub
	}

	public static List<Trader> getTrader() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		return Arrays.asList(raoul, mario, alan, brian);
	}

	public static List<Transactions> getTransaction() {
		List<Trader> traders = getTrader();
		return Arrays.asList(new Transactions(traders.get(3), 2011, 300), new Transactions(traders.get(0), 2012, 1000),
				new Transactions(traders.get(0), 2011, 400), new Transactions(traders.get(1), 2012, 710),
				new Transactions(traders.get(1), 2012, 700), new Transactions(traders.get(2), 2012, 950));
	}
}
