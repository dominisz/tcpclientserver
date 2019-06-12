package pl.dominisz.tcpclientserver;

public interface IShippableTask<E> {
  E execute() throws Exception;
}
