package com.kodewala.strings;
import java.util.Scanner;

public class EmailTemplateExample {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the User Name: ");
        String userName = scan.nextLine();

        String orderStatus;
        while (true) {
            System.out.print("Enter the Order Status (Processing / Shipped / Delivered / Cancelled / Unknown): ");
            orderStatus = scan.nextLine();

            if (orderStatus.equalsIgnoreCase("Processing") || orderStatus.equalsIgnoreCase("Shipped") || orderStatus.equalsIgnoreCase("Out for Delivery") || 
            	orderStatus.equalsIgnoreCase("Cancelled") || orderStatus.equalsIgnoreCase("Unknown")) {
                break; 
                
            } else {
                System.out.println("Invalid status! Please enter one of: Processing, Shipped, Delivered, Cancelled, Unknown.");
            }
        }

        String deliveryDate ="";
        
        if (!(orderStatus.equalsIgnoreCase("Cancelled") || orderStatus.equalsIgnoreCase("Unknown"))) {
            System.out.print("Enter the Delivery Date: ");
            deliveryDate = scan.nextLine();
        }

        StringBuilder sb = new StringBuilder("Dear ");
        sb.append(userName);

        
        if (orderStatus.equalsIgnoreCase("Cancelled")) {
            sb.append(", unfortunately your order has been Cancelled");
        } else if (orderStatus.equalsIgnoreCase("Unknown")) {
            sb.append(", we are unable to determine your order status at the moment. Please contact support.");
        } else {
            sb.append(", Your order has been received");
            sb.append(" and will be delivered by ");
            sb.append(deliveryDate);
            sb.append(" and the current order status is: ");

            if (orderStatus.equalsIgnoreCase("Processing")) {
                sb.append("Processing (We are preparing your items).");
            } else if (orderStatus.equalsIgnoreCase("Shipped")) {
                sb.append("Shipped (Your order is on the way).");
            } else if (orderStatus.equalsIgnoreCase("Out for Delivery")) {
                sb.append("Delivered (Your package has arrived).");
            }
        }

        System.out.println(sb);
    }
}
