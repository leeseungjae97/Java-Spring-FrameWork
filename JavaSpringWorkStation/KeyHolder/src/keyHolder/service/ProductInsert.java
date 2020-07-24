package keyHolder.service;

import keyHolder.exception.ProductException;

public interface ProductInsert {
	void execute(String name, int price,int partId)throws ProductException;
}
