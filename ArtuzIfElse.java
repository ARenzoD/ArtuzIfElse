package Artuz;

import java.util.Scanner;
import java.text.DecimalFormat;
public class ArtuzIfElse
{
    private static DecimalFormat df2 = new DecimalFormat("0.00");
    public static void main(String[]Args){
    Scanner input = new Scanner(System.in);
    String firstName = "";
    String lastName = "";
    
    String processor, motherboard, ram, ssd, hdd, psu, Case, fan, gpu, discountText =" ";
    int processor1, motherboard1, ram1, ssd1, hdd1, psu1, Case1, fan1, gpu1, quantityFan = 0;
    double discountTotal = 0.00;
    double priceProcessor = 0.00;
    double priceMotherboard = 0.00;
    double priceRam = 0.00;
    double priceSsd = 0.00;
    double priceHdd = 0.00;
    double pricePsu = 0.00;
    double priceCase = 0.00;
    double priceFan = 0.00;
    double totalFan = 0.00;
    double priceGpu = 0.00;
    
    System.out.println("\t\tRDA Pc Builder");
    System.out.println("Enter Your First Name: ");
    firstName = input.next();
    System.out.println("Enter Your Last Name: ");
    lastName = input.next();
    
    System.out.println("Hello: " +firstName + " " +lastName + ", Welcome to RDA Pc Builder!");
   
    System.out.println("Choose Your Processor: ");
    System.out.println("1.  AMD Ryzen 5 2600        P7999.00");
    System.out.println("2.  AMD Ryzen 5 2600X       P8500.00");
    System.out.println("3.  AMD Ryzen 3 3100        P5500.00");
    System.out.println("4.  AMD Ryzen 3 3200G       P6800.00");
    System.out.println("5.  AMD Ryzen 3 3300X       P7500.00");
    System.out.println("6.  AMD Ryzen 5 3400G       P8950.00");
    System.out.println("7.  AMD Ryzen 5 3500        P7950.00");
    System.out.println("8.  AMD Ryzen 5 3500X       P8500.00");
    System.out.println("9.  AMD Ryzen 5 3600        P10999.00");
    System.out.println("10. AMD Ryzen 5 3600X       P12000.00");
    processor1 = input.nextInt();
    
    switch(processor1){
        case 1:
        processor = "AMD Ryzen 5 2600";
        priceProcessor = 7999.00;
        break;
        case 2:
        processor = "AMD Ryzen 5 2600X";
        priceProcessor = 8500.00;
        break;
        case 3:
        processor = "AMD Ryzen 3 3100";
        priceProcessor = 5500.00;
        break;
        case 4: 
        processor = "AMD Ryzen 3 3200G";
        priceProcessor = 6800.00;
        break;
        case 5:
        processor = "AMD Ryzen 3 3300X";
        priceProcessor = 7500.00;
        break;
        case 6:
        processor = "AMD Ryzen 5 3400G";
        priceProcessor = 8950.00;
        break;
        case 7:
        processor = "AMD Ryzen 5 3500";
        priceProcessor = 7950.00;
        break;
        case 8:
        processor = "AMD Ryzen 5 3500X";
        priceProcessor = 8500.00;
        break;
        case 9:
        processor = "AMD Ryzen 5 3600";
        priceProcessor = 10999.00;
        break;
        case 10:
        processor = "AMD Ryzen 5 3600X";
        priceProcessor = 12000.00;
        break;
        default:
        processor = "No Processor!";
        priceProcessor = 0.00;
        break;
}
    
    System.out.println("==============================================================================");
    System.out.println("Your Processor is: " +processor);
    System.out.println("==============================================================================");
    
    System.out.println("Choose Your Motherboard: ");
    System.out.println("1.  Asus Prime B450M A                   P4590.00");
    System.out.println("2.  Asus TUF B450M Plus Gaming           P5220.00");
    System.out.println("3.  Asus TUF B450M PRO Gaming            P5390.00");
    System.out.println("4.  Asus ROG Strix B450 E Gaming         P8060.00");
    System.out.println("5.  MSI B450 Tomahawk Max                P6620.00");
    System.out.println("6.  Gigabyte B450 AORUS M                P5450.00");
    System.out.println("7.  Asus TUF B550M Plus                  P8370.00");
    System.out.println("8.  Asus ROG Strix B550 E Gaming WiFi    P15190.00");
    System.out.println("9.  MSI MAG B550M Mortar Wifi            P9450.00");
    System.out.println("10. Gigabyte B550M AORUS Pro             P7730.00");
    motherboard1 = input.nextInt();
    
    switch(motherboard1){
        case 1:
        motherboard = "Asus Prime B450M A";
        priceMotherboard = 4590.00;
        break;
        case 2:
        motherboard = "Asus TUF B450M Plus Gaming";
        priceMotherboard = 5220.00;
        break;
        case 3:
        motherboard = "Asus TUF B450M PRO Gaming";
        priceMotherboard = 5390.00;
        break;
        case 4: 
        motherboard = "Asus ROG Strix B450 E Gaming";
        priceMotherboard = 8060.00;
        break;
        case 5:
        motherboard = "MSI B450 Tomahawk Max";
        priceMotherboard = 6620.00;
        break;
        case 6:
        motherboard = "Gigabyte B450 AORUS M";
        priceMotherboard = 5450.00;
        break;
        case 7:
        motherboard = "Asus TUF B550M Plus";
        priceMotherboard = 8370.00;
        break;
        case 8:
        motherboard = "Asus ROG Strix B550 E Gaming WiFi";
        priceMotherboard = 15190.00;
        break;
        case 9:
        motherboard = "MSI MAG B550M Mortar Wifi";
        priceMotherboard = 9450.00;
        break;
        case 10:
        motherboard= "Gigabyte B550M AORUS Pro";
        priceMotherboard = 7730.00;
        break;
        default:
        motherboard = "No Motherboard!";
        break;
    
    
}   
    System.out.println("==============================================================================");
    System.out.println("Your Motherboard is: " +motherboard);
    System.out.println("==============================================================================");
   
    System.out.println("Choose Your RAM: ");
    System.out.println("1.  16gb (dual) ddr4 3000 G.Skill Trident Z RGB black        P4950.00");
    System.out.println("2.  16gb (dual) ddr4 3200 Kingston Predator RGB              P4690.00");
    System.out.println("3.  16gb (dual) ddr4 3200 Aorus RGB, with DEMO kit           P8420.00");
    System.out.println("4.  16gb (dual) ddr4 3200 Tforce Delta RGB TUF               P4800.00");
    System.out.println("5.  16gb (dual) ddr4 3200 Tforce Xtreem aRGB black           P6200.00");
    System.out.println("6.  16gb (dual) ddr4 3200 Aorus RGB, NO demo kit             P6190.00");
    System.out.println("7.  16gb (dual) ddr4 3200 G.Skill Ripjaws V, black           P4000.00");
    System.out.println("8.  32gb (dual) ddr4 3200 Kingston Fury RGB black            P7999.00");
    System.out.println("9.  32gb (dual) ddr4 3200 Tforce Delta RGB black             P8999.00");
    System.out.println("10. 32gb (dual) ddr4 3200 Tforce Vulcan TUF                  P7300.00");
    ram1 = input.nextInt();
    
    switch(ram1){
        case 1:
        ram = "16gb (dual) ddr4 3000 G.Skill Trident Z RGB black";
        priceRam = 4950.00;
        break;
        case 2:
        ram = "16gb (dual) ddr4 3200 Kingston Predator RGB";
        priceRam = 4690.00;
        break;
        case 3:
        ram = "16gb (dual) ddr4 3200 Aorus RGB, with DEMO kit";
        priceRam = 8420.00;
        break;
        case 4: 
        ram  = "16gb (dual) ddr4 3200 Tforce Delta RGB TUF";
        priceRam = 4800.00;
        break;
        case 5:
        ram = "16gb (dual) ddr4 3200 Tforce Xtreem aRGB black";
        priceRam = 6200.00;
        break;
        case 6:
        ram  = "16gb (dual) ddr4 3200 Aorus RGB, NO demo kit";
        priceRam = 6190.00;
        break;
        case 7:
        ram  = "16gb (dual) ddr4 3200 G.Skill Ripjaws V, black";
        priceRam = 4000.00;
        break;
        case 8:
        ram  = "32gb (dual) ddr4 3200 Kingston Fury RGB black";
        priceRam = 7999.00;
        break;
        case 9:
        ram  = "32gb (dual) ddr4 3200 Tforce Delta RGB black";
        priceRam = 8999.00;
        break;
        case 10:
        ram  = "32gb (dual) ddr4 3200 Tforce Vulcan TUF";
        priceRam = 7300.00;
        break;
        default:
        ram  = "No RAM!";
        break;
    
}
    System.out.println("==============================================================================");
    System.out.println("Your RAM is: " +ram);
    System.out.println("==============================================================================");
   
    System.out.println("Choose Your SSD: ");
    System.out.println("1.  250gb WDC black SN750 SSD M.2 NVMe          P3000.00");
    System.out.println("2.  256gb Patriot VPR100 RGB SSD M.2 NVMe       P3050.00");
    System.out.println("3.  512gb Patriot P300 SSD M.2 NVMe             P3600.00");
    System.out.println("4.  512gb Gigabyte SSD M.2 NVMe                 P4000.00");
    System.out.println("5.  512gb Patriot VPN100 SSD M.2 NVMe           P4160.00");
    System.out.println("6.  512gb Gigabyte RGB SSD M.2 NVMe             P5420.00");
    System.out.println("7.  1tb Patriot P300 SSD M.2 NVMe               P6930.00");
    System.out.println("8.  1tb Patriot VPN100 SSD M.2 NVMe             P7590.00");
    System.out.println("9.  1tb WDC black SN750 SSD M.2 NVMe            P11620.00");
    System.out.println("10. 1tb Samsung 970 EVO PLUS SSD M.2 NVMe       P12930.00");
    ssd1 = input.nextInt();
    
     switch(ssd1){
        case 1:
        ssd = "250gb WDC black SN750 SSD M.2 NVMe";
        priceSsd = 3000.00;
        break;
        case 2:
        ssd = "256gb Patriot VPR100 RGB SSD M.2 NVMe";
        priceSsd = 3050.00;
        break;
        case 3:
        ssd = "256gb Patriot VPR100 RGB SSD M.2 NVMe";
        priceSsd = 3600.00;
        break;
        case 4: 
        ssd  = "512gb Gigabyte SSD M.2 NVMe";
        priceSsd = 4000.00;
        break;
        case 5:
        ssd = "512gb Patriot VPN100 SSD M.2 NVMe";
        priceSsd = 4160.00;
        break;
        case 6:
        ssd  = "512gb Gigabyte RGB SSD M.2 NVMe";
        priceSsd = 5420.00; 
        break;
        case 7:
        ssd  = "1tb Patriot P300 SSD M.2 NVMe";
        priceSsd = 6930.00;
        break;
        case 8:
        ssd  = "1tb Patriot VPN100 SSD M.2 NVMe";
        priceSsd = 7590.00;
        break;
        case 9:
        ssd  = "1tb WDC black SN750 SSD M.2 NVMe";
        priceSsd = 11620.00;
        break;
        case 10:
        ssd  = "1tb Samsung 970 EVO PLUS SSD M.2 NVMe";
        priceSsd = 12930.00;
        break;
        default:
        ssd = "No SSD!";
        break;
    
 }
    System.out.println("==============================================================================");
    System.out.println("Your SSD is: " +ssd);
    System.out.println("==============================================================================");

    System.out.println("Choose Your HDD: ");
    System.out.println("1.  1tb WDC blue hdd, 64mb 7200rpm          P2310.00");
    System.out.println("2.  1tb WDC blue Scorpio, 128mb 5400rpm     P2450.00");
    System.out.println("3.  2tb WDC blue hdd, 256mb 5400rpm         P3140.00");
    System.out.println("4.  1tb WDC black hdd, 64mb 7200rpm         P4280.00");
    System.out.println("5.  2tb WDC blue Scorpio, 128mb 5400rpm     P4340.00");
    System.out.println("6.  3tb WDC blue hdd, 64mb 5400rpm          P4520.00");
    System.out.println("7.  2tb Seagate Barracuda, 128mb 5400rpm    P4670.00");
    System.out.println("8.  4tb WDC blue hdd, 64mb 5400rpm          P4900.00");
    System.out.println("9.  4tb Seagate Barracuda, 256mb 5400rpm    P5220.00");
    System.out.println("10. 6tb WDC blue hdd, 256mb 5400rpm         P8180.00");
    hdd1 = input.nextInt();
    
    switch(hdd1){
        case 1:
        hdd = "1tb WDC blue hdd, 64mb 7200rpm";
        priceHdd = 2310.00;
        break;
        case 2:
        hdd = "1tb WDC blue Scorpio, 128mb 5400rpm";
        priceHdd = 2450.00;
        break;
        case 3:
        hdd = "2tb WDC blue hdd, 256mb 5400rpm";
        priceHdd = 3140.00;
        break;
        case 4: 
        hdd  = "1tb WDC black hdd, 64mb 7200rpm";
        priceHdd = 4280.00;
        break;
        case 5:
        hdd = "2tb WDC blue Scorpio, 128mb 5400rpm";
        priceHdd = 4340.00;
        break;
        case 6:
        hdd  = "3tb WDC blue hdd, 64mb 5400rpm";
        priceHdd = 4520.00;
        break;
        case 7:
        hdd  = "2tb Seagate Barracuda, 128mb 5400rpm";
        priceHdd = 4670.00;
        break;
        case 8:
        hdd = "4tb WDC blue hdd, 64mb 5400rpm";
        priceHdd = 4900.00;
        break;
        case 9:
        hdd  = "4tb Seagate Barracuda, 256mb 5400rpm";
        priceHdd = 5220.00;
        break;
        case 10:
        hdd  = "6tb WDC blue hdd, 256mb 5400rpm";
        priceHdd = 8180.00;
        break;
        default:
        hdd = "No HDD!";
        break;
    
}
    System.out.println("==============================================================================");
    System.out.println("Your HDD is: " +hdd);
    System.out.println("==============================================================================");

    System.out.println("Choose Your PSU: ");
    System.out.println("1.  Seasonic Core GC550, 550watts PSU, 80 gold                          P4280.00");
    System.out.println("2.  Corsair 550watts PSU, CX, CX550M, 80 bronze, semi modular           P4330.00");
    System.out.println("3.  CM Cooler Master 750watts, PSU, MWE 750 v2, 80 bronze               P4570.00");
    System.out.println("4.  Deep Cool DC 750watts PSU, DQ, 80 Gold                              P4630.00");
    System.out.println("5.  FSP 650watts, PSU, Hydro GE, 80 gold, full modular                  P4780.00");
    System.out.println("6.  Seasonic Focus GM gold 650watts PSU, semi modular                   P4920.00");
    System.out.println("7.  NZXT C650, 650watts PSU, 80 Gold, modular                           P5000.00");
    System.out.println("8.  FSP 650watts, PSU, Dagger Pro SFX series, 80 bronze, full modular   P5220.00");
    System.out.println("9.  Seasonic Focus GX gold 650watts PSU, full modular                   P5570.00");
    System.out.println("10. NZXT C750, 750watts PSU, 80 Gold, modular                           P5650.00");
    psu1 = input.nextInt();
    
     switch(psu1){
        case 1:
        psu = "Seasonic Core GC550, 550watts PSU, 80 gold";
        pricePsu = 4280.00;
        break;
        case 2:
        psu = "Corsair 550watts PSU, CX, CX550M, 80 bronze, semi modular";
        pricePsu = 4330.00;
        break;
        case 3:
        psu = "CM Cooler Master 750watts, PSU, MWE 750 v2, 80 bronze";
        pricePsu = 4570.00;
        break;
        case 4: 
        psu  = "Deep Cool DC 750watts PSU, DQ, 80 Gold";
        pricePsu = 4630.00;
        break;
        case 5:
        psu = " FSP 650watts, PSU, Hydro GE, 80 gold, full modular";
        pricePsu = 4780.00;
        break;
        case 6:
        psu  = "Seasonic Focus GM gold 650watts PSU, semi modular";
        pricePsu = 4920.00;
        break;
        case 7:
        psu  = "NZXT C650, 650watts PSU, 80 Gold, modular";
        pricePsu = 5000.00;
        break;
        case 8:
        psu = "FSP 650watts, PSU, Dagger Pro SFX series, 80 bronze, full modular";
        pricePsu = 5220.00;
        break;
        case 9:
        psu  = "Seasonic Focus GX gold 650watts PSU, full modular";
        pricePsu = 5570.00;
        break;
        case 10:
        psu  = "NZXT C750, 750watts PSU, 80 Gold, modular";
        pricePsu = 5650.00;
        break;
        default:
        psu = "No PSU!";
        break;
}
    System.out.println("==============================================================================");
    System.out.println("Your PSU is: " +psu);
    System.out.println("==============================================================================");

    System.out.println("Choose Your Case: ");
    System.out.println("1.  Tecware Nexus Evo TG, ATX, black            P2190.00");
    System.out.println("2.  DarkFlash DLM21 Mesh TG, mATX, black        P2200.00");
    System.out.println("3.  Tecware Alpha M TG, mATX, white             P2250.00");
    System.out.println("4.  MSI MAG Forge 100R TG, ATX                  P3420.00");
    System.out.println("5.  Tecware VXR TG, ATX, white,dual chamber     P4000.00");
    System.out.println("6.  Asus TUF GT301 RGB, black, ATX              P4710.00");
    System.out.println("7.  Phanteks P400 TG, ATX, black-red accent     P4480.00");
    System.out.println("8.  Phanteks Enthoo Pro M, ATX, x-side, black   P4370.00");
    System.out.println("9.  NZXT H210i Smart TG, ITX Matte black+red    P6950.00");
    System.out.println("10. NZXT H510 Elite Smart TG, Matte white, ATX  P8650.00");
    Case1 = input.nextInt();
    
    switch(Case1){
        case 1:
        Case = "Tecware Nexus Evo TG, ATX, black";
        priceCase = 2190.00;
        break;
        case 2:
        Case = "DarkFlash DLM21 Mesh TG, mATX, black";
        priceCase = 2200.00;
        break;
        case 3:
        Case = "Tecware Alpha M TG, mATX, white ";
        priceCase = 2250.00;
        break;
        case 4: 
        Case = "MSI MAG Forge 100R TG, ATX";
        priceCase = 3420.00;
        break;
        case 5:
        Case = "Tecware VXR TG, ATX, white,dual chamber";
        priceCase = 4000.00;
        break;
        case 6:
        Case = "Asus TUF GT301 RGB, black, ATX";
        priceCase = 4710.00;
        break;
        case 7:
        Case = "Phanteks P400 TG, ATX, black-red accent";
        priceCase = 4480.00;
        break;
        case 8:
        Case = "Phanteks Enthoo Pro M, ATX, x-side, black";
        priceCase = 4370.00;
        break;
        case 9:
        Case = "NZXT H210i Smart TG, ITX Matte black+red";
        priceCase = 6950.00;
        break;
        case 10:
        Case = "NZXT H510 Elite Smart TG, Matte white, ATX";
        priceCase = 8650.00;
        break;
        default:
        Case = "No Case!";
        break;
}
    System.out.println("==============================================================================");
    System.out.println("Your Case is: " +Case);
    System.out.println("==============================================================================");
    
    System.out.println("Choose Your Fan: ");
    System.out.println("1.  IDCooling DF12025 RGB Trio, 3 Pack, 120mm, RGB SYNC                 P1950.00");
    System.out.println("2.  Corsair HD120 RGB, 120mm, 3 pack, controller                        P4950.00");
    System.out.println("3.  Raidmax A120R3 RGB, 120mm, 3 pack                                   P790.00 ");
    System.out.println("4.  Thermaltake TT Riing 12 RGB, 120mm, 3 Pack                          P2230.00");
    System.out.println("5.  Inwin Sirius Loop ASL120 aRGB, 120mm, 3 pack                        P1570.00");
    System.out.println("6.  IDCooling XF12025 white blade white led, 1 Pack                     P330.00 ");
    System.out.println("7.  darkFlash CF11 RGB, 120mm                                           P340.00 ");
    System.out.println("8.  darkFlash DR11 Rainbow, 120mm                                       P200.00 ");
    System.out.println("9.  Cryorig QF120 Silent, 120mm                                         P500.00 ");
    System.out.println("10. Cryorig QF120 Balance, 120mm                                        P500.00 ");
    fan1 = input.nextInt();
    
    switch(fan1){
        case 1:
        fan = "IDCooling DF12025 RGB Trio, 3 Pack, 120mm, RGB SYNC";
        priceFan = 1950.00;
        break;
        case 2:
        fan = "Corsair HD120 RGB, 120mm, 3 pack, controller";
        priceFan = 4950.00;
        break;
        case 3:
        fan = "Raidmax A120R3 RGB, 120mm, 3 pack";
        priceFan = 790.00;
        break;
        case 4: 
        fan = "Thermaltake TT Riing 12 RGB, 120mm, 3 Pack";
        priceFan = 2230.00;
        break;
        case 5:
        fan = "Inwin Sirius Loop ASL120 aRGB, 120mm, 3 pack";
        priceFan = 1570.00;
        break;
        case 6:
        fan = "IDCooling XF12025 white blade white led, 1 Pack";
        priceFan = 330.00;
        break;
        case 7:
        fan = "darkFlash CF11 RGB, 120mm";
        priceFan = 340.00;
        break;
        case 8:
        fan = "darkFlash DR11 Rainbow, 120mm";
        priceFan = 200.00;
        break;
        case 9:
        fan = "Cryorig QF120 Silent, 120mm";
        priceFan = 500.00;
        break;
        case 10:
        fan = "Cryorig QF120 Balance, 120mm";
        priceFan = 500.00;
        break;
        default:
        fan = "No Fan!";
        break;
}
    System.out.println("==============================================================================");
    System.out.println("Your Fan is: " +fan);
    System.out.println("==============================================================================");
    System.out.println("How many " + fan + " do you need?");
    quantityFan = input.nextInt();
    totalFan = (priceFan * quantityFan);
    
    
    
    System.out.println("Choose Your GPU: ");
    System.out.println("1.  Palit GTX 1650S SUPER StormX                P8360.00 ");
    System.out.println("2.  Asus GTX 1660S SUPER TUF Gaming X3 OC       P15870.00");
    System.out.println("3.  Sapphire RX5700XT Pulse OC                  P20999.00");
    System.out.println("4.  MSI RX570 Armor OC                          P9500.00 ");
    System.out.println("5.  Asus RTX 2060 Phoenix OC                    P18760.00");
    System.out.println("6.  Inno3d RTX 2080S SUPER Twin X2 OC           P32500.00");
    System.out.println("7.  Gigabyte RTX 3070 Master                    P47340.00");
    System.out.println("8.  MSI RTX 3080 Gaming X Trio                  P57150.00");
    System.out.println("9.  Inno3d RTX 3090 iChill X4 OC                P89580.00");
    System.out.println("10. MSI RTX 3090 Gaming X Trio                  P94120.00");
    gpu1 = input.nextInt();
    
    
    switch(gpu1){
        case 1:
        gpu = "Palit GTX 1650S SUPER StormX";
        priceGpu = 8360.00;
        break;
        case 2:
        gpu = "Asus GTX 1660S SUPER TUF Gaming X3 OC";
        priceGpu = 15870.00;
        break;
        case 3:
        gpu = "Sapphire RX5700XT Pulse OC";
        priceGpu = 20999.00;
        break;
        case 4: 
        gpu = "MSI RX570 Armor OC";
        priceGpu = 9500.00;
        break;
        case 5:
        gpu = "Asus RTX 2060 Phoenix OC";
        priceGpu = 18760.00;
        break;
        case 6:
        gpu= "Inno3d RTX 2080S SUPER Twin X2 OC";
        priceGpu = 32500.00;
        break;
        case 7:
        gpu = "Gigabyte RTX 3070 Master";
        priceGpu = 47340.00;
        break;
        case 8:
        gpu = "MSI RTX 3080 Gaming X Trio";
        priceGpu = 57150.00;
        break;
        case 9:
        gpu ="89580.00";
        break;
        case 10:
        gpu = "Inno3d RTX 3090 iChill X4 OC";
        priceGpu = 94120.00; 
        break;
        default:
        gpu = "No GPU!";
        break;
        
    }  
    System.out.println("==============================================================================");
    System.out.println("Your GPU is: " +gpu);
    System.out.println("==============================================================================");
    
    double total = priceProcessor + priceMotherboard + priceRam + priceSsd + priceHdd + pricePsu + priceCase + totalFan + priceGpu;
    
    if(total < 25000){
        System.out.println("No Discount");
        discountText = "You have No Discount";
    } else if(total < 50000){
        System.out.println("You have 5% Discount");
        discountText = "You have 5% discount";
        discountTotal = .05;
    } else if(total < 75000){
        System.out.println("You have 10% Discount");
        discountText = "You Have 10% Discount";
        discountTotal = .1;
    }   else {
        System.out.println("You have 20% Discount");
        discountText = ("You have 20% Discount");
        discountTotal = .2;
    }
    System.out.println("==========================================================================================================================================");   
    System.out.println("\t\t\t\t\t\t\tHello " +firstName + " " + lastName + "!"); 
    System.out.println("\t\t\t\t\t\t\tWelcome to RDA PC Builder!");
    System.out.println("\t\t\t\t\t\t\tYour Final Build is:");
    System.out.println("==========================================================================================================================================");
    
    System.out.printf("%-30s%-80s%-10s\n", "Parts","Model", "Price");
    System.out.printf("%-30s%-80s%-10s\n", "Processor", processor, "P"+df2.format(priceProcessor));
    System.out.printf("%-30s%-80s%-10s\n", "Motherboard", motherboard, "P"+df2.format(priceMotherboard));
    System.out.printf("%-30s%-80s%-10s\n", "RAM", ram, "P"+df2.format(priceRam));
    System.out.printf("%-30s%-80s%-10s\n", "SSD", ssd, "P"+df2.format(priceSsd));
    System.out.printf("%-30s%-80s%-10s\n", "HDD", hdd, "P"+df2.format(priceHdd));
    System.out.printf("%-30s%-80s%-10s\n", "PSU", psu, "P"+df2.format(pricePsu));
    System.out.printf("%-30s%-80s%-10s\n", "Case", Case, "P"+df2.format(priceCase));
    System.out.printf("%-30s%-80s%-10s\n", "Fan", fan, "P"+df2.format(priceFan)+" x" + quantityFan);
    System.out.printf("%-30s%-80s%-10s\n", "GPU", gpu, "P"+df2.format(priceGpu));
    System.out.println("==========================================================================================================================================");
    System.out.println("Total:                                                                                                        " +"P"+df2.format(total));
    System.out.println("Discount:                                                                                                     " +discountText);
    System.out.println("Total Discount:                                                                                               " +"P"+df2.format((total * discountTotal)));
    System.out.println("Total:                                                                                                       " +"P"+df2.format(( total - (total * discountTotal))));
    

   }

   }



    