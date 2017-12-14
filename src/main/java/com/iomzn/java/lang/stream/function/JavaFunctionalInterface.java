package com.iomzn.java.lang.stream.function;

public class JavaFunctionalInterface {

    public static void main(String[] args) {
        // predicate
        //      T -> boolean = Predicate<T>
        // (T, U) -> boolean = BiPredicate<T, U>
        //    int -> boolean = IntPredicate
        //   long -> boolean = LongPredicate
        // double -> boolean = DoublePredicate

        // function
        //      T -> R      = Function<T, R>
        // (T, U) -> R      = BiFunction<T, U, R>
        //    int -> R      = IntFunction<R>
        //   long -> R      = LongFunction<R>
        // double -> R      = DoubleFunction<R>
        //    int -> long   = IntToLongFunction
        //    int -> double = IntToDoubleFunction
        //   long -> int    = LongToIntFunction
        //   long -> double = LongToDoubleFunction
        // double -> int    = DoubleToIntFunction
        // double -> long   = DoubleToLongFunction
        //      T -> int    = ToIntFunction<T>
        //      T -> long   = ToLongFunction<T>
        //      T -> double = ToDoubleFunction<T>
        // (T, U) -> int    = ToIntBiFunction<T, U>
        // (T, U) -> long   = ToLongBiFunction<T, U>
        // (T, U) -> double = ToDoubleBiFunction<T, U>

        // supplier
        // void -> T       = Supplier<T>
        // void -> int     = IntSupplier
        // void -> long    = LongSupplier
        // void -> double  = DoubleSupplier
        // void -> boolean = BooleanSupplier

        // consumer
        //           T -> void = Consumer<T>
        //      (T, U) -> void = BiConsumer<T, U>
        //         int -> void = IntConsumer
        //        long -> void = LongConsumer
        //      double -> void = DoubleConsumer
        //    (T, int) -> void = ObjIntConsumer<T>
        //   (T, long) -> void = ObjLongConsumer<T>
        // (T, double) -> void = ObjDoubleConsumer<T>

        // unary operator
        //      T -> T      = UnaryOperator<T>
        //    int -> int    = IntUnaryOperator
        //   long -> long   = LongUnaryOperator
        // double -> double = DoubleUnaryOperator

        // binary operator
        //           (T, T) -> T      = BinaryOperator<T>
        //       (int, int) -> int    = IntBinaryOperator
        //     (long, long) -> long   = LongBinaryOperator
        // (double, double) -> double = DoubleBinaryOperator
    }
}
