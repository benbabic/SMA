package org.ups.sma.interfaces;

import org.ups.sma.domain.custom.agent.State;

public interface Statefull {
	public State getState();
	public State getPublicState();
}