package example.com.leakfix

object Repository {

    private var request: Request? = null

    fun performFakeRequest(callback: () -> Unit): Request =
        Request(callback).apply {
            request = this
        }

    fun finishFakeRequest() {
        request?.callback?.invoke()
    }
}