package repository;

import entity.Customer;

public interface ICustomerRep 
{
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer searchCustomer(int id);
	public void deleteCustomer(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();

}
