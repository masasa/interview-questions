public class StocksRevenue{

	/*
	orders:
	---------------
	1. buy 1 stock
	2. sell all
	3. do nothing

	* given an array of stocks prices in array of days (stocks[i] is stock price in day i)
	* should find the best actions to preform in each day and return actions */
	public static int[] findBestStocksMoves(int[] stocks){
		
		if(stocks == null) return null;
		// one day of trading, means we have nothing to do
	 	if(stocks.length == 1) return new int[]{3};

		int n = stocks.length;
		int[] orders = new int[n];

		int maxPrice = 0, maxPiceIndex = n-1;
		for(int i=n-1; i>=0; i--){
			
			if(stocks[i]>maxPrice){
				// do nothing
				if(orders[maxPriceIndex] == 0)
					orders[maxPriceIndex] = 3;
				// set the new stock price
				maxPrice = stocks[i];
				maxPriceIndex = i;
			}else{
				orders[i] = 1; // buy 1 stock
				if(orders[maxPriceIndex] == 0)
					// sell all on that maximal price day
					orders[maxPriceIndex] = 2;
			}
		}

		return orders;
	}
}