package service;

import entity.User;
import repository.IUserRep;
import repository.IUserRepImpl;

public class IUserServiceImpl implements IUserService
{
	//Establishing connection between Service and Repository
	private IUserRep repository;
	
	public IUserServiceImpl()
	{
		repository = new IUserRepImpl();
	}
	
	//Service calls to perform CRUD operation
	@Override
	public User addNewUser(User user) {
		repository.beginTransaction();
		repository.addNewUser(user);
		repository.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		repository.beginTransaction();
		repository.updateUser(user);
		repository.commitTransaction();
		return user;
	}

	@Override
	public User login(User user) {
		repository.beginTransaction();
		((IUserServiceImpl) repository).login(user);
		repository.commitTransaction();
		return user;
	}

	@Override
	public boolean logOut() {
		repository.beginTransaction();
		((IUserServiceImpl) repository).logOut();
		repository.commitTransaction();
		return false;
	}


}
