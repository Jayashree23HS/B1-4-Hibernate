package repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.Order;

public class IOrderRepImpl implements IOrderRep
{
	//Start JPA LifeCycle
	private EntityManager entityManager;
	public IOrderRepImpl() 
	{
		entityManager=JPAUtil.getEntityManager();
	}
	//Create operation - Repo/DAO
	@Override
	public Order addOrder(Order order) {
		entityManager.persist(order);
		return order;
	}
	//Update operation
	@Override
	public Order updateOrder(Order order) {
		entityManager.merge(order);
		return order;
	}
	//Retrieve operation
	@Override
	public Order searchOrderById(int id) {
		Order order = entityManager.find(Order.class, id);
		return order;
	}
	//Delete operation
	@Override
	public Order deleteOrder(int id) {
		Order order = entityManager.find(Order.class, id);
		entityManager.remove(order);
		return order;
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
