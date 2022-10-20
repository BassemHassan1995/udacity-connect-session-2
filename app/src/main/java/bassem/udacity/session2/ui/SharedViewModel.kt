package bassem.udacity.session2.ui

import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    private val _navigateToWeight: MutableLiveData<Boolean> = MutableLiveData(false)
    val navigateToWeight: LiveData<Boolean> = _navigateToWeight

    val name: ObservableField<String> = ObservableField("")
    val height: ObservableInt = ObservableInt()
    val isMale: ObservableBoolean = ObservableBoolean(true)

    val calculatedWeight: ObservableInt = ObservableInt(0)

    fun onCalculateIBWButtonClicked() {
        calculatedWeight.set(calculateIdealBodyWeight(height.get(), isMale.get()))
        _navigateToWeight.value = true
    }

    private fun calculateIdealBodyWeight(userHeight: Int, isMale: Boolean): Int =
        when (isMale) {
            true -> userHeight - 100
            false -> userHeight - 105
        }

}