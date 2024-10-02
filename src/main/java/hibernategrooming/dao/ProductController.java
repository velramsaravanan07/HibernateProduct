//package hibernategrooming.dao;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//import hibernategrooming.dto.Product;
//import hibernategrooming.dto.SubProduct;
//
//public class Controller {
//	
//	Scanner sc = new Scanner(System.in);
//	
//	Dao dao = new Dao();
//	
//	
//	public void saveProduct() {
//		Product p = new Product();;
//		System.out.println("enter product category");
//		p.setProductCategory(sc.next());
//		System.out.println("enter product description");
//		p.setProductDescription(sc.next());
//		List<SubProduct> subproducts = new ArrayList<SubProduct>();
//		p.setSubProducts(subproducts);
//		if(dao.saveProduct(p)!=null) {
//			System.out.println("product save successfull");
//		}else {
//			System.out.println("---------failure--------");
//
//		}
//	}
//	
//	public void findProduct() {
//		System.out.println("enter the product id");
//		int id = sc.nextInt();
//		Product p = dao.findProduct(id);
//		if(p!=null) {
//			System.out.println(p.getProductId()+" "+p.getProductCategory()+" "+p.getProductDescription());
//		}else {
//			System.out.println("---------failure--------");
//
//		}
//		
//	}
//	
//	public void deleteProduct() {
//		System.out.println("enter the id of the product you want to delete");
//		int id = sc.nextInt();
//		Product p = dao.findProduct(id);
//		if(p!=null) {
//			dao.deleteproduct(id);
//			System.out.println("product delete success");
//		}else {
//			System.out.println("---------failure--------");
//
//		}
//	}
//	
//	public void findAllProduct() {
//		List<Product> allProducts = dao.getAllProducts();
//		for(Product p : allProducts) {
//			System.out.println("id"+"      "+"category"+"    "+"description");
//			System.out.println(p.getProductId()+"   "+p.getProductCategory()+"  "+p.getProductDescription());
//		}
//	}
//	
//	public Product updateProduct() {
//		
//		List<Product> products = dao.getAllProducts();
//		for(Product p : products) {
//			System.out.println(p.getProductId()+"      "+p.getProductCategory());
//		}
//		
//		System.out.println("enter the id of the product you want to update");
//		int id = sc.nextInt();
//		Product p = dao.findProduct(id);
//		System.out.println("choose your options");
//		System.out.println("1 : ------> update category");
//		System.out.println("2 : ------> update description");
//		int choice = sc.nextInt();
//		if(choice==1) {
//			System.out.println("enter the updated category");
//			p.setProductCategory(sc.next());
//			return  dao.updateProduct(p, id);
//		}
//		if(choice==2) {
//			System.out.println("enter the updated description");
//			p.setProductDescription(sc.next());
//			return  dao.updateProduct(p, id);
//		}
//		return p;
//	}
//	
//	public void saveSubProduct() {
//		
//		List<Product> products = dao.getAllProducts();
//		for(Product p : products) {
//			System.out.println(p.getProductId()+"      "+p.getProductCategory());
//		}
//		
//		System.out.println("enter the product id to which you want to add the sub product");
//		int id = sc.nextInt();
//		Product p = dao.findProduct(id);
//		
//		SubProduct sub = new SubProduct();
//		System.out.println("enter the sub product brand");
//		sub.setSubProductBrand(sc.next());
//		System.out.println("enter the sub product price");
//		sub.setSubProductPrice(sc.nextDouble());
//		sub.setProduct(p);
//
//		p.getSubProducts().add(sub);
//		
//		
//		
//
//		
//		if(p!=null) {
//			dao.saveSubProduct(sub);
//			Product subdate = dao.updateProduct(p, id);
//			System.out.println("sub product save success");
//		}
//		
//		else {
//			System.out.println("---------failure--------");
//
//		}
//		
//		
//	}
//	
//	public void findAllSubProducts() {
//		List<Product> products = dao.getAllProducts();
//		for(Product p : products) {
//			System.out.println(p.getProductId()+"      "+p.getProductCategory());
//		}
//		
//		System.out.println("enter the product id to display all the products");
//		int id = sc.nextInt();
//		Product p = dao.findProduct(id);
//		for(SubProduct sp : p.getSubProducts()) {
//			System.out.println(sp.getSubProduductId()+"  "+sp.getSubProductBrand()+"  "+sp.getSubProductPrice());
//		}	
//	}
//	
//	public void deleteSubProduct() {
//		List<Product> products = dao.getAllProducts();
//		for(Product p : products) {
//			System.out.println(p.getProductId()+"      "+p.getProductCategory());
//		}
//		
//		System.out.println("enter the product id from where you want to delete a subproduct");
//		int id = sc.nextInt();
//		Product p = dao.findProduct(id);
//		
//		for(SubProduct sp : p.getSubProducts()) {
//			System.out.println(sp.getSubProduductId()+"  "+sp.getSubProductBrand()+"  "+sp.getSubProductPrice());
//		}
//		
//		System.out.println(" enter the sub product ID you want to delete");
//		
//		int subid = sc.nextInt();
//		SubProduct subproducttobedeleted = dao.findSubProduct(subid);
//		
//		p.getSubProducts().remove(subproducttobedeleted);
//		subproducttobedeleted.setProduct(null);
//		
//		dao.updateProduct(p, id);
//		dao.deletesubProduct(subid);
//	
//	}
//	
//	public void updateSubProduct() {
//		List<Product> products = dao.getAllProducts();
//		for(Product p : products) {
//			System.out.println(p.getProductId()+"      "+p.getProductCategory());
//		}
//		
//		System.out.println("enter the product id from where you want to delete a subproduct");
//		int id = sc.nextInt();
//		Product p = dao.findProduct(id);
//		
//		for(SubProduct sp : p.getSubProducts()) {
//			System.out.println(sp.getSubProduductId()+"  "+sp.getSubProductBrand()+"  "+sp.getSubProductPrice());
//		}
//		
//		System.out.println(" enter the sub product ID you want to update");
//		int subid = sc.nextInt();
//		SubProduct subproducttobeupdated = dao.findSubProduct(subid);
//		
//		System.out.println("choose your options");
//		System.out.println("1 : ------> update brand");
//		System.out.println("2 : ------> update price");
//		int choice = sc.nextInt();
//		if(choice==1) {
//			System.out.println("enter the updated brand");
//			subproducttobeupdated.setSubProductBrand(sc.next());
//			dao.updateSubProduct(subproducttobeupdated, subid);
//		}
//		if(choice==2) {
//			System.out.println("enter the updated price");
//			subproducttobeupdated.setSubProductPrice(sc.nextDouble());
//			dao.updateSubProduct(subproducttobeupdated, subid);
//		}
//		else {
//			System.out.println("---------failure--------");
//
//		}
//	}	
//}

