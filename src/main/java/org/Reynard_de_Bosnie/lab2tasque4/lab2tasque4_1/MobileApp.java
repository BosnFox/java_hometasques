package org.Reynard_de_Bosnie.lab2tasque4.lab2tasque4_1;

public class MobileApp implements stockObserver {
    String mobileUserName;

    public MobileApp(String mobileUserName) {
        this.mobileUserName = mobileUserName;
    }

    @Override
    public void update(String position, int delta) {
        System.out.println(this.mobileUserName + "！" + position + "的价格为" + delta + "美元");
    }
}
