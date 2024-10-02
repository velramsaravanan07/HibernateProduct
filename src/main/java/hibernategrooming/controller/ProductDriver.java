//package hibernategrooming.controller;
//
//import java.util.Scanner;
//
//import hibernategrooming.dao.Controller;
//
//public class Driver {
//
//	public static void main(String[] args) {
//
//		
//		
//		boolean b = true;
//
//		while (b) {
//		
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("<--------------- Welcome ------------>");
//
//			System.out.println("1 -----> create product");
//			System.out.println("2 -----> find all product");
//			System.out.println("3 -----> find product");
//			System.out.println("4 -----> update product");
//			System.out.println("5 -----> delete product");
//			System.out.println("6 -----> create SubPRoduct");
//			System.out.println("7 -----> find subProducts");
//			System.out.println("8 -----> delete sub products");
//			System.out.println("9 -----> exit the application");
//
//			System.out.println("enter the options from above");
//
//			int op = sc.nextInt();
//
//			Controller c = new Controller();
//
//			switch (op) {
//			case 1:
//				c.saveProduct();
//				break;
//				
//			case 2:
//				c.findAllProduct();
//				break;
//				
//			case 3:
//				c.findProduct();
//				break;
//				
//			case 4:
//				c.updateProduct();
//				break;
//				
//			case 5:
//				c.deleteProduct();
//				break;
//				
//			case 6:
//				c.saveSubProduct();
//				break;
//				
//			case 7:
//				c.findAllSubProducts();
//				break;
//				
//			case 8:
//				c.deleteSubProduct();
//				break;
//				
//			case 9:
//				System.out.println("<---------------- Bye Bye ------------>");
//				b=false;
//				break;
//
//			default:
//				System.out.println("<---------------- invalid input ------------>");
//
//				break;
//			}
//
//		}
//
//	}
//
//}
package hibernategrooming.controller;

import java.util.Scanner;

import hibernategrooming.dao.ProductController;

public class ProductDriver {

    public static void main(String[] args) {

        boolean isRunning = true;

        while (isRunning) {

            Scanner sc = new Scanner(System.in);

            System.out.println("<--------------- Welcome ------------>");

            System.out.println("1 -----> Create Product");
            System.out.println("2 -----> List all Products");
            System.out.println("3 -----> Find Product");
            System.out.println("4 -----> Update Product");
            System.out.println("5 -----> Delete Product");
            System.out.println("6 -----> Create Sub-Poduct");
            System.out.println("7 -----> List Sub-Poduct");
            System.out.println("8 -----> Delete Sub-Poduct");
            System.out.println("9------> Update Sub-Poduct");
            System.out.println("10 -----> Exit the application");

            System.out.println("Enter an option from above:");

            int option = sc.nextInt();

            ProductController controller = new ProductController();

            switch (option) {
                case 1:
                    controller.addProduct();
                    break;

                case 2:
                    controller.listAllProducts();
                    break;

                case 3:
                    controller.getProduct();
                    break;

                case 4:
                    controller.modifyProduct();
                    break;

                case 5:
                    controller.removeProduct();
                    break;

                case 6:
                    controller.addSubProduct();
                    break;

                case 7:
                    controller.listAllSubProducts();
                    break;

                case 8:
                    controller.removeSubProduct();
                    break;
                    
                case 9:
                	controller.modifySubProduct();
                	break;
                
                case 10:
                    System.out.println("<---------------- Bye Bye ------------>");
                    isRunning = false;
                    break;

                default:
                    System.out.println("<---------------- Invalid input ------------>");
                    break;
            }
        }
    }
}
