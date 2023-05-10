package controller;

import java.sql.SQLException;

import entity.cart.Cart;

/**
 * This class controls the flow of events when users view the Cart
 * @author nguyenlm
 */

 //Communicational Cohesion vì chúng đều sử dụng dữ liệu trong entity cart
public class ViewCartController extends BaseController{
    
    /**
     * This method checks the available products in Cart
     * @throws SQLException
     */

     /*
      * Common coupling
      * su dung bien global la cartInstance
      */
    public void checkAvailabilityOfProduct() throws SQLException{
        SessionInformation.cartInstance.checkAvailabilityOfProduct();
    }

    /**
     * This method calculates the cart subtotal
     * @return subtotal
     */

    /*
      * Common coupling
      * su dung bien global la cartInstance
      */

    public int getCartSubtotal(){
        int subtotal = SessionInformation.cartInstance.calSubtotal();
        return subtotal;
    }

}
