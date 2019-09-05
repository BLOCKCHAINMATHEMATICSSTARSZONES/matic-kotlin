package network.matic.maticj.core.tx;

import network.matic.maticj.core.protocol.Web3j;
import network.matic.maticj.core.protocol.core.DefaultBlockParameter;
import network.matic.maticj.core.protocol.core.methods.response.EthSendTransaction;

import java.io.IOException;
import java.math.BigInteger;

/**
 * Transaction manager implementation for read-only operations on smart contracts.
 */
public class ReadonlyTransactionManager extends TransactionManager {

    public ReadonlyTransactionManager(Web3j web3j, String fromAddress) {
        super(web3j, fromAddress);
    }

    @Override
    public EthSendTransaction sendTransaction(
            BigInteger gasPrice, BigInteger gasLimit, String to, String data, BigInteger value)
            throws IOException {
        throw new UnsupportedOperationException(
                "Only read operations are supported by this transaction manager");
    }

    @Override
    public String sendCall(String to, String data, DefaultBlockParameter defaultBlockParameter)
            throws IOException {
        throw new UnsupportedOperationException("Not implemented");
    }
}
