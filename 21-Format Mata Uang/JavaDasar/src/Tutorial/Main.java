package Tutorial;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        double uang = 250000000;
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        // Cara Pertama
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setMonetaryGroupingSeparator('.');

        System.out.println();
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        System.out.printf(" Rupiah = %s %n", kursIndonesia.format(uang));

        // Cara Kedua
        System.out.println("------------------------------------");
        NumberFormat KurensiIndonesia = NumberFormat.getCurrencyInstance(new Locale("in","ID"));
        System.out.printf(" Rupiah = %s %n ", KurensiIndonesia.format(uang));

        NumberFormat KurensiUS = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.printf("Euro   = %s %n ", KurensiUS.format(uang));












    }

}
