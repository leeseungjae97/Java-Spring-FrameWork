package keyHolder.service;

import keyHolder.exception.PartException;

public interface PartInsert {
	public abstract void execute(String partName)throws PartException;
}
