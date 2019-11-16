package example.com.viewmodelleak

object Repository {

    private var requestCallback: (() -> Unit)? = null

    // simulate a network request, but in reality just sets the callback for the response
    fun performFakeRequest(callback: () -> Unit) {
        requestCallback = callback
    }

    // simulate when the network request finishes
    fun finishFakeRequest() {
        requestCallback?.invoke()
    }
}