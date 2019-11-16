package example.com.leakfix

object Repository {

    private var request: Request? = null

    // simulate a network request, but in reality just sets the callback for the response
    fun performFakeRequest(callback: () -> Unit): Request =
        Request(callback).apply {
            request = this
        }

    // simulate when the network request finishes
    fun finishFakeRequest() {
        request?.callback?.invoke()
    }
}