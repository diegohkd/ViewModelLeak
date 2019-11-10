package example.com.viewmodelleak

object Repository {

    private var requestCallback: (() -> Unit)? = null

    fun performFakeRequest(callback: () -> Unit) {
        requestCallback = callback
    }

    fun finishFakeRequest() {
        requestCallback?.invoke()
    }
}