package hibernategrooming.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hibernategrooming.dto.Product;
import hibernategrooming.dto.SubProduct;

public class ProductController {
    
    Scanner sc = new Scanner(System.in);
    
    ProductDao dao = new ProductDao();
    
    public void addProduct() {
        Product product = new Product();
        System.out.println("Enter product category:");
        product.setProductCategory(sc.next());
        System.out.println("Enter product description:");
        product.setProductDescription(sc.next());
        List<SubProduct> subproducts = new ArrayList<>();
        product.setSubProducts(subproducts);
        if(dao.saveProduct(product) != null) {
            System.out.println("Product saved successfully.");
        } else {
            System.out.println("---------Failure---------");
        }
    }
    
    public void getProduct() {
        System.out.println("Enter the product ID:");
        int id = sc.nextInt();
        Product product = dao.findProduct(id);
        if(product != null) {
            System.out.println(product.getProductId() + " " + product.getProductCategory() + " " + product.getProductDescription());
        } else {
            System.out.println("---------Failure---------");
        }
    }
    
    public void removeProduct() {
        System.out.println("Enter the product ID to delete:");
        int id = sc.nextInt();
        Product product = dao.findProduct(id);
        if(product != null) {
            dao.deleteproduct(id);
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("---------Failure---------");
        }
    }
    
    public void listAllProducts() {
        List<Product> allProducts = dao.getAllProducts();
        for(Product product : allProducts) {
            System.out.println("ID     Category     Description");
            System.out.println(product.getProductId() + "   " + product.getProductCategory() + "  " + product.getProductDescription());
        }
    }
    
