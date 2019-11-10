package example.com.viewmodelleak.secondary

import android.util.Log
import androidx.lifecycle.ViewModel
import example.com.viewmodelleak.Repository

class SecondaryViewModel : ViewModel() {

    fun onPerformFakeRequestClicked() {
        Log.d("SecondaryViewModel", "performing request from view model $this")
        Repository.performFakeRequest {
            Log.d(
                "SecondaryViewModel",
                "finished request and executed callback on view model $this"
            )
        }
    }
}