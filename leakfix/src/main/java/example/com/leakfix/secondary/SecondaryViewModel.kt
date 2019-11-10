package example.com.leakfix.secondary

import android.util.Log
import androidx.lifecycle.ViewModel
import example.com.leakfix.Repository
import example.com.leakfix.Request

class SecondaryViewModel : ViewModel() {

    var request: Request? = null

    fun onPerformFakeRequestClicked() {
        Log.d("SecondaryViewModel", "performing request from view model $this")
        request = Repository.performFakeRequest {
            Log.d(
                "SecondaryViewModel", "finished request and executed callback on view model $this"
            )
        }
    }

    override fun onCleared() {
        super.onCleared()
        request?.dispose()
    }
}