package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class FujicoinMain extends BitFamily {
    private FujicoinMain() {
        id = "fujicoin.main";

        addressHeader = 36;
        p2shHeader = 16;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 164;

        name = "Fujicoin";
        symbol = "FJC";
        uriScheme = "fujicoin";
        bip44Index = 75;
        unitExponent = 8;
        feeValue = value(100000); // 0.001 FJC
        minNonDust = value(1000); // 0.00001 FJC mininput
        softDustLimit = value(100000); // 0.001 FJC
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("FujiCoin Signed Message:\n");
    }

    private static FujicoinMain instance = new FujicoinMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
