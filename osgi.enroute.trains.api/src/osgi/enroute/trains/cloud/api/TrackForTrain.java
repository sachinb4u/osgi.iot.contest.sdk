package osgi.enroute.trains.cloud.api;

/**
 * Defines the interface for a train manager running on the Train Pi
 */
public interface TrackForTrain extends TrackInfo {

	/**
	 * The given train requests access to the toSegment, it assumes it is on the
	 * fromSegment. You can only request access for one segment.
	 * 
	 * @param train
	 *            the train id
	 * @param fromSegment
	 *            the id of the from segment
	 * @param toSegment
	 *            the id of the requested segment
	 * @return true if granted,otherwise false. This function can wait up to 1
	 *         minute.
	 */
	boolean requestAccessTo(String train, String fromSegment, String toSegment);

	/**
	 * Tell the track about this train
	 * 
	 * @param name
	 * 			the train name
	 * @param rfid
	 * 			the train rfid
	 */ 
	void registerTrain(String name, String rfid);
}
