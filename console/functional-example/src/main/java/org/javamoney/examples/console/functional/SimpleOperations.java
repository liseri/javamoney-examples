package org.javamoney.examples.console.functional;

import java.util.Locale;

import javax.money.CurrencyUnit;
import javax.money.MonetaryAmount;
import javax.money.Monetary;

import org.javamoney.moneta.Money;

public class SimpleOperations {

	public static void main(String[] args) {
		CurrencyUnit dollar = Monetary.getCurrency(Locale.US);
        MonetaryAmount money = Money.of(120, dollar);
        MonetaryAmount money2 = Money.of(50, dollar);
        System.out.println(money.add(money2));
        System.out.println(money.subtract(money2));
        System.out.println(money.multiply(2));
        System.out.println(money.divide(2));
        System.out.println(money.isEqualTo(money2));
        System.out.println(money.isGreaterThan(money2));
        System.out.println(money.isGreaterThanOrEqualTo(money2));
        System.out.println(money.isGreaterThanOrEqualTo(money2));
        System.out.println(money.isLessThan(money2));
        System.out.println(money.isLessThanOrEqualTo(money2));
        System.out.println(money.isNegative());
        System.out.println(money.isNegativeOrZero());
	}
}
