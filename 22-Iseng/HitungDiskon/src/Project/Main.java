package Project;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner UserInput = new Scanner(System.in);

        int PilihanProduk, PilihanBrand, PilihanTipe, Quantity, Diskon, UangTunai;
        double HargaTotal, HargaBersih, Kembalian, BesarDiskon, Kurang;

        DecimalFormat KursIndo = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols FormatRp = new DecimalFormatSymbols();
        FormatRp.setCurrencySymbol("Rp. ");
        FormatRp.setMonetaryGroupingSeparator('.');
        FormatRp.setMonetaryDecimalSeparator(',');

        System.out.println();
        System.out.println("      Menu Pilihan   ");
        System.out.println("    -----------------");
        System.out.println("     1. Laptop     ");
        System.out.println("     2. Handphone  ");
        System.out.println("    -----------------");
        System.out.println();
        System.out.print(" Masukan Pilihan Produk          : ");
        PilihanProduk = UserInput.nextInt();

        // Awal Switch Case Pilihan Produk
        switch (PilihanProduk) {
            // Awal Case 1 Pilihan Produk
            case 1 :
                System.out.println();
                System.out.println("         Laptop    ");
                System.out.println("    ---------------");
                System.out.println("     1. Asus   ");
                System.out.println("     2. MSI    ");
                System.out.println("     3. Lenovo ");
                System.out.println("     4. Acer   ");
                System.out.println("     5. Apple  ");
                System.out.println("    ---------------");
                System.out.println();
                System.out.print(" Masukan Pilihan Laptop          : ");
                PilihanBrand = UserInput.nextInt();

                    // Awal Switch Case Pilihan Brand Laptop
                    switch (PilihanBrand) {
                        // Awal Case 1 Pilihan Brand Laptop
                        case 1:
                            System.out.println();
                            System.out.println("         Asus      ");
                            System.out.println("    --------------   ");
                            System.out.println("     1. Zenbook   ");
                            System.out.println("     2. TUV       ");
                            System.out.println("     3. Vivobook  ");
                            System.out.println("    --------------   ");
                            System.out.println();
                            System.out.print(" Masukan Pilihan Tipe Laptop     : ");
                            PilihanTipe = UserInput.nextInt();

                                // Awal Switch Case Pilihan Tipe Laptop Asus
                                switch (PilihanTipe) {
                                    // Awal Case 1 Pilihan Tipe Laptop Asus Zenbook
                                    case 1:
                                        System.out.println();
                                        System.out.println("    Tipe  : Asus Zenbook ");
                                        System.out.println("    Harga : Rp. 15.000.000,00 ");
                                        System.out.println("  -----------------------------");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                        // Awal If Perhitungan Harga Laptop Asus Zenbook
                                        if (Quantity >= 2) {

                                            System.out.println();
                                            HargaTotal = Quantity * 15000000;
                                            KursIndo.setDecimalFormatSymbols(FormatRp);
                                            System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                            System.out.print(" Jumlah Diskon : %");
                                            Diskon = UserInput.nextInt();
                                            System.out.println("-------------------------------------");
                                            BesarDiskon = (Diskon * HargaTotal) / 100;
                                            KursIndo.setDecimalFormatSymbols(FormatRp);
                                            System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                            HargaBersih = HargaTotal - BesarDiskon;
                                            KursIndo.setDecimalFormatSymbols(FormatRp);
                                            System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                            System.out.print(" Uang Tunai    : Rp. ");
                                            UangTunai = UserInput.nextInt();
                                            System.out.println("-------------------------------------");

                                                if (UangTunai > HargaBersih) {

                                                    Kembalian = UangTunai - HargaBersih;
                                                    KursIndo.setDecimalFormatSymbols(FormatRp);
                                                    System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                    System.out.println("-----------------------------------");

                                                } else if (HargaBersih > UangTunai) {

                                                    Kurang = HargaBersih - UangTunai;
                                                    KursIndo.setDecimalFormatSymbols(FormatRp);
                                                    System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                    System.out.println("-----------------------------------");
                                                }

                                        } else {
                                            System.out.println();
                                            HargaTotal = Quantity * 15000000;
                                            KursIndo.setDecimalFormatSymbols(FormatRp);
                                            System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                            HargaBersih = HargaTotal;
                                            KursIndo.setDecimalFormatSymbols(FormatRp);
                                            System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                            System.out.print(" Uang Tunai   : Rp. ");
                                            UangTunai = UserInput.nextInt();
                                            System.out.println("-------------------------------------");

                                                if (UangTunai > HargaBersih) {

                                                    Kembalian = UangTunai - HargaBersih;
                                                    KursIndo.setDecimalFormatSymbols(FormatRp);
                                                    System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                    System.out.println("--------------------------------");

                                                } else if (HargaBersih > UangTunai) {

                                                    Kurang = HargaBersih - UangTunai;
                                                    KursIndo.setDecimalFormatSymbols(FormatRp);
                                                    System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                    System.out.println("---------------------------------");
                                                }
                                        }
                                        // Akhir If Perhitungan Harga Laptop Asus Zenbook

                                        break;
                                        // Akhir Case 1 Pilihan Laptop Asus Zenbook

                                    // Awal Case 2 Pilihan Laptop Asus TUV
                                    case 2:
                                        System.out.println();
                                        System.out.println("    Tipe  : Asus TUV ");
                                        System.out.println("    Harga : Rp. 12.000.000,00 ");
                                        System.out.println("  -----------------------------");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Laptop Asus TUV
                                            if (Quantity >= 3) {

                                                System.out.println();
                                                HargaTotal = Quantity * 12000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 12000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("--------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Laptop Asus TUV

                                        break;
                                        // Akhir Case 2 Pilihan Laptop Asus TUV

                                    // Awal Case 3 Pilihan Laptop Asus Vivobook
                                    case 3:
                                        System.out.println();
                                        System.out.println("    Tipe  : Asus Vivobook ");
                                        System.out.println("    Harga : Rp. 8.000.000,00 ");
                                        System.out.println("  -----------------------------");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Laptop Asus Vivobook
                                            if (Quantity >= 4) {

                                                System.out.println();
                                                HargaTotal = Quantity * 8000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 8000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                     }
                                            }
                                            // Akhir If Perhitungan Harga Laptop Asus Vivobook

                                        break;
                                        // Akhir Case 3 Pilihan Laptop Asus Vivobook

                                    default:
                                        System.out.println();
                                        System.out.println(" Pilihan Tipe Tidak Ditemukan ");
                                        System.out.println("------------------------------");
                                }
                                // Akhir Switch Case Pilihan Tipe Laptop Asus

                            break;
                            // Akhir Case 1 Pilihan Brand Laptop

                        // Awal Case 2 Pilihan Brand Laptop
                        case 2:
                            System.out.println();
                            System.out.println("         MSI      ");
                            System.out.println("    --------------  ");
                            System.out.println("     1. Summit   ");
                            System.out.println("     2. Prestige ");
                            System.out.println("     3. Modern   ");
                            System.out.println("    --------------  ");
                            System.out.println();
                            System.out.print(" Masukan Pilihan Tipe Laptop     : ");
                            PilihanTipe = UserInput.nextInt();

                                // Awal Switch Case Pilihan Tipe Laptop MSI
                                switch (PilihanTipe) {
                                    // Awal Case 1 Pilihan Laptop MSI Summit
                                    case 1:
                                        System.out.println();
                                        System.out.println("    Tipe  : MSI Summit ");
                                        System.out.println("    Harga : Rp. 20.000.000,00 ");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Laptop MSI Summit
                                            if (Quantity >= 2) {

                                                System.out.println();
                                                HargaTotal = Quantity * 20000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 20000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Laptop MSI Summit

                                        break;
                                        // Akhir Case 1 Pilihan Laptop MSI Summit

                                    // Awal Case 2 Pilihan Laptop MSI Prestige
                                    case 2:
                                        System.out.println();
                                        System.out.println("    Tipe  : MSI Prestige ");
                                        System.out.println("    Harga : Rp. 15.000.000,00 ");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Laptop MSI Prestige
                                            if (Quantity >= 3) {

                                                System.out.println();
                                                HargaTotal = Quantity * 15000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 15000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Laptop MSI Prestige

                                        break;
                                        // Akhir Case Pilihan Laptop MSI Prestige

                                    // Awal Case 3 Pilihan Laptop MSI Modern
                                    case 3:
                                        System.out.println();
                                        System.out.println("    Tipe  : MSI Modern ");
                                        System.out.println("    Harga : Rp. 10.000.000,00 ");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Laptop MSI Modern
                                            if (Quantity >= 4) {

                                                System.out.println();
                                                HargaTotal = Quantity * 10000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 10000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                             }
                                            // Akhir If Perhitungan Harga Laptop MSI Modern

                                        break;
                                        // Akhir Case 3 Pilihan Laptop MSI Modern

                                    default:
                                        System.out.println();
                                        System.out.println(" Pilihan Tipe Tidak Ditemukan ");
                                        System.out.println("------------------------------");
                                }
                                // Akhir Switch Case Pilihan Tipe Laptop MSI
                            break;
                            // Akhir Case 2 Pilihan Brand Laptop

                        // Awal Case 3 Pilihan Brand Laptop
                        case 3:
                            System.out.println();
                            System.out.println("       Lenovo     ");
                            System.out.println("    --------------  ");
                            System.out.println("     1. Legion   ");
                            System.out.println("     2. Yoga     ");
                            System.out.println("     3. Ideapad  ");
                            System.out.println("    --------------  ");
                            System.out.println();
                            System.out.print(" Masukan Pilihan Tipe Laptop     : ");
                            PilihanTipe = UserInput.nextInt();

                                // Awal Switch Case Pilihan Tipe Laptop Lenovo
                                switch (PilihanTipe) {
                                    // Awal Case 1 Pilihan Laptop Lenovo Legion
                                    case 1:
                                        System.out.println();
                                        System.out.println("    Tipe  : Lenovo Legion ");
                                        System.out.println("    Harga : Rp. 20.000.000,00 ");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Laptop Lenovo Legion
                                            if (Quantity >= 2) {

                                                System.out.println();
                                                HargaTotal = Quantity * 20000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 20000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                     }
                                            }
                                            // Akhir If Perhitungan Harga Laptop Lenovo Legion

                                        break;
                                        // Akhir Case 1 Pilihan Laptop Lenovo Legion

                                    // Awal Case 2 Pilihan Laptop Lenovo Yoga
                                    case 2:
                                        System.out.println();
                                        System.out.println("    Tipe  : Lenovo Yoga ");
                                        System.out.println("    Harga : Rp. 15.000.000,00 ");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Laptop Lenovo Yoga
                                            if (Quantity >= 3) {

                                                System.out.println();
                                                HargaTotal = Quantity * 15000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 15000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Laptop Lenovo Yoga

                                        break;
                                        // Akhir Case 3 Pilihan Laptop Lenovo Yoga

                                    // Awal Case 3 Pilihan Laptop Lenovo Ideapad
                                    case 3:
                                        System.out.println();
                                        System.out.println("    Tipe  : Lenovo Ideapad ");
                                        System.out.println("    Harga : Rp. 8.000.000,00 ");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Laptop Ideapad
                                            if (Quantity >= 4) {

                                                System.out.println();
                                                HargaTotal = Quantity * 8000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 8000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Laptop Ideapad

                                        break;
                                        // Akhir Case 3 Pilihan Laptop Lenovo Ideapad

                                    default:
                                        System.out.println();
                                        System.out.println(" Pilihan Tipe Tidak Ditemukan ");
                                        System.out.println("------------------------------");
                                }
                                // Akhir Switch Case Pilihan Tipe Laptop Lenovo
                            break;
                            // Akhir Case 3 Pilihan Brand Laptop

                        // Awal Case 4 Pilihan Brand Laptop
                        case 4:
                            System.out.println();
                            System.out.println("       Acer      ");
                            System.out.println("    ------------  ");
                            System.out.println("     1. Nitro    ");
                            System.out.println("     2. Swift    ");
                            System.out.println("     3. Aspire   ");
                            System.out.println("    ------------  ");
                            System.out.println();
                            System.out.print(" Masukan Pilihan Tipe Laptop     : ");
                            PilihanTipe = UserInput.nextInt();

                                // Awal Switch Case Pilihan Tipe Laptop Acer
                                switch (PilihanTipe) {
                                    // Awal Case 1 Pilihan Laptop Acer Nitro
                                    case 1:
                                        System.out.println();
                                        System.out.println("    Tipe  : Acer Nitro ");
                                        System.out.println("    Harga : Rp. 15.000.000,00 ");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Laptop Acer Nitro
                                            if (Quantity >= 2) {

                                                System.out.println();
                                                HargaTotal = Quantity * 15000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 15000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Laptop Acer Nitro

                                        break;
                                        // Akhir Case 1 Pilihan Laptop Acer Nitro

                                    // Awal Case 2 Pilihan Laptop Acer Swift
                                    case 2:
                                        System.out.println();
                                        System.out.println("    Tipe  : Acer Swift ");
                                        System.out.println("    Harga : Rp. 10.000.000,00 ");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Laptop Acer Swift
                                            if (Quantity >= 3) {

                                                System.out.println();
                                                HargaTotal = Quantity * 10000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 10000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Laptop Acer Swift

                                        break;
                                        // Akhir Case 2 Pilihan Laptop Acer Swift

                                    // Awal Case 3 Pilihan Laptop Acer Aspire
                                    case 3:
                                        System.out.println();
                                        System.out.println("    Tipe  : Acer Aspire ");
                                        System.out.println("    Harga : Rp. 5.000.000,00 ");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Laptop Acer Aspire
                                            if (Quantity >= 4) {

                                                System.out.println();
                                                HargaTotal = Quantity * 5000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 5000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Laptop Acer Aspire

                                        break;
                                        // Awal Case 3 Pilihan Laptop Acer Aspire

                                    default:
                                        System.out.println();
                                        System.out.println(" Pilihan Tipe Tidak Ditemukan ");
                                        System.out.println("------------------------------");
                                }
                                // Akhir Switch Case Pilihan Tipe Laptop Acer
                            break;
                            // Akhir Case 4 Pilihan Brand Laptop

                        // Awal Case 5 Pilihan Brand Laptop
                        case 5:
                            System.out.println();
                            System.out.println("         Apple           ");
                            System.out.println("    ----------------        ");
                            System.out.println("     1. Macbook Air    ");
                            System.out.println("     2. Macbook Pro    ");
                            System.out.println("    ----------------        ");
                            System.out.println();
                            System.out.print(" Masukan Pilihan Tipe Laptop     : ");
                            PilihanTipe = UserInput.nextInt();

                                // Awal Switch Case Pilihan Tipe Laptop Apple
                                switch (PilihanTipe) {
                                    // Awal Case 1 Pilihan Laptop Macbook Air
                                    case 1:
                                        System.out.println();
                                        System.out.println("    Tipe  : Macbook Air ");
                                        System.out.println("    Harga : Rp. 15.000.000,00 ");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Laptop Macbook Air
                                            if (Quantity >= 3) {

                                                System.out.println();
                                                HargaTotal = Quantity * 15000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 15000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Laptop Macbook Air

                                        break;
                                        // Akhir Case 1 Pilihan Laptop Macbook Air

                                    // Awal Case 2 Pilihan Laptop Macbook Pro
                                    case 2:
                                        System.out.println();
                                        System.out.println("    Tipe  : Macbook Pro ");
                                        System.out.println("    Harga : Rp. 25.000.000,00 ");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Macbook Pro
                                            if (Quantity >= 2) {

                                                System.out.println();
                                                HargaTotal = Quantity * 25000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 25000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Macbook Pro

                                        break;
                                        // Akhir Case 2 Pilihan Laptop Macbook Pro

                                    default:
                                        System.out.println();
                                        System.out.println(" Pilihan Tipe Tidak Ditemukan ");
                                        System.out.println("------------------------------");
                                }
                                // Akhir Switch Case Pilihan Tipe Laptop Apple
                            break;

                        default:
                            System.out.println();
                            System.out.println(" Pilihan Brand Tidak Ditemukan ");
                            System.out.println("-------------------------------");
                        // Akhir Case 5 Pilihan Brand Laptop
                        }
                        // Akhir Switch Case Pilihan Brand Laptop

                break;
                // Akhir Case 1 Pilihan Produk

            // Awal Case 2 Pilihan Produk
            case 2 :
                System.out.println();
                System.out.println("        Handphone  ");
                System.out.println("    ---------------");
                System.out.println("     1. Oppo   ");
                System.out.println("     2. Vivo   ");
                System.out.println("     3. Samsung");
                System.out.println("     4. Xiaomi ");
                System.out.println("     5. Apple  ");
                System.out.println("    ---------------");
                System.out.println();
                System.out.print(" Masukan Pilihan Handphone       : ");
                PilihanBrand = UserInput.nextInt();

                    // Awal Switch Case Pilihan Brand HP
                     switch (PilihanBrand) {
                         // Awal Case 1 Pilihan Brand HP Oppo
                        case 1:
                            System.out.println();
                            System.out.println("         Oppo    ");
                            System.out.println("    -------------- ");
                            System.out.println("     1. Find x  ");
                            System.out.println("     2. Reno    ");
                            System.out.println("     3. A Series ");
                            System.out.println("    -------------- ");
                            System.out.println();
                            System.out.print(" Masukan Pilihan Tipe Handphone  : ");
                            PilihanTipe = UserInput.nextInt();

                                // Awal Switch Case Pilihan Tipe HP Oppo
                                switch (PilihanTipe) {
                                    // Awal Case 1 Pilihan Hp Oppo Find x
                                    case 1:
                                        System.out.println();
                                        System.out.println("    Tipe  : Oppo Find x ");
                                        System.out.println("    Harga : Rp. 15.000.000,00");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Hp Oppo Find x
                                            if (Quantity >= 2) {

                                                System.out.println();
                                                HargaTotal = Quantity * 15000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 15000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Hp Oppo Find x

                                        break;
                                        // Akhir Case 1 Pilihan Hp Oppo Find x

                                    // Awal Case 2 Pilihan Hp Oppo Reno
                                    case 2:
                                        System.out.println();
                                        System.out.println("    Tipe  : Oppo Reno ");
                                        System.out.println("    Harga : Rp. 8.000.000,00");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Hp Oppo Reno
                                            if (Quantity >= 3) {

                                                System.out.println();
                                                HargaTotal = Quantity * 8000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 8000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Hp Oppo Reno

                                        break;
                                        // Akhir Case 2 Pilihan Hp Oppo Reno

                                    // Awal Case 3 Pilihan Hp Oppo A
                                    case 3:
                                        System.out.println();
                                        System.out.println("    Tipe  : Oppo A ");
                                        System.out.println("    Harga : Rp. 3.000.000,00");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Hp Oppo A
                                            if (Quantity >= 4) {

                                                System.out.println();
                                                HargaTotal = Quantity * 3000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 3000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Hp Oppo A

                                        break;
                                        // Akhir Case 3 Pilihan Hp Oppo A

                                    default:
                                        System.out.println();
                                        System.out.println(" Pilihan Tipe Tidak Ditemukan ");
                                        System.out.println("------------------------------");
                                }
                                // Akhir Switch Case Pilihan Tipe HP Oppo

                            break;
                            // Akhir Case 1 Pilihan Brand HP Oppo

                        // Awal Case 2 Pilihan Brand HP Vivo
                        case 2:
                             System.out.println();
                             System.out.println("         Vivo     ");
                             System.out.println("    --------------  ");
                             System.out.println("     1. X Series ");
                             System.out.println("     2. V Series ");
                             System.out.println("     3. Y Series ");
                             System.out.println("    --------------  ");
                             System.out.println();
                             System.out.print(" Masukan Pilihan Tipe Handphone  : ");
                             PilihanTipe = UserInput.nextInt();

                                // Awal Switch Case Pilihan Tipe HP Vivo
                                switch (PilihanTipe) {
                                    // Awal Case 1 Pilihan Hp Vivo X
                                    case 1:
                                        System.out.println();
                                        System.out.println("    Tipe  : Vivo X ");
                                        System.out.println("    Harga : Rp. 10.000.000,00");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Vivo x
                                            if (Quantity >= 2) {

                                                System.out.println();
                                                HargaTotal = Quantity * 10000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 10000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Vivo x

                                        break;
                                        // Akhir Case 1 Pilihan Hp Vivo X

                                    // Awal Case 2 Pilihan Hp Vivo V
                                    case 2:
                                        System.out.println();
                                        System.out.println("    Tipe  : Vivo V ");
                                        System.out.println("    Harga : Rp. 5.000.000,00");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitumgan Harga Hp Vivo V
                                            if (Quantity >= 3) {

                                                System.out.println();
                                                HargaTotal = Quantity * 5000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 5000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Hp Vivo V

                                        break;
                                        // Akhir Case 2 Pilihan Hp Vivo V

                                    // Awal Case 3 Pilihan Hp Vivo Y
                                    case 3:
                                        System.out.println();
                                        System.out.println("    Tipe  : Vivo Y ");
                                        System.out.println("    Harga : Rp. 3.000.000,00");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Hp Vivo Y
                                            if (Quantity >= 4) {

                                                System.out.println();
                                                HargaTotal = Quantity * 3000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 3000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Hp Vivo Y

                                        break;
                                        // Akhir Case 3 Pilihan Hp Vivo Y

                                    default:
                                        System.out.println();
                                        System.out.println(" Pilihan Tipe Tidak Ditemukan ");
                                        System.out.println("------------------------------");
                                }
                                // Akhir Switch Case Pilihan Tipe HP Vivo

                             break;
                             // Akhir Case 2 Pilihan Brand HP Vivo

                        // Awal Case 3 Pilihan Brand HP Samsung
                        case 3:
                             System.out.println();
                             System.out.println("       Samsung    ");
                             System.out.println("    --------------  ");
                             System.out.println("     1. Fold     ");
                             System.out.println("     2. Flip     ");
                             System.out.println("     3. S Series ");
                             System.out.println("    --------------  ");
                             System.out.println();
                             System.out.print(" Masukan Pilihan Tipe Handphone  : ");
                             PilihanTipe = UserInput.nextInt();

                                // Awal Switch Case Pilihan Tipe HP Samsung
                                switch (PilihanTipe) {
                                    // Awal Case 1 Pilihan Hp Samsung Fold
                                    case 1:
                                        System.out.println();
                                        System.out.println("    Tipe  : Samsung Galaxy Fold ");
                                        System.out.println("    Harga : Rp. 25.000.000,00");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Hp Samsung Fold
                                            if (Quantity >= 2) {

                                                System.out.println();
                                                HargaTotal = Quantity * 25000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 25000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Hp Samsung Fold

                                        break;
                                        // Akhir Case 1 Pilihan Hp Samsung Fold

                                    // Awal Case 2 Pilihan Hp Samsung Flip
                                    case 2:
                                        System.out.println();
                                        System.out.println("    Tipe  : Samsung Galaxy Flip ");
                                        System.out.println("    Harga : Rp. 18.000.000,00");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Hp Samsung Flip
                                            if (Quantity >= 3) {

                                                System.out.println();
                                                HargaTotal = Quantity * 18000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 18000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Hp Samsung Flip

                                        break;
                                        // Akhir Case 2 Pilihan Hp Samsung Flip

                                    // Awal Case 3 Pilihan Hp Samsung S
                                    case 3:
                                        System.out.println();
                                        System.out.println("    Tipe  : Samsung Galaxy S ");
                                        System.out.println("    Harga : Rp. 15.000.000,00");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Hp Samsung S
                                            if (Quantity >= 4) {

                                                System.out.println();
                                                HargaTotal = Quantity * 15000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 15000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Hp Samsung S

                                        break;
                                        // Akhir Case 3 Pilihan Hp Samsung S

                                    default:
                                        System.out.println();
                                        System.out.println(" Pilihan Tipe Tidak Ditemukan ");
                                        System.out.println("------------------------------");
                                }
                                // Akhir Switch Case Pilihan Tipe HP Samsung

                             break;
                             // Akhir Case 3 Pilihan Brand HP Samsung

                        // Awal Case 4 Pilihan Brand HP Xiaomi
                        case 4:
                             System.out.println();
                             System.out.println("       Xiaomi    ");
                             System.out.println("    --------------  ");
                             System.out.println("     1. MI 12 ");
                             System.out.println("     2. Pocophone  ");
                             System.out.println("     3. Redmi ");
                             System.out.println("    --------------  ");
                             System.out.println();
                             System.out.print(" Masukan Pilihan Tipe Handphone  : ");
                             PilihanTipe = UserInput.nextInt();

                                // Awal Switch Case Pilihan Tipe HP Xiaomi
                                switch (PilihanTipe) {
                                    // Awal Case 1 Pilihan Hp Xiaomi 12
                                    case 1:
                                        System.out.println();
                                        System.out.println("    Tipe  : Xiaomi MI 12 ");
                                        System.out.println("    Harga : Rp. 10.000.000,00");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Hp Xiaomi 12
                                            if (Quantity >= 2) {

                                                System.out.println();
                                                HargaTotal = Quantity * 10000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 10000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Hp Xiaomi 12

                                        break;
                                        // Akhir Case 1 Pilihan Hp Xiaomi 12

                                    // Awal Case 2 Pilihan Hp Xiaomi Pocophone
                                    case 2:
                                        System.out.println();
                                        System.out.println("    Tipe  : Xiaomi Pocophone ");
                                        System.out.println("    Harga : Rp. 7.000.000,00");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Hp Xiaomi Pocophone
                                            if (Quantity >= 3) {

                                                System.out.println();
                                                HargaTotal = Quantity * 7000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 7000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Hp Xiaomi Pocophone

                                        break;
                                        // Akhir Case 2 Pilihan Hp Xiaomi Pocophone

                                    // Awal Case 3 Pilihan Hp Xiaomi Redmi
                                    case 3:
                                        System.out.println();
                                        System.out.println("    Tipe  : Xiaomi Redmi ");
                                        System.out.println("    Harga : Rp. 2.000.000,00");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal Perhitungan Harga Hp Xiaomi Redmi
                                            if (Quantity >= 4) {

                                                System.out.println();
                                                HargaTotal = Quantity * 2000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 2000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir Perhitungan Harga Hp Xiaomi Redmi

                                        break;
                                        // Akhir Case 3 Pilihan Hp Xiaomi Redmi

                                    default:
                                        System.out.println();
                                        System.out.println(" Pilihan Tipe Tidak Ditemukan ");
                                        System.out.println("------------------------------");
                                }
                                // Akhir Switch Case Pilihan Tipe HP Xiaomi

                             break;
                             // Akhir Case 4 Pilihan Brand HP Xiaomi

                        // Awal Case 5 Pilihan Brand HP Apple
                        case 5:
                             System.out.println();
                             System.out.println("        Apple     ");
                             System.out.println("    --------------  ");
                             System.out.println("     1. Iphone 13 ");
                             System.out.println("     2. Iphone 12 ");
                             System.out.println("     3. Iphone 11 ");
                             System.out.println("    --------------  ");
                             System.out.println();
                             System.out.print(" Masukan Pilihan Tipe Handphone  : ");
                             PilihanTipe = UserInput.nextInt();

                                // Awal Switch Case Pilihan Tipe HP Apple
                                switch (PilihanTipe) {
                                    // Awal Case 1 Pilihan Hp Iphone 13
                                    case 1:
                                        System.out.println();
                                        System.out.println("    Tipe  : Iphone 13 ");
                                        System.out.println("    Harga : Rp. 25.000.000,00");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Hp Iphone 13
                                            if (Quantity >= 2) {

                                                System.out.println();
                                                HargaTotal = Quantity * 25000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 25000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Hp Iphone 13

                                        break;
                                        // Akhir Case 1 Pilihan Hp Iphone 13

                                    // Awal Case 2 Pilihan Hp Iphone 12
                                    case 2:
                                        System.out.println();
                                        System.out.println("    Tipe  : Iphone 12 ");
                                        System.out.println("    Harga : Rp. 18.000.000,00");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Hp Iphone 12
                                            if (Quantity >= 3) {

                                                System.out.println();
                                                HargaTotal = Quantity * 18000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 18000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Hp Iphone 12

                                        break;
                                        // Awal Case 2 Pilihan Hp Iphone 12

                                    // Awal Case 3 Pilihan Hp Iphone 11
                                    case 3:
                                        System.out.println();
                                        System.out.println("    Tipe  : Iphone 11 ");
                                        System.out.println("    Harga : Rp. 15.000.000,00");

                                        System.out.println();
                                        System.out.print(" Jumlah Quantity                 : ");
                                        Quantity = UserInput.nextInt();
                                        System.out.println("-------------------------------------");

                                            // Awal If Perhitungan Harga Hp Iphone 11
                                            if (Quantity >= 4) {

                                                System.out.println();
                                                HargaTotal = Quantity * 15000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total   : %s %n ", KursIndo.format(HargaTotal));

                                                System.out.print(" Jumlah Diskon : %");
                                                Diskon = UserInput.nextInt();
                                                System.out.println("-------------------------------------");
                                                BesarDiskon = (Diskon * HargaTotal) / 100;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Besar Diskon  : %s %n ", KursIndo.format(BesarDiskon));

                                                HargaBersih = HargaTotal - BesarDiskon;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar  : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai    : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian     : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("-----------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar  : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("-----------------------------------");
                                                    }

                                            } else {
                                                System.out.println();
                                                HargaTotal = Quantity * 15000000;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf("  Harga Total  : %s %n ", KursIndo.format(HargaTotal));

                                                HargaBersih = HargaTotal;
                                                KursIndo.setDecimalFormatSymbols(FormatRp);
                                                System.out.printf(" Jumlah Bayar : %s %n ", KursIndo.format(HargaBersih));

                                                System.out.print(" Uang Tunai   : Rp. ");
                                                UangTunai = UserInput.nextInt();
                                                System.out.println("-------------------------------------");

                                                    if (UangTunai > HargaBersih) {

                                                        Kembalian = UangTunai - HargaBersih;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kembalian    : %s %n ", KursIndo.format(Kembalian));
                                                        System.out.println("---------------------------------");

                                                    } else if (HargaBersih > UangTunai) {

                                                        Kurang = HargaBersih - UangTunai;
                                                        KursIndo.setDecimalFormatSymbols(FormatRp);
                                                        System.out.printf("  Kurang Bayar : %s %n ", KursIndo.format(Kurang));
                                                        System.out.println("---------------------------------");
                                                    }
                                            }
                                            // Akhir If Perhitungan Harga Hp Iphone 11

                                        break;
                                        // Akhir Case 3 Pilihan Hp Iphone 11

                                    default:
                                        System.out.println();
                                        System.out.println(" Pilihan Tipe Tidak Ditemukan ");
                                        System.out.println("------------------------------");
                                }
                                // Akhir Switch Case Pilihan Tipe HP Apple

                             break;
                        default:
                            System.out.println();
                            System.out.println(" Pilihan Brand Tidak Ditemukan ");
                            System.out.println("-------------------------------");
                             // Akhir Case 5 Pilihan Brand HP Apple
                    }
                    // Akhir Switch Case Pilihan Brand

                break;
            default:
                System.out.println();
                System.out.println(" Pilihan Produk Tidak Ditemukan ");
                System.out.println("--------------------------------");
            // Akhir Case 2 Pilihan Produk
        }
        // Akhir Switch Case Pilihan Produk







    }

}
