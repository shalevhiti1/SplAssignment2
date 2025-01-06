package bgu.spl.mics.application.messages;

import bgu.spl.mics.Event;
import bgu.spl.mics.application.objects.TrackedObject;

import java.util.List;

public class TrackedObjectsEvent implements Event<List<TrackedObject>> {
    TrackedObject trackedObjects;

    public TrackedObjectsEvent(TrackedObject trackedObjects) {
        this.trackedObjects = trackedObjects;
    }

    public TrackedObject getTrackedObjects() {
        return trackedObjects;
    }
}