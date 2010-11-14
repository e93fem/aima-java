package aimax.osm.data;

/**
 * Provides map data change information to interested listeners.
 * @author Ruediger Lunde
 */
public class MapDataEvent {
	MapDataStorage source;
	Type type;
	long objId;
	
	public MapDataEvent(MapDataStorage source, Type type) {
		this.source = source;
		this.type = type;
		objId = -1;
	}
	
	public MapDataEvent(MapDataStorage source, Type type, long objId) {
		this.source = source;
		this.type = type;
		this.objId = objId;
	}
	
	public MapDataStorage getSource() {
		return source;
	}
	
	public Type getType() {
		return type;
	}
	
	public long getObjId() {
		return objId;
	}
	
	/** Describes the kind of change. */
	public enum Type {
		MAP_NEW, MAP_MODIFIED, MARK_ADDED, MARK_REMOVED, TRACK_MODIFIED, MAP_CLEARED;
	}
}
