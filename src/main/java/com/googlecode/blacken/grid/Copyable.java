package com.googlecode.blacken.grid;

/**
 * A base class which always implements {@link #clone()} support.
 * 
 * <p>Classes which implement this <b>must</b> <i>always</i> support
 * {@link #clone()}. Throwing {@link CloneNotSupportedException} is
 * expressly disallowed.</p>
 * 
 * @author Steven Black
 *
 */
public interface Copyable extends Cloneable {
    /**
     * create a new copy
     * 
     * <p>We require clones to be supported. A derived class disabling clones
     * is a violation of the API. As such, we can turn the 
     * CloneNotSupportedException in to a RuntimeException.</p>
     * 
     * @return new copy/cline
     */
    public Copyable copy();

    /**
     * Clone the object.
     * 
     * <p>Note that it is a violation of our API to throw 
     * <code>CloneNotSupportedException</code>s. Classes that derive from 
     * this one <b>must</b> support clone.</p>
     * 
     * @return new clone of object
     */
    public Copyable clone();
}
