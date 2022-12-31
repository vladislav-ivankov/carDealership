package by.ivankov.task1.service.impl;

import by.ivankov.task1.entity.Ball;
import by.ivankov.task1.entity.Basket;
import by.ivankov.task1.service.BallService;

import java.util.List;

public class BallServiceImpl implements BallService {

    @Override
    public double sumWeight(Basket basket) {
        List<Ball> ballsList = basket.getBalls();
        double sumResult = 0;
        for (int i = 0; i < ballsList.size(); i++) {
            sumResult += ballsList.get(i).getWeight();
        }
        return sumResult;
    }

    @Override
    public double ColorBallsInBasket(Basket basket, String colour) {
        List<Ball> list = basket.getBalls();
        int sumOfSameBalls = 0;
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i).getColor().equals(colour)) {
                ++sumOfSameBalls;
            }
        }
        return sumOfSameBalls;
    }
}
