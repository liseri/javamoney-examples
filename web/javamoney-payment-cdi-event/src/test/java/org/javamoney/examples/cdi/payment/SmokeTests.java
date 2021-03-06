/*
 * JavaMoney Examples
 * Copyright 2012-2014, Credit Suisse AG, Werner Keil 
 * and individual contributors by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.javamoney.examples.cdi.payment;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.javamoney.moneta.Money;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author Werner Keil
 * 
 */
public class SmokeTests {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(SmokeTests.class);

	@Test
	public void testCreateMoney() {
		// Creating one
		Money amount1 = Money.of(1.0d,"CHF");
		Money amount2 = Money.of(1.0d, "CHF");
		Money amount3 = amount1.add(amount2);
		LOGGER.debug(amount1 + " + " + amount2 + " = " + amount3);
		assertEquals(BigDecimal.ONE, amount1.getNumber());
		assertEquals(BigDecimal.ONE, amount2.getNumber());
		assertEquals(BigDecimal.valueOf(2d), amount3.getNumber());
	}
}
