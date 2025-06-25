package cursoJavaCompleto.Intermediario.enumsEComposicao.application;

import cursoJavaCompleto.Intermediario.enumsEComposicao.entities.Order;
import cursoJavaCompleto.Intermediario.enumsEComposicao.enums.OrderStatus;

import java.util.Date;

public class ProgramEnum {
    public static void main(String[] args) {
        Order order = new Order(1850,
                new Date(),
                OrderStatus.PENDING_PAYMENT);

        OrderStatus os1 = OrderStatus.SHIPPED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(order);
        System.out.println(os1);
        System.out.println(os2);
    }
}
