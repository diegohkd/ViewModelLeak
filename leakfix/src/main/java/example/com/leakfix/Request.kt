package example.com.leakfix

class Request(
    var callback: (() -> Unit)?
) {
    fun dispose() {
        callback = null
    }
}