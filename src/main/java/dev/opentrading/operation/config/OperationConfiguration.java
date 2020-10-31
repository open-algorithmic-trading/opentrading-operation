package dev.opentrading.operation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.opentrading.data.config.DataConfiguration;
import dev.opentrading.data.constants.DataType;
import dev.opentrading.data.constants.Provider;
import dev.opentrading.data.constants.Resolution;

@Configuration
public class OperationConfiguration {
	
	@Bean
	public DataConfiguration finnhubDataConfig() {
		return new DataConfiguration(Provider.FINNHUB, DataType.STOCK_CANDLE, Resolution.FIVE);
	}

}
