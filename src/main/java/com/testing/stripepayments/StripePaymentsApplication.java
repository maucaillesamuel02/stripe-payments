package com.testing.stripepayments;

import com.stripe.Stripe;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class StripePaymentsApplication {

	@PostConstruct
	public void setup(){
		Stripe.apiKey="sk_test_51NFT1pHntTAJqB06jqyjBaEstLi2GJvtQP2jiPNcaubbGe0kext88QATgDBmfWCdNySlTnngC5Aj66yt7vM6Crhm00GY8KVEL7";
	}

	public static void main(String[] args) {
		SpringApplication.run(StripePaymentsApplication.class, args);
	}

}
