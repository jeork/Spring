package com.oj.jul092.error;

import java.util.List;

public interface errorMapper {
	
	public abstract List<Error> getError();
	public abstract List<Error> searchError(Error e);
}
