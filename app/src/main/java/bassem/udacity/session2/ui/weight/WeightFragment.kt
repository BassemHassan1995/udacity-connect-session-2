package bassem.udacity.session2.ui.weight

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import bassem.udacity.session2.databinding.FragmentWeightBinding
import bassem.udacity.session2.ui.SharedViewModel
import bassem.udacity.session2.ui.input.InputFragmentDirections

class WeightFragment : Fragment() {

    private lateinit var binding: FragmentWeightBinding
    private val viewModel by activityViewModels<SharedViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWeightBinding.inflate(inflater)
        binding.viewModel = viewModel

        return binding.root
    }
}