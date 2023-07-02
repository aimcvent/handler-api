package fr.aimcvent.handler.api;

import org.bukkit.event.Event;

public interface HandlerCondition<E extends Event, T> {

    boolean accept(Handlers<T> handlers, E event);

}
