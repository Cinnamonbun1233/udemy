package com.javastart.springcontext.repository;

import com.javastart.springcontext.entity.CombatCat;

public class FightClubImpl implements FightClub {
    private CombatCat loriCat;
    private CombatCat baxterCat;

    @Override
    public void fight() {
        System.out.println("First cat:" + loriCat.toString());
        System.out.println("Second cat:" + baxterCat.toString());

        Integer loriStrength = loriCat.getStrength();
        Integer baxterStrength = baxterCat.getStrength();
        String loriName = loriCat.getName();
        String baxterName = this.baxterCat.getName();

        if (loriStrength > baxterStrength) {
            System.out.println(loriName + " cat win");
        } else if (baxterStrength > loriStrength) {
            System.out.println(baxterName + " cat win");
        } else {
            System.out.println("Cats strength is the same");
        }
    }

    public void setLoriCat(CombatCat loriCat) {
        this.loriCat = loriCat;
    }

    public void setBaxterCat(CombatCat baxterCat) {
        this.baxterCat = baxterCat;
    }
}