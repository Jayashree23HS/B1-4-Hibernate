package repository;

import javax.persistence.EntityManager;

import entity.Item;

public class IItemRepImpl implements IItemRep
{
	//Start JPA LifeCycle
	private EntityManager entityManager;
	public IItemRepImpl() 
	{
		entityManager=JPAUtil.getEntityManager();
	}
	//Create operation - Repo/DAO
	@Override
	public Item addItem(Item item) {
		entityManager.persist(item);
		return item;
	}
	//Update operation
	@Override
	public Item updateItem(Item item) {
		entityManager.merge(item);
		return item;
	}
	//Retrieve operation
	@Override
	public Item searchItem(int id) {
		Item item = entityManager.find(Item.class, id);
		return item;
	}
	//Delete operation
	@Override
	public void deleteItem(int id) {
		Item item = entityManager.find(Item.class, id);
		entityManager.remove(item);
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

