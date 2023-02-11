package Code_For_Customer_Sorting;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class local<V, K> implements Map<K, V> {
	Map<K, V> myMap;
	public local(Map<K, V> myMap){
		this.myMap=myMap;
	}
	@Override
	public int size() {
		return myMap.size();
	}

	@Override
	public boolean isEmpty() {
		
		return myMap.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		
		return myMap.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		
		return myMap.containsValue(value);
	}

	@Override
	public V get(Object key) {
		
		return null;
	}

	@Override
	public V put(K key, V value) {
		
		return myMap.put(key, value);
	}

	@Override
	public V remove(Object key) {
		
		return myMap.remove(key);
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		
		myMap.putAll(m);
	}

	@Override
	public void clear() {
	
		myMap.clear();
	}

	@Override
	public Set<K> keySet() {
		
		return myMap.keySet();
	}

	@Override
	public Collection<V> values() {
	
		return myMap.values();
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
	
		return myMap.entrySet();
	}



}
