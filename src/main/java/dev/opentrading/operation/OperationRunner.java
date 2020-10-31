package dev.opentrading.operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.ta4j.core.BarSeries;

import dev.opentrading.data.finnhub.FinnhubDataService;

@Component
public class OperationRunner implements ApplicationRunner {
	
	@Autowired
	FinnhubDataService finnhubDataService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		BarSeries bars = finnhubDataService.getTimeBars("SPY", 1000);
		
		System.out.println(bars.getBarCount());
		
		System.exit(0);
	}
}
