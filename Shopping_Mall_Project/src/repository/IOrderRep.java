package repository;

import javax.persistence.criteria.Order;

public interface IOrderRep
{
	public abstract Order addOrder(Order order);
	public abstract Order updateOrder(Order order);
	public abstract Order searchOrderById(int id);
	public abstract Order deleteOrder(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();

}