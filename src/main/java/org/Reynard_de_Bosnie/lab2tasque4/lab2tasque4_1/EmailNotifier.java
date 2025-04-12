package org.Reynard_de_Bosnie.lab2tasque4.lab2tasque4_1;

public class EmailNotifier implements stockObserver {
    String mail;

    public EmailNotifier(String mail) {
        this.mail = mail;
    }

    @Override
    public void update(String position, int delta) {
        System.out.println("价格变动通知发送至" + mail + ":" + position + ":" + delta);
    }
}
