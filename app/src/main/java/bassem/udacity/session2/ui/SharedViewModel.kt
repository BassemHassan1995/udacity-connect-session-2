package bassem.udacity.session2.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import bassem.udacity.session2.User

class SharedViewModel : ViewModel() {

    private val _user: MutableLiveData<User> = MutableLiveData(User())
    val user: LiveData<User> = _user

    private val _calculatedWeight: MutableLiveData<Int> = MutableLiveData(0)
    val calculatedWeight: LiveData<Int> = _calculatedWeight

    fun onCalculateIBWButtonClicked() {
        user.value?.let {
            _calculatedWeight.value = calculateIdealBodyWeight(it.height?: 100, it.isMale)
        }
    }

    fun onNewCalculationButtonClicked() {
        resetValues()
    }

    private fun calculateIdealBodyWeight(userHeight: Int, isMale: Boolean): Int =
        when (isMale) {
            true -> userHeight - 100
            false -> userHeight - 105
        }

    private fun resetValues() {
        _calculatedWeight.value = -1
        _user.value = User()
    }

}