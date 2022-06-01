package service;

import entity.Shop;
import entity.User;

public interface IAdminService 
{
	public abstract boolean approveNewShop(Shop shop);
	public abstract User updateUser(User user);
	public abstract User login(User user);
	public abstract boolean logOut();

}
