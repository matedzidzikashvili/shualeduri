package ge.edu.btu.currency;

import ge.edu.btu.currency.service.CurrencyService;
import ge.edu.btu.currency.service.impl.CurrencyServiceImpl;
import org.apache.log4j.Logger;

public class Main {

    final static Logger logger=Logger.getLogger(Main.class);

    public static void main(String[] args) {



        CurrencyService currencyService = new CurrencyServiceImpl();
        currencyService.setExchangeRate(3);

        System.out.println(currencyService.convert(123456));
        System.out.println(currencyService.convert(123456.123456));
        System.out.println(currencyService.convert(9347347));
        System.out.println(currencyService.convert(12312.12312400));
        System.out.println(currencyService.convert(26622));
        System.out.println(currencyService.convert(26292.23123));

    }
}
