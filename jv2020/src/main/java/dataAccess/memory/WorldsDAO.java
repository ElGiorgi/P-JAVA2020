package dataAccess.memory;

import java.util.ArrayList;
import java.util.List;

import dataAccess.DataAccessException;
import dataAccess.OperationsDAO;
import entitys.Identifiable;
import entitys.World;

public class WorldsDAO extends IndexSortTemplate implements OperationsDAO {

	private ArrayList<Identifiable> worldsData;

	private static WorldsDAO instance;

	private WorldsDAO() {		
		this.worldsData = new ArrayList<Identifiable>();
	}

	public static WorldsDAO getInstance() {
		if (instance == null) {
			instance = new WorldsDAO();
		}
		return instance;
	}

	@Override
	public Identifiable find(String id) {
		int position = this.indexSort(this.worldsData, id);
		if (position >= 0) {
			return (World) this.worldsData.get(position);
		}
		return null;
	}

	@Override
	public List<Identifiable> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Identifiable world) throws DataAccessException {
		assert world != null;
		int insertionPos = indexSort(this.worldsData, world.getId()); 
		if (insertionPos < 0) {
			this.worldsData.add(Math.abs(insertionPos)-1, world);
			return;
		}
		throw new DataAccessException("worldsData.create: "+ world.getId() + " ya existe");	
	}

	@Override
	public Identifiable delete(String id) throws DataAccessException {
		return worldsData.remove(indexSort(worldsData,id));
	}

	@Override
	public Identifiable delete(Identifiable obj) throws DataAccessException {
		worldsData.remove(obj);	
		return obj;
	}

	@Override
	public Identifiable update(Identifiable obj) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toStringData() {
		StringBuilder result = new StringBuilder();
		worldsData.forEach(e -> result.append((World) e + "\n"));
		return result.toString();
	}

	@Override
	public String toStringIds() {
		String result = "";
		worldsData.forEach(e -> result.concat((e.getId() +"\n")));
		return result;
	}

	@Override
	public void deleteAll() {
		worldsData.clear();

	}


}
