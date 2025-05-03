package oopsPrograms;

import java.util.Date;

/**
 * A class demonstrating immutability in Java.
 * Immutable classes cannot be modified after they are created.
 * This class ensures immutability with final fields and proper handling of mutable fields like Date.
 */
public final class ImmutableClass { // Class is declared as final to prevent inheritance
    private final Integer immutableField1; // Immutable field: cannot be modified after initialization
    private final String immutableField2;  // Immutable field: cannot be modified after initialization
    private final Date mutableField;       // Mutable field: special handling required to maintain immutability

    /**
     * Constructor for ImmutableClass.
     * Ensures that the mutable field is deeply copied to prevent external modifications.
     * 
     * @param fld1 Immutable integer field
     * @param fld2 Immutable string field
     * @param date Mutable Date field (defensively copied)
     */
    public ImmutableClass(Integer fld1, String fld2, Date date) {
        super();
        this.immutableField1 = fld1; // Direct assignment for immutable fields
        this.immutableField2 = fld2; // Direct assignment for immutable fields
        this.mutableField = new Date(date.getTime()); // Defensive copy of mutable field to maintain immutability
    }

    /**
     * Getter for immutableField1.
     * 
     * @return The value of immutableField1
     */
    public Integer getImmutableField1() {
        return immutableField1; // Returns the immutable integer field directly
    }

    /**
     * Getter for immutableField2.
     * 
     * @return The value of immutableField2
     */
    public String getImmutableField2() {
        return immutableField2; // Returns the immutable string field directly
    }

    /**
     * Getter for mutableField.
     * Ensures that the original Date object cannot be modified by returning a defensive copy.
     * 
     * @return A new Date object with the same value as mutableField
     */
    public Date getMutableField() {
        return new Date(mutableField.getTime()); // Returns a defensive copy of the mutable field
    }

    /**
     * Overridden toString method to provide a string representation of the class.
     * 
     * @return String representation of the ImmutableClass object
     */
    @Override
    public String toString() {
        return "ImmutableClass [immutableField1=" + immutableField1 + ", immutableField2=" + immutableField2
                + ", mutableField=" + mutableField + "]";
    }
    
}