    public void modifyProduct() {
        List<Product> products = dao.getAllProducts();
        for(Product product : products) {
            System.out.println(product.getProductId() + "      " + product.getProductCategory());
        }
        
        System.out.println("Enter the product ID to update:");
        int id = sc.nextInt();
        Product product = dao.findProduct(id);
        System.out.println("Choose your option:");
        System.out.println("1 : Update category");
        System.out.println("2 : Update description");
        int choice = sc.nextInt();
        if(choice == 1) {
            System.out.println("Enter the updated category:");
            product.setProductCategory(sc.next());
            dao.updateProduct(product, id);
        }
        if(choice == 2) {
            System.out.println("Enter the updated description:");
            product.setProductDescription(sc.next());
            dao.updateProduct(product, id);
        }
    }
    
    public void addSubProduct() {
        List<Product> products = dao.getAllProducts();
        for(Product product : products) {
            System.out.println(product.getProductId() + "      " + product.getProductCategory());
        }
        
        System.out.println("Enter the product ID to which you want to add the sub product:");
        int id = sc.nextInt();
        Product product = dao.findProduct(id);
        
        SubProduct subProduct = new SubProduct();
        System.out.println("Enter the sub product brand:");
        subProduct.setSubProductBrand(sc.next());
        System.out.println("Enter the sub product price:");
        subProduct.setSubProductPrice(sc.nextDouble());
        subProduct.setProduct(product);
        
        product.getSubProducts().add(subProduct);
        dao.saveSubProduct(subProduct);
       Product updated= dao.updateProduct(product, id);
        if(updated != null) {
      
            System.out.println("Sub product saved successfully.");
        } else {
            System.out.println("---------Failure---------");
        }
    }
    
    public void listAllSubProducts() {
        List<Product> products = dao.getAllProducts();
        for(Product product : products) {
            System.out.println(product.getProductId() + "      " + product.getProductCategory());
        }
        
        System.out.println("Enter the product ID to display all sub products:");
        int id = sc.nextInt();
        Product product = dao.findProduct(id);
        for(SubProduct subProduct : product.getSubProducts()) {
            System.out.println(subProduct.getSubProduductId() + "  " + subProduct.getSubProductBrand() + "  " + subProduct.getSubProductPrice());
        }    
    }
    
    public void removeSubProduct() {
        List<Product> products = dao.getAllProducts();
        for(Product product : products) {
            System.out.println(product.getProductId() + "      " + product.getProductCategory());
        }
        
        System.out.println("Enter the product ID from which you want to delete a sub product:");
        int id = sc.nextInt();
        Product product = dao.findProduct(id);
        
        for(SubProduct subProduct : product.getSubProducts()) {
            System.out.println(subProduct.getSubProduductId() + "  " + subProduct.getSubProductBrand() + "  " + subProduct.getSubProductPrice());
        }
        
        System.out.println("Enter the sub product ID you want to delete:");
        int subId = sc.nextInt();
        SubProduct subProductToBeDeleted = dao.findSubProduct(subId);
        
        product.getSubProducts().remove(subProductToBeDeleted);
        subProductToBeDeleted.setProduct(null);
        
        dao.updateProduct(product, id);
        dao.deleteproduct(subId);
    }
    
    public void modifySubProduct() {
        List<Product> products = dao.getAllProducts();
        for(Product product : products) {
            System.out.println(product.getProductId() + "      " + product.getProductCategory());
        }
        
        System.out.println("Enter the product ID from which you want to update a sub product:");
        int productId = sc.nextInt();
        Product product = dao.findProduct(productId);
        
        for(SubProduct subProduct : product.getSubProducts()) {
            System.out.println(subProduct.getSubProduductId() + "  " + subProduct.getSubProductBrand() + "  " + subProduct.getSubProductPrice());
        }
        
        System.out.println("Enter the sub product ID you want to update:");
        int subProductId = sc.nextInt();
        SubProduct subProductToBeUpdated = dao.findSubProduct(subProductId);
        
        System.out.println("Choose your option:");
        System.out.println("1 : Update brand");
        System.out.println("2 : Update price");
        int choice = sc.nextInt();
        
        if(choice == 1) {
            System.out.println("Enter the updated brand:");
            subProductToBeUpdated.setSubProductBrand(sc.next());
            dao.updateSubProduct(subProductToBeUpdated, subProductId);
            System.out.println("---------Successfully Updated---------");
        } else if(choice == 2) {
            System.out.println("Enter the updated price:");
            subProductToBeUpdated.setSubProductPrice(sc.nextDouble());
            dao.updateSubProduct(subProductToBeUpdated, subProductId);
            System.out.println("---------Successfully Updated---------");
        }
        else {
        System.out.println("---------faliure---------");
        }
    }

    }


