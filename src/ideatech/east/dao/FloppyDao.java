package ideatech.east.dao;

import ideatech.east.bean.Floppy;

import java.util.List;

public interface FloppyDao {
	public List<Floppy> selectAllFloppy(Floppy userId);
}
