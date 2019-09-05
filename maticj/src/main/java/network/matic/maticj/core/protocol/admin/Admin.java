package network.matic.maticj.core.protocol.admin;

import network.matic.maticj.core.protocol.Web3j;
import network.matic.maticj.core.protocol.Web3jService;
import network.matic.maticj.core.protocol.admin.methods.response.NewAccountIdentifier;
import network.matic.maticj.core.protocol.admin.methods.response.PersonalListAccounts;
import network.matic.maticj.core.protocol.admin.methods.response.PersonalUnlockAccount;
import network.matic.maticj.core.protocol.core.Request;
import network.matic.maticj.core.protocol.core.methods.request.Transaction;
import network.matic.maticj.core.protocol.core.methods.response.EthSendTransaction;

import java.math.BigInteger;
import java.util.concurrent.ScheduledExecutorService;

/**
 * JSON-RPC Request object building factory for common Parity and Geth.
 */
public interface Admin extends Web3j {

    static Admin build(Web3jService web3jService) {
        return new JsonRpc2_0Admin(web3jService);
    }

    static Admin build(
            Web3jService web3jService, long pollingInterval,
            ScheduledExecutorService scheduledExecutorService) {
        return new JsonRpc2_0Admin(web3jService, pollingInterval, scheduledExecutorService);
    }

    public Request<?, PersonalListAccounts> personalListAccounts();

    public Request<?, NewAccountIdentifier> personalNewAccount(String password);

    public Request<?, PersonalUnlockAccount> personalUnlockAccount(
            String address, String passphrase, BigInteger duration);

    public Request<?, PersonalUnlockAccount> personalUnlockAccount(
            String address, String passphrase);

    public Request<?, EthSendTransaction> personalSendTransaction(
            Transaction transaction, String password);

}   
