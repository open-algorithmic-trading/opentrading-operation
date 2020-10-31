package dev.opentrading.operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import dev.opentrading.data.config.DataConfiguration;
import dev.opentrading.data.constants.DataType;
import dev.opentrading.data.constants.Provider;
import dev.opentrading.data.constants.Resolution;
import dev.opentrading.data.finnhub.FinnhubDataService;

@SpringBootApplication
@ComponentScan(basePackages = {"dev.opentrading.data", "dev.opentrading.operation.config"},
		basePackageClasses= { OperationRunner.class })
public class OpentradingOperationBoot {

	public static void main(String[] args) {
		SpringApplication.run(OpentradingOperationBoot.class, args);
	}

}
