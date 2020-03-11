package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyConverter;
import io.zipcoder.currencyconverterapplication.CurrencyType;

import java.util.Currency;

public class AustralianDollar  implements ConvertableCurrency {

    ConvertableCurrency convertableCurrency;


    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.AUSTRALIAN_DOLLAR;
    }
}
