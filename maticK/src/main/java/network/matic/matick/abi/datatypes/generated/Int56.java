package network.matic.matick.abi.datatypes.generated;

import java.math.BigInteger;

import network.matic.matick.abi.datatypes.Int;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use network.matic.matick.core.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Int56 extends Int {
    public static final Int56 DEFAULT = new Int56(BigInteger.ZERO);

    public Int56(BigInteger value) {
        super(56, value);
    }

    public Int56(long value) {
        this(BigInteger.valueOf(value));
    }
}
