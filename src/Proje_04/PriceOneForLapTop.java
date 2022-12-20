package Proje_04;

import java.util.ArrayList;

public class PriceOneForLapTop {
    public int getPrice(int laptopID){

        Data pcPrice = new Data();
        ArrayList<String> pc = pcPrice.AllData(laptopID); // 110001// ps arraylıstı psPrice objsinin Alldata methodunun retorn etmesi
        int totalAmount = Calculatıon.getSize(pc) + Calculatıon.getCPU(pc) + Calculatıon.getRam(pc) + Calculatıon.getColor(pc);
        return totalAmount;
    }



    }
