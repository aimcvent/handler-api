package fr.aimcvent.handler.api;

import org.bukkit.event.Event;

public interface Handlers<T> {

    <E extends Event> Handlers<T> add(Class<? extends Handler<E, T>> clazz);

    Handlers<T> remove(Handler<?, T> handler);

    void emit(Event event);

    T of();

    boolean contains(Class<? extends Event> clazz);

}
