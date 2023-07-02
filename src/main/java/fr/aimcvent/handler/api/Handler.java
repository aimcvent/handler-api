package fr.aimcvent.handler.api;

import org.bukkit.event.Event;

public interface Handler<E extends Event, T> {

    Class<E> type();

    Handlers<T> handlers();

    void handle(E event);

    HandlerCondition<E, T> condition();

}
