package co.mcsky.moecore.hook;

import cat.nyaa.nyaacore.component.ISystemBalance;
import cat.nyaa.nyaacore.component.NyaaComponent;
import co.mcsky.moecore.MoeCore;
import co.mcsky.moecore.economy.SystemAccount;

public class NyaaCoreHook {

    /**
     * Registers an {@link ISystemBalance} instance into {@link NyaaComponent}
     * so that all charges of NyaaUtils can link to the towny server account.
     */
    public static void registerNyaaComponent() {
        MoeCore.plugin.systemAccount(new SystemAccount());
        NyaaComponent.register(ISystemBalance.class, MoeCore.plugin.systemAccount().getImpl());
        MoeCore.log("NyaaCore is hooked");
    }

}
