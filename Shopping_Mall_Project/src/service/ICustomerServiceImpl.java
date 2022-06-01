package service;

import java.util.List;

import entity.Item;
import entity.Mall;
import entity.User;
import repository.ICustomerRep;
import repository.ICustomerRepImpl;

public class ICustomerServiceImpl implements ICustomerService
{
	//Establishing connection between Service and Repository
	private ICustomerRep dao1;
	public ICustomerServiceImpl()
	{
		dao1 = new ICustomerRepImpl();
	}
	@Override
	public List<Item> searchItem(String itemName) {
		return ((ICustomerServiceImpl) dao1).searchItem(itemName);
	}

	@Override
	public Item orderItem(Item item) {
		return ((ICustomerServiceImpl) dao1).orderItem(item);
	}

	@Override
	public Mall searchMall(int id) {
		return ((ICustomerServiceImpl) dao1).searchMall(id);
	}

	@Override
	public boolean cancelOrder(int orderId) {
		return ((ICustomerServiceImpl) dao1).cancelOrder(orderId);
	}

	@Override
	public User login(User user) {
		dao1.beginTransaction();
		((IUserServiceImpl) dao1).login(user);
		dao1.commitTransaction();
		return user;
	}

	@Override
	public boolean logOut() {
		dao1.beginTransaction();
		((IUserServiceImpl) dao1).logOut();
		dao1.commitTransaction();
		return false;
	}
	
}
