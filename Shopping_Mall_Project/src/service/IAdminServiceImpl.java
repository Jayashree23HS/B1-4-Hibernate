package service;

import entity.Shop;
import entity.User;
import repository.IMallAdminRep;
import repository.IMallAdminRepImpl;

public  class IAdminServiceImpl implements IAdminService 
{
	//Establishing connection between Service and Repository
	private IMallAdminRep dao;
	public IAdminServiceImpl()
	{
		dao = new IMallAdminRepImpl();
	}
	//Service calls to perform CRUD operation
	@Override
	public boolean approveNewShop(Shop shop) {
		dao.beginTransaction();
		((IAdminServiceImpl) dao).approveNewShop(shop);
		dao.commitTransaction();
		return false;
	}

	@Override
	public User updateUser(User user) {
		dao.beginTransaction();
		((IAdminServiceImpl) dao).updateUser(user);
		dao.commitTransaction();
		return user;	
	}

	@Override
	public User login(User user) {
		dao.beginTransaction();
		((IAdminServiceImpl) dao).login(user);
		dao.commitTransaction();	
		return user;
	}

	@Override
	public boolean logOut() {
		dao.beginTransaction();
		((IAdminServiceImpl) dao).logOut();
		dao.commitTransaction();
		return false;
	}

}

