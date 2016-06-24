package twg2.collections.interfaces;

/** A searchable collection of values
 * @author TeamworkGuy2
 * @since 2016-06-23
 */
public interface CollectionIndexOf<T> extends Sized, CollectionContains<T> {

	/** Check if the specified value is contained in this searchable group of values
	 * @param value the value to search for
	 * @return true if the value was found in this group, false if not
	 */
	@Override
	public default boolean contains(T value) {
		return this.indexOf(value) > -1;
	}


	/** Find the first index of the specified value in this group of values
	 * @param value the value to search for
	 * @return if the value is found, an index between {@code [0, }{@link #size()}{@code -1]},
	 * else -1 if the value cannot be found
	 */
	public int indexOf(T value);


	/** Find the first occurring index of the specified char in this group of elements
	 * @param value the value to search for in this list
	 * @return if the value is found, an index between {@code [0, }{@link #size()}{@code -1]}
	 * else -1 if the value cannot be found
	 */
	public int lastIndexOf(T value);
}
