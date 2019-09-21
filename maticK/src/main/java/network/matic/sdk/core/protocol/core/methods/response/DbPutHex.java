package network.matic.sdk.core.protocol.core.methods.response;

import network.matic.sdk.core.protocol.core.Response;

/**
 * db_putHex.
 */
public class DbPutHex extends Response<Boolean> {

    public boolean valueStored() {
        return getResult();
    }
}
