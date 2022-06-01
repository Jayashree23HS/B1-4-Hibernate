package repository;

import entity.Shop;

public interface IShopRep 
{
	public abstract Shop addShop(Shop shop);
	public abstract Shop updateShop(Shop shop);
	public abstract Shop searchShopById(int id);
	public abstract Shop deleteShop(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();

}
