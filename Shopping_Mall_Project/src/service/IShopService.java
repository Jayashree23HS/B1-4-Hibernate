package service;

import entity.Employee;
import entity.Item;
import entity.Shop;

public interface IShopService{
	
	public abstract Shop addShop(Shop shop);
	public abstract Shop updateShop(Shop shop);
	public abstract Shop searchShopById(int id);
	public abstract Employee addEmployee(Employee employee);
	public abstract Employee updateEmployee(Employee employee);
	public abstract boolean deleteShop(int id);
	public abstract Item addItem(Item item);	
	

}

