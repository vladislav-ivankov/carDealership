package by.ivankov.task1.service;

import by.ivankov.task1.entity.Basket;

public interface BallService {
    double sumWeight(Basket basket);

    double ColorBallsInBasket(Basket basket, String colour);
}
