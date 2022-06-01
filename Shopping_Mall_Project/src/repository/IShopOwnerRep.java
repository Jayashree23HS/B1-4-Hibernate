package repository;

import entity.ShopOwner;

public interface IShopOwnerRep 
{
	public ShopOwner addShopOwner(ShopOwner shopOwner);
	public ShopOwner updateShopOwner(ShopOwner shopOwner);
	public ShopOwner searchShopOwner(int id);
	public ShopOwner deleteShopOwner(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();


}
