package org.Reynard_de_Bosnie.lab2tasque4.lab2tasque4_1;

import org.Reynard_de_Bosnie.TaskDescription;
import org.Reynard_de_Bosnie.utils.Solution;

@TaskDescription(taskNumber = 11,
        taskDescription = "Observer pattern")
public class Main implements Solution {
    @Override
    public void execute() {
        Stock stock = new Stock(0, "BaoBag Inc.");
        Stock stock2 = new Stock(1000, "BaoBaZhuo Inc.");
        MobileApp gook = new MobileApp("Daoyu Zhou");
        stock.addObserver(gook);
        stock.setCurrentPrice(100);
        stock.addObserver(new EmailNotifier("baobag@meizhu.ch"));
        stock.setCurrentPrice(200);
        stock2.addObserver(new EmailNotifier("baoba@meizhu.ch"));
        stock2.setCurrentPrice(300);
    }
}
