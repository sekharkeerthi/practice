/**
 * 
 */
package com.sk.all;

/**
 * @author Sekhar Keerthi
 * Immutable Object Creation
 *
 */
public final class ImmutableObject {
	private String name;

	public ImmutableObject(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
