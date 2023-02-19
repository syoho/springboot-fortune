package com.example.fortuneapplication;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class FortuneService {
    //定义一个数组，用于保存所有可能出现的占卜结果
    private final String[] fortunes = {
            "A beautiful, smart, and loving person will be coming into your life.",
            "A dubious friend may be an enemy in camouflage.",
            "A faithful friend is a strong defense.",
            "A fresh start will put you on your way.",
            "A friend asks only for your time not your money.",
            "A friend is a present you give yourself.",
            "A gambler not only will lose what he has, but also will lose what he doesn’t have.",
            "A golden egg of opportunity falls into your lap this month.",
            "A good time to finish up old tasks.",
            "A hunch is creativity trying to tell you something.",
            "A lifetime of happiness is in store for you.",
            "A light heart carries you through all the hard times.",
            "A new perspective will come with the new year. Good luck!",
            "A person is never too old to learn.",
            "A pleasant surprise is waiting for you."
    };

    //定义一个方法，用于获取一个随机的占卜结果
    public String getFortune() {
        int index = new Random().nextInt(fortunes.length);
        return fortunes[index];
    }
}

