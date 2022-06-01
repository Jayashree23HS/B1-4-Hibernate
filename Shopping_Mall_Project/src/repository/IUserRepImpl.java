package repository;

import javax.persistence.EntityManager;

import entity.User;

public class IUserRepImpl implements IUserRep
{
	//Start JPA LifeCycle
	private EntityManager entityManager;
	public IUserRepImpl() 
	{
		entityManager=JPAUtil.getEntityManager();
	}
	//Create operation - Repo/DAO
	@Override
	public User addNewUser(User user) {
		entityManager.persist(user);
		return user;
	}
	//Update operation
	@Override
	public User updateUser(User user) {
		entityManager.merge(user);
		return user;
	}
	//Delete operation
	@Override
	public void deleteUser(long id) {
		User user = entityManager.find(User.class, id);
		entityManager.remove(user);
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();	
	}

}


