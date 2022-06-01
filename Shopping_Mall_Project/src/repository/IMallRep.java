package repository;

import entity.Mall;

public interface IMallRep
{
	public abstract Mall addMall(Mall mall);
	public abstract Mall updateMall(Mall mall);
	public abstract Mall searchMall(int id);
	public abstract Mall cancelMAll(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();


}
