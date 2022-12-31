package by.ivankov.task1;

import by.ivankov.task1.entity.Ball;
import by.ivankov.task1.entity.Basket;
import by.ivankov.task1.service.BallService;
import by.ivankov.task1.service.impl.BallServiceImpl;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class BallServiceImplTest {

    @org.testng.annotations.Test
    public void testSumWeight() {
        List<Ball> ballList = List.of(Ball.BALL, Ball.BALL1, Ball.BALL2, Ball.BALL3, Ball.BALL4, Ball.BALL5);
        Basket basket = new Basket(ballList);
        BallService service = new BallServiceImpl();
        double actual = service.sumWeight(basket);
        double expected = 27;
        assertEquals(actual, expected, 1);
    }

    @Test
    public void testColorBallsInBasket() {
        List<Ball> ballList = List.of(Ball.BALL, Ball.BALL1, Ball.BALL2, Ball.BALL3, Ball.BALL4, Ball.BALL5);
        Basket basket = new Basket(ballList);
        BallService service = new BallServiceImpl();
        int actual = (int) ((BallServiceImpl) service).ColorBallsInBasket(basket, "blue");
        int expected = 3;
        assertEquals(actual, expected);
    }
}
