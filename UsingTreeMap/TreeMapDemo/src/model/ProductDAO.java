package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ProductDAO {
	TreeMap<String, Product> products;
	public ProductDAO()
	{
		products=new TreeMap<String, Product>();
		
		//Check if file exists
		File f=new File("d:\\jag\\Aktar.dat");
		if(!f.exists())
		{
		//If not (1st time), create an empty collection
		//and write OBject to the file
			writeToFile();
			
		}else{
		//If file exists
			try {
				ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));
				products= (TreeMap<String, Product>) ois.readObject();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private void writeToFile() {
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("d:\\jag\\Aktar.dat"));
			oos.writeObject(products);
			oos.flush();
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String generateProductId(String lastkey)
	{
		String str=lastkey;
		//System.out.println(str.substring(1, 4));
		int id=Integer.parseInt(str.substring(1, 4));
		id++;
		//System.out.println(id);
		String newPid="";
		if(id<10)
			newPid="P00"+id;
		else if(id<100)
			newPid="P0"+id;
		else if(id<1000)
			newPid="P"+id;
		return newPid;
	}
	public Product acceptDetails(Product product)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Product Name:");
		product.setProductName(sc.nextLine());
		System.out.println("Product Description:");
		product.setProductDescription(sc.nextLine());
		System.out.println("Price:");
		product.setPrice(Float.parseFloat(sc.nextLine()));
		System.out.println("Stock:");
		product.setStock(Integer.parseInt(sc.nextLine()));
		return product;
	}
	
	public void addProduct1(Product product)
	{
		String productId="";
		try{
		//generate Product Id
				
		String lastkey=products.lastKey();
		productId=generateProductId(lastkey);
		//System.out.println("jag:"+lastkey);
		}catch(NoSuchElementException nsee)
		{
			//System.out.println("First Product");
			productId="P001";
		}
		product.setProductId(productId);
		products.put(productId, product);
		writeToFile();
	}
	
	public void addProduct(){
		String productId="";
		try{
		//generate Product Id
				
		String lastkey=products.lastKey();
		productId=generateProductId(lastkey);
		//System.out.println("jag:"+lastkey);
		}catch(NoSuchElementException nsee)
		{
			//System.out.println("First Product");
			productId="P001";
		}
		//Create a new object of Product
		Product product=new Product();
		product.setProductId(productId);
		product=acceptDetails(product);
		//set the properties with the values
		//Add this object to the collection
		products.put(productId, product);
		writeToFile();
	}
	public Product findProductById(String pid){
		Product product=null;
		if(products.containsKey(pid))
		{
			product=products.get(pid);
		}
		return product;
	}
	public Set<String> getAllProductIDs()
	{
		Set<String> keys=products.keySet();
		return keys;
	}
	public void getAllProducts(){
		
	}
	public void removeProduct(){
		
	}
	public void modifyProduct(){
		//Get Product Id from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product Id that you want to modify.");
		String productId=sc.nextLine();
		//Check if it exists!
		if(products.containsKey(productId))
		{
			//If exists, update
			Product product=new Product();
			product.setProductId(productId);
			product=acceptDetails(product);
			products.put(productId, product);			
		}else
		{		
		//If not exists, inform the user that it doesn't exist
			System.out.println("Sorry. No records found...");
		}
	}
}
