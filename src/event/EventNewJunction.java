package event;

import error.RoadMapException;
import logic.Junction;
import logic.RoadMap;
import util.RoadParser;

import java.util.List;

public class EventNewJunction extends Event {
    protected String id;

    public EventNewJunction(int time, String id) {
        super(time);
        this.id = id;
    }
    @Override
    public void execute(RoadMap map) throws RoadMapException {
        Junction junction = new Junction(this.id);
        map.addJunction(this.id, junction);
    }
    @Override
    public String toString() {
        return time + id; // Por completar
    }
}