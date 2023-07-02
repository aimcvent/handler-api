package fr.aimcvent.handler.api;

import fr.aimcvent.kernel.api.service.Service;

import java.util.List;

public interface HandlerService extends Service {

    HandlerDispatcher dispatcher();

    <T> Handlers<T> create(T type, HandlerCondition<?, T> condition);

    <T> Handlers<T> create(T type);

    void destroy(Handlers<?> handlers);

    List<Handlers<?>> all();

}
