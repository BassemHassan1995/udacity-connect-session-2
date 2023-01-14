package bassem.udacity.session2.ui.weight

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import bassem.udacity.session2.databinding.FragmentWeightBinding
import bassem.udacity.session2.ui.SharedViewModel

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

        observeData()

        return binding.root
    }

    private fun observeData() {
        viewModel.calculatedWeight.observe(viewLifecycleOwner) {
            if (it == -1) {
                findNavController().navigate(
                    directions = WeightFragmentDirections.actionWeightFragmentToWelcomeFragment()
                )
            }
        }
    }


}