package example.com.viewmodelleak

object Repository {

    private var requestCallback: (() -> Unit)? = null
    private var listener: Listener? = null

    fun performFakeRequest(callback: () -> Unit) {
        requestCallback = callback
    }

    fun performFakeRequest(listener: Listener) {
        this.listener = listener
    }

    fun finishFakeRequest() {
        requestCallback?.invoke()
        listener?.callback()
    }
}

interface Listener{
    fun callback()
}