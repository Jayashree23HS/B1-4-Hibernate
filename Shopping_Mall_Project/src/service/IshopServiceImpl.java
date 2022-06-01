package service;

import entity.Employee;
import entity.Item;
import entity.Shop;
import repository.IShopRep;
import repository.IShopRepImpl;

public class IshopServiceImpl implements IShopService
{
	//Establishing connection between Service and Repository
	private IShopRep dao4;	
	public IshopServiceImpl()
	{
		dao4 = new IShopRepImpl();
	}
	@Override
	public Shop addShop(Shop shop) {
		dao4.beginTransaction();
		dao4.addShop(shop);
		dao4.commitTransaction();
		return shop;
	}

	@Override
	public Shop updateShop(Shop shop) {
		dao4.beginTransaction();
		dao4.updateShop(shop);
		dao4.commitTransaction();
		return shop;
	}

	@Override
	public Shop searchShopById(int id) {
		Shop shop = dao4.searchShopById(id);
		return shop;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		dao4.beginTransaction();
		((IshopServiceImpl) dao4).addEmployee(employee);
		dao4.commitTransaction();
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		dao4.beginTransaction();
		((IshopServiceImpl) dao4).updateEmployee(employee);
		dao4.commitTransaction();
		return employee;
	}

	@Override
	public boolean deleteShop(int id) {
		dao4.beginTransaction();
		dao4.deleteShop(id);
		dao4.commitTransaction();
		return false;
	}

	@Override
	public Item addItem(Item item) {
		dao4.beginTransaction();
		((IshopServiceImpl) dao4).addItem(item);
		dao4.commitTransaction();
		return item;
	}

}
