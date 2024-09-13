package com.joeunseo.hotel.pattern.proxy;


import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.stereotype.Component;


@Component
public class MainProxy {

    public static Consumer<String> print = System.out::print;
	public static Function<Object, String> string = String :: valueOf;
	public static Function<String, Integer> integer = Integer :: valueOf;
	public static Function<String, Object> intO = Integer :: valueOf;
	public static BiPredicate<String, String> equals = String :: equals;
	public static BiFunction<Integer, Integer, Integer> random =(t,u)->(int)(Math.random()*(u-t))+t;
	public static Function<Integer, int[]> intArr = int[] :: new;
	public static Supplier<LocalDate> today = () -> LocalDate.now();
	public static Supplier<LocalTime> time = () -> LocalTime.now();
	public static BiFunction<String,String, File> mkDir = File::new;
	public static BiFunction<File,String, File> mkFile = File::new;
	public static BiFunction<String, String, Integer> mySkip = (t,u) -> (integer.apply(t)-1) * integer.apply(u);
	//public static Function<Pagination, Pagination> mkPage = t -> { }
    
}
