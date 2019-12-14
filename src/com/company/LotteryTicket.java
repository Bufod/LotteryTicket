package com.company;

public class LotteryTicket {
    int number;
    int[] combination = new int[6];
    LotteryTicket(int number){
        this.number = number;
        for (int i = 0; i < combination.length; i++){
            combination[i] = 1 + (int)(Math.random()*50);
        }
    }

    public boolean getLucky(int lNum){
        int sum = 0;
        for (int i = 0; i < combination.length; i++){
            sum += combination[i];
        }
        return sum == lNum;
    }

    public String getCombination(){
        String ans = "";
        for (int i = 0; i < combination.length; i++)
            ans += Integer.toString(combination[i]) + " ";
        return ans;
    }
}
