package com.company;

import java.util.Random;

abstract class Student {
    protected int rating;

    public int getRating() {
        return rating;
    }

    public void makeProgramming() {
        Random random = new Random();
        if (this instanceof ITISStudent) {
            int score = random.nextInt(2) + 3;
            this.rating += score;
            System.out.println("Студент ИТИС сдал лабораторную работу по программированию и получил " + score + " балла(ов)");
        } else {
            if (this instanceof IVMIITStudent) {
                int score = random.nextInt(2) + 4;
                this.rating += score;
                System.out.println("Студент ИВМиИТ сдал лабораторную работу по программированию и получил " + score + " балла(ов)");
            }
        }
    }

    public void makeElecEngineering() {
        Random random = new Random();
        if (this instanceof ITISStudent) {
            int score = random.nextInt(2) + 4;
            this.rating += score;
            System.out.println("Студент ИТИС сдал лабораторную работу по электротехнике и получил " + score + " балла(ов)");
        } else {
            if (this instanceof IVMIITStudent) {
                int score = random.nextInt(2) + 3;
                this.rating += score;
                System.out.println("Студент ИВМиИТ сдал лабораторную работу по электротехнике и получил " + score + " балла(ов)");
            }
        }
    }
}
