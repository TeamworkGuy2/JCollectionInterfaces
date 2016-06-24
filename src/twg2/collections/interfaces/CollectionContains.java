package twg2.collections.interfaces;

/** A searchable collection of values
 * @author TeamworkGuy2
 * @since 2016-06-23
 */
public interface CollectionContains<T> {

	/** Check if the specified value is contained in this searchable group of values
	 * @param value the value to search for
	 * @return true if the value was found in this group, false if not
	 */
	public boolean contains(T value);

}
