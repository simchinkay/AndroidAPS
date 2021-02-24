package info.nightscout.androidaps.plugins.pump.omnipod.dash.driver.comm.exceptions

class CouldNotConfirmWrite(private val sent: ByteArray, confirmed: ByteArray) : Exception() {

    private val confirmed: Any

    init {
        this.confirmed = confirmed
    }
}