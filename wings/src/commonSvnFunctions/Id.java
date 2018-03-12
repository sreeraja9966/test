package commonSvnFunctions;

import java.io.Serializable;

public interface Id extends Serializable, Comparable<Id> {

	public abstract String getAsString();

	public abstract Object getValue();
}
