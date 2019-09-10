package network.matic.matick.abi.datatypes.generated;

import java.util.List;

import network.matic.matick.abi.datatypes.StaticArray;
import network.matic.matick.abi.datatypes.Type;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use network.matic.matick.core.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class StaticArray10<T extends Type> extends StaticArray<T> {
    @Deprecated
    public StaticArray10(List<T> values) {
        super(10, values);
    }

    @Deprecated
    @SafeVarargs
    public StaticArray10(T... values) {
        super(10, values);
    }

    public StaticArray10(Class<T> type, List<T> values) {
        super(type, 10, values);
    }

    @SafeVarargs
    public StaticArray10(Class<T> type, T... values) {
        super(type, 10, values);
    }
}
