package bassem.udacity.session2.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestViewModel : ViewModel() {

    private val list:MutableLiveData<List<String>> = MutableLiveData(emptyList())



    fun testFunction(){
    }

}