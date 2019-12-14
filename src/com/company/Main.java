package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LotteryTicket[] lotteryTickets = new LotteryTicket[1000000];
        for (int i = 0; i < lotteryTickets.length; i++)
            lotteryTickets[i] = new LotteryTicket(i+1);

        int lNum = in.nextInt();
        for (int i = 0; i < lotteryTickets.length; i++){
            LotteryTicket curTicket = lotteryTickets[i];
            if(curTicket.getLucky(lNum)) {
                System.out.println("Билет номер: " + curTicket.number +
                        " является счастливым");
                System.out.println("Комбинация: " + curTicket.getCombination());
            }

        }
    }
}
