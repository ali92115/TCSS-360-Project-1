package iss.sensors.base;

public interface ISensor<TData> {
    ISensor<TData> Start();
    TData getData();
}