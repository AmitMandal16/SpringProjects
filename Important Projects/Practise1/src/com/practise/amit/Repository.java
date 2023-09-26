package com.practise.amit;

import java.util.Objects;

public class Repository<T> {
	
	
	public T value;

	public Repository(T value) {
		//super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Repository [value=" + value + "]";
	}

	/*
	 * @Override public int hashCode() { return Objects.hash(value); }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Repository other = (Repository) obj; return Objects.equals(value,
	 * other.value); }
	 */
	
	
	

}